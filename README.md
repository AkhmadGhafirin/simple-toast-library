# Toaster

Toaster is a Android library for showing a simple custom Toast.

## Installation

In order to use it, you need to include it in your project.

```bash
allprojects {
    repositories {
      ...
      maven { url 'https://jitpack.io' }
    }
}
```

```bash
dependencies {
implementation 'com.github.AkhmadGhafirin:simple-toast-library:0.0.1'
}
```

## Usage

To display only Text:
```kotlin
Toaster().showText(context, "This is Message!!!", Toast.LENGTH_SHORT)
```

To display only Text with custom background color:
```kotlin
Toaster().showText(context, yourColor, "This is Message!!!", Toast.LENGTH_SHORT)
```

To display Text and Icon:
```kotlin
Toaster().showIcon(context, yourIcon, "This is Message!!!", Toast.LENGTH_SHORT)
```

To display Text and Icon with custom background color:
```kotlin
Toaster().showIcon(context, yourIcon, yourColor, "This is Message!!!", Toast.LENGTH_SHORT)
```
