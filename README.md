[![Build Status](https://travis-ci.com/Thizzer/jtouchbar-swt.svg?branch=master)](https://travis-ci.com/Thizzer/jtouchbar-swt)

# jtouchbar-swt

Library adding convenience utils for adding SWT support to [JTouchBar](https://github.com/thizzer/jtouchbar)

## Support the Developers!

Please take a look at the other stuff the developers are working on and support them in other ways.

* [ttveldhuis](https://github.com/ttveldhuis)
  * Buy ttveldhuis a coffee - https://ko-fi.com/ttveldhuis
  * Patreon Page - https://www.patreon.com/ttveldhuis  
  * Blog - https://www.thizzer.com

### Maven

```xml
<dependency>
	<groupId>com.thizzer.jtouchbar</groupId>
	<artifactId>jtouchbar-swt</artifactId>
	<version>1.0.1-SNAPSHOT</version>
</dependency>
```

### Gradle

```gradle
implementation group: 'com.thizzer.jtouchbar', name: 'jtouchbar', version: '1.0.1-SNAPSHOT'
```

#### SWT Example

```java
Shell shell = ...

JTouchBar jTouchBar = new JTouchBar();
jTouchBar.setCustomizationIdentifier("MySWTJavaTouchBar");

// Customize your touchbar

JTouchBarSWT.show(jTouchBar, shell);
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details