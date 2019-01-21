/**
 * JTouchBar
 *
 * Copyright (c) 2018 thizzer.com
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 *
 * @author  	M. ten Veldhuis
 */
package com.thizzer.jtouchbar.swt;

import static org.junit.Assert.assertNotNull;

import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.thizzer.jtouchbar.JTouchBar;
import com.thizzer.jtouchbar.JTouchBarTestUtils;
import com.thizzer.jtouchbar.item.TouchBarItem;
import com.thizzer.jtouchbar.item.view.TouchBarButton;

@Ignore
public class JTouchBarSWTTest {

	@Before
	public void setup() {
		Display.getDefault();
	}
	
	public static JTouchBar constructTouchBar() {
		JTouchBar jTouchBar = new JTouchBar();
        jTouchBar.setCustomizationIdentifier(JTouchBarTestUtils.class.getName());
        
		// flexible space
		jTouchBar.getItems().add( new TouchBarItem( TouchBarItem.NSTouchBarItemIdentifierFlexibleSpace ) );
		
		// button
		TouchBarItem touchBarButtonItem = new TouchBarItem("T1");
		touchBarButtonItem.setCustomizationAllowed(true);
		
		TouchBarButton touchBarButton = new TouchBarButton();
		touchBarButton.setTitle("Button");
		touchBarButtonItem.setView(touchBarButton);
        
		jTouchBar.getItems().add( touchBarButtonItem );
		
        return jTouchBar;
	}
	
	@Test
	public void test() {
		JTouchBar jTouchBar = constructTouchBar();
		assertNotNull(jTouchBar);
		
		Display display = Display.getCurrent();

        Shell shell = new Shell(display);
        shell.setLayout(new FillLayout());

        shell.open();
        
        JTouchBarSWTUtils.show(jTouchBar, shell);
        
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
                break;
            }
        }
        
        display.dispose();
	}

}
