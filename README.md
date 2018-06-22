# ReadMoreTextView
----

[![](https://jitpack.io/v/ishank0084/ReadMoreTextView.svg)](https://jitpack.io/#ishank0084/ReadMoreTextView)

Demo
-----
This repository also contains a demo project:

<a href="https://imgur.com/Y4DKGvj"><img src="https://i.imgur.com/Y4DKGvjm.gif" title="source: imgur.com" /></a>


Usage
------
Using the ReadMoreTextView is very easy, it's just  functionality added to it for showing read more and read less. 
you can set the default number of lines for the TextView collapsed state.You can easily set text content for "Read More" 
and "Read Less" and can set color to differentiate read more text content.

```

ReadMoreTextView readMoreTextView = new ReadMoreTextView();
        readMoreTextView.setTextView(textView);
        readMoreTextView.setMaximumLine(1);
        readMoreTextView.setCollapseText("See Less");
        readMoreTextView.setExpandText("See More");
        readMoreTextView.setColorCode("#e74c3c");
        readMoreTextView.setReadMore();
 	
Either:
 
new ReadMoreTextView(textView, 3, "Read More", "Read less", "");

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
	        compile 'com.github.ishank0084:ReadMoreTextView:2.0'
	}
```

## Adding the maven plugin

To enable installing into local maven repository and JitPack you need to add the [android-maven](https://github.com/dcendents/android-maven-gradle-plugin) plugin:

1. Add `classpath 'com.github.dcendents:android-maven-gradle-plugin:1.3'` to root build.gradle under `buildscript { dependencies {`
2. Add `com.github.dcendents.android-maven` to the library/build.gradle

After these changes you should be able to run:

    ./gradlew install
    
from the root of your project. If install works and you have added a GitHub release it should work on jitpack.io

Licence
-----
 Copyright 2018 Ishank Shukla

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.



Contributing
-----
Please fork this repository and contribute back using pull requests.

Any contributions, large or small, major features, bug fixes, additional language translations, unit/integration tests are welcomed and appreciated but will be thoroughly reviewed and discussed.


