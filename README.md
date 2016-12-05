If you want to change your activity transition animation then this project is for you.

![](https://github.com/ShohanAhmed/Android-Activity-Transition-Custom-Animation/blob/master/Screenshots/animation.gif)

You can overwrite your default activity animation. I use this solution that work for every android version:

Create a "CustomActivityAnimation" and add this to your base Theme by "windowAnimationStyle".

<!-- Base application theme. -->
<style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">
    <!-- Customize your theme here. -->
    <item name="colorPrimary">@color/colorPrimary</item>
    <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
    <item name="colorAccent">@color/colorPrimary</item>
    <item name="android:windowAnimationStyle">@style/CustomActivityAnimation</item>

</style>

<style name="CustomActivityAnimation" parent="@android:style/Animation.Activity">
    <item name="android:activityOpenEnterAnimation">@anim/slide_in_right</item>
    <item name="android:activityOpenExitAnimation">@anim/slide_out_left</item>
    <item name="android:activityCloseEnterAnimation">@anim/slide_in_left</item>
    <item name="android:activityCloseExitAnimation">@anim/slide_out_right</item>
</style>
Create anim folder under res folder and then create this four animation files:

slide_in_right.xml

<?xml version="1.0" encoding="utf-8"?>

<set xmlns:android="http://schemas.android.com/apk/res/android">
    <translate android:fromXDelta="100%p" android:toXDelta="0"
        android:duration="@android:integer/config_mediumAnimTime"/>
</set>
slide_out_left.xml

<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android">
    <translate android:fromXDelta="0" android:toXDelta="-100%p"
        android:duration="@android:integer/config_mediumAnimTime"/>
</set>
slide_in_left.xml

<?xml version="1.0" encoding="utf-8"?>

<set xmlns:android="http://schemas.android.com/apk/res/android">
    <translate android:fromXDelta="-100%p" android:toXDelta="0"
        android:duration="@android:integer/config_mediumAnimTime"/>
</set>
slide_out_right.xml

<?xml version="1.0" encoding="utf-8"?>

<set xmlns:android="http://schemas.android.com/apk/res/android">
    <translate android:fromXDelta="0" android:toXDelta="100%p"
        android:duration="@android:integer/config_mediumAnimTime"/>
</set>
If you face any problem then you can download my sample project from github.

Thanks
