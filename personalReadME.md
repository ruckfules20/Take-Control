xml file recommendations-->

The <service> declaration goes inside the <application> tag 1.
It should come before the <activity> declarations, but after any other components like <receiver> or <provider> tags 1.
The android:exported="false" attribute means this service won't be accessible to other apps 1.
The android:process=":remote" attribute creates a separate process for the service

adding a <intent-filter> to your service if you want to specify how it can be started

If your service performs critical functions, 
you might want to add a <meta-data> tag to provide additional configuration options


The <uses-permission> tag should be placed immediately under the <manifest> opening tag 1.
This permission is required for apps targeting Android 9 (API level 28) or higher that use foreground services 1.
The FOREGROUND_SERVICE permission allows a regular application to use Service.startForeground() 1.
Unlike some other permissions, FOREGROUND_SERVICE is a normal permission, so the system automatically grants it to the requesting app