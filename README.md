# ReadMoreTextView


Demo
-----
This repository also contains a demo project.

Usage
------
Using the ReadMoreTextView is very easy, it's just  functionality added to it for showing read more and read less. 
you can set the default number of lines for the TextView collapsed state.You can easily set text content for "Show more" 
and "Show Less"

```
new ReadMoreTextView(textView, 3, "Read More", "Read less");

```

Setup
-----

Add it to your build.gradle with:
```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
and:

```gradle
dependencies {
    implementation 'com.github.ishank0084:ResizeableTextView:v1.0''
}
```

## Adding the maven plugin

To enable installing into local maven repository and JitPack you need to add the [android-maven](https://github.com/dcendents/android-maven-gradle-plugin) plugin:

1. Add `classpath 'com.github.dcendents:android-maven-gradle-plugin:1.3'` to root build.gradle under `buildscript { dependencies {`
2. Add `com.github.dcendents.android-maven` to the library/build.gradle

After these changes you should be able to run:

    ./gradlew install
    
from the root of your project. If install works and you have added a GitHub release it should work on jitpack.io



Contributing
-----
Please fork this repository and contribute back using pull requests.

Any contributions, large or small, major features, bug fixes, additional language translations, unit/integration tests are welcomed and appreciated but will be thoroughly reviewed and discussed.


