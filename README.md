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
      implementation ''
}
```

## Usage

To display only Text:
```kotlin
showText(context, "This is Message!!!", Toast.LENGTH_SHORT)
```

To display only Text with custom background color:
```kotlin
showText(context, yourColor, "This is Message!!!", Toast.LENGTH_SHORT)
```

To display Text and Icon:
```kotlin
showIcon(context, yourIcon, "This is Message!!!", Toast.LENGTH_SHORT)
```

To display Text and Icon with custom background color:
```kotlin
showIcon(context, yourIcon, yourColor, "This is Message!!!", Toast.LENGTH_SHORT)
```
