# 消息左滑删除

![image](https://github.com/jkdsking/MessageSlideDel/blob/master/main.jpg)
![image](https://github.com/jkdsking/MessageSlideDel/blob/master/del.jpg)
 
 
 ##  gradle接入
	
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
	dependencies {
	        implementation 'com.github.jkdsking:MessageSlideDel:1.0.1'
	}

## item消息布局

    <?xml version="1.0" encoding="utf-8"?>
    <LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    >
    <com.jkds.messageleft.MessageLeftLayout
        android:layout_width="match_parent"
        android:layout_height="60dp"
        android:clickable="true"
        app:ios="true"
        app:leftSwipe="true"
        app:swipeEnable="true"
        >
        <TextView
            android:id="@+id/content"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:gravity="center"
            android:text="消息"
             />

        <!-- 以下都是侧滑菜单的内容依序排列 -->
        <TextView
            android:id="@+id/tv_delete"
            android:layout_width="65dp"
            android:layout_height="match_parent"
            android:background="@android:color/holo_red_light"
            android:gravity="center"
            android:text="删除"
            android:textColor="@android:color/white"
            android:textSize="14dp" />

    </com.jkds.messageleft.MessageLeftLayout>
    <View
        android:layout_width="match_parent"
        android:layout_height="1dp"
        android:background="@android:color/black" />
</LinearLayout>


## 开源协议
```
Copyright jkdsking MessageSlideDel

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```        
