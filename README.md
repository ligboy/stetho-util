# stetho-util  
[![Build Status](https://travis-ci.org/ligboy/stetho-util.svg?branch=master)](https://travis-ci.org/ligboy/stetho-util)
[![Download](https://api.bintray.com/packages/ligboy/maven/stetho-util/images/download.svg)](https://bintray.com/ligboy/maven/stetho-util/_latestVersion)
Utils for the facebook stetho.
### Download
This library already included in Jcenter & MavenCentral
#### Gradle:
Stetho Base Util
```groovy
compile 'org.ligboy:stetho-no-op:0.1.0'
debugCompile 'org.ligboy:stetho:0.1.0'
```
Stetho OkHttp Util
```groovy
compile 'org.ligboy:stetho-okhttp-no-op:0.1.0'
debugCompile 'org.ligboy:stetho-okhttp:0.1.0'
```
Stetho OkHttp3 Util
```groovy
compile 'org.ligboy:stetho-okhttp3-no-op:0.1.0'
debugCompile 'org.ligboy:stetho-okhttp3:0.1.0'
```
Stetho Timber Util
```groovy
compile 'org.ligboy:stetho-timber-no-op:0.1.0'
debugCompile 'org.ligboy:stetho-timber:0.1.0'
```
#### Via Maven
Stetho Base Util
```xml
<dependencies>
  <dependency>
    <groupId>org.ligboy</groupId>
    <artifactId>stetho-no-op</artifactId>
    <version>0.1.0</version>
    <scope>compile</scope>
  </dependency>
  <dependency>
    <groupId>org.ligboy</groupId>
    <artifactId>stetho</artifactId>
    <version>0.1.0</version>
    <scope>debug</scope>
  </dependency>
</dependencies>
```
Stetho OkHttp Util
```xml
<dependencies>
  <dependency>
    <groupId>org.ligboy</groupId>
    <artifactId>okhttp-no-op</artifactId>
    <version>0.1.0</version>
    <scope>compile</scope>
  </dependency>
  <dependency>
    <groupId>org.ligboy</groupId>
    <artifactId>okhttp</artifactId>
    <version>0.1.0</version>
    <scope>debug</scope>
  </dependency>
</dependencies>
```
Stetho OkHttp3 Util
```xml
<dependencies>
  <dependency>
    <groupId>org.ligboy</groupId>
    <artifactId>okhttp3-no-op</artifactId>
    <version>0.1.0</version>
    <scope>compile</scope>
  </dependency>
  <dependency>
    <groupId>org.ligboy</groupId>
    <artifactId>okhttp3</artifactId>
    <version>0.1.0</version>
    <scope>debug</scope>
  </dependency>
</dependencies>
```
Stetho Timber Util
```xml
<dependencies>
  <dependency>
    <groupId>org.ligboy</groupId>
    <artifactId>timber-no-op</artifactId>
    <version>0.1.0</version>
    <scope>compile</scope>
  </dependency>
  <dependency>
    <groupId>org.ligboy</groupId>
    <artifactId>timber</artifactId>
    <version>0.1.0</version>
    <scope>debug</scope>
  </dependency>
</dependencies>
```

### Usage
```java
/**
 * @author Ligboy.Liu ligboy@gmail.com.
 */
public class DemoApplication extends Application {

    /**
     * Don't do like this in product. You should use lazy initialization.
     */
    public static final OkHttpClient HTTP_CLIENT = new OkHttpClient();
    public static final okhttp3.OkHttpClient HTTP_CLIENT_3 = new okhttp3.OkHttpClient();

    @Override
    public void onCreate() {
        super.onCreate();
        StethoUtil.initialize(this);

        StethoOkHttpUtil.setup(HTTP_CLIENT);

        StethoOkHttp3Util.setup(HTTP_CLIENT_3);

        Timber.plant(new StethoTree());
    }
}
```
Author
=======
 * Ligboy Liu

License
=======
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.