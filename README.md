# Superior Toasts -A beautiful Multipurpose Fully customizable Toast library for Android.
Create beautiful toasts(like reddit android app's) with features like Icon, headers, action buttons(like snackbar's) and animations support.

<p float="left">
  <img align="top" src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/iconpng.png?raw=true" width="250" height="250" />            
  <img src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/22.png?raw=true"
        width="264" height="520" />            
  <img src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/44.png?raw=true"
        width="264" height="520" /> 
</p>


## Preview - Superior Toast 

<table style="width:100%">
  <tr>
    <th>1. Default </th>
    <th>2. with Icon Image</th> 
    <th>3. with dark mode </th>
    <th>4. custom background and left bar removed</th> 
  </tr>
  <tr>
    <td><img src = "https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/1gif.gif?raw=true"/></td> 
    <td><img src = "https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/2gif.gif?raw=true"/></td>
    <td><img src = "https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/3gif.gif?raw=true"/></td> 
    <td><img src = "https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/4gif.gif?raw=true"/></td> 
   
  </tr>
</table>


## Preview - Superior Toast with Pre-designed Toasts ,ready for use.

<table style="width:100%">
  <tr>
    <th>1. Success </th>
    <th>2. Error </th> 
    <th>3. Warning </th>
    <th>4. Information</th> 
  </tr>
  <tr>
    <td><img src = "https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/11gif.gif?raw=true"/></td> 
    <td><img src = "https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/22gif.gif?raw=true"/></td>
    <td><img src = "https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/33gif.gif?raw=true"/></td> 
    <td><img src = "https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/44gif.gif?raw=true"/></td> 
   
  </tr>
</table>


## Animations.

<table style="width:100%">
  <tr>
    <th>1. Slide Left Right Entry Exit  </th>
    <th>2. Slide Bottom Entry Exit </th> 
    <th>3. Fade In Fade out </th>
  </tr>
  <tr>
    <td><img src = "https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/111.gif?raw=true"/></td> 
    <td><img src = "https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/222.gif?raw=true"/></td>
    <td><img src = "https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/333.gif?raw=true"/></td> 
  </tr>
</table>

## Superior Toasts with Action buttons.

<table style="width:100%">
  <tr>
    <th>1. with Action Button (like snackbar's)  </th>
    <th>2. with animation (slide left right) </th> 
    <th>3. tost dissmiss on action button click(manuall dissmiss) </th>
        <th>4. action button with Pre designed toast (error) </th>
        <th>5. with content text, duration indefinite and manual dissmiss</th>
  </tr>
  <tr>
    <td><img src = "https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/1111.gif?raw=true"/></td> 
    <td><img src = "https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/2222.gif?raw=true"/></td>
    <td><img src = "https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/3333.gif?raw=true"/></td> 
       <td><img src = "https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/4444.gif?raw=true"/></td> 
       <td><img src = "https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/5555.gif?raw=true"/></td> 
  </tr>
</table>

## Demo App

<a href="https://play.google.com/store/apps/details?id=io.shubh.superiortoast">
    <img alt="Get it on Google Play"
        height="80"
        src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" />
</a>

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
 implementation 'com.github.shubh420:Superior-Toasts:v1.0'
}
```

## Usage

# Sample Code for - Superior Toasts

### Default

<p float="left">
  <img align="left" src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/1ForCodeSnippets.PNG?raw=true" />            

```
 SuperiorToast.makeSuperiorToast(getContext().getApplicationContext(), "hello")
	.show();
```

<b>the code samples here are for calls from fragemnt.For context passing through Activty just use  `this` in place of `getContext().getApplicationContext()`.</b>
</p>

### UI Customizations

 <b> set Icon Image</b>

<p float="left">
 * <img align="left" src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/2ForCodeSnippets.png?raw=true"   width="275"    />            

```
  SuperiorToast.makeSuperiorToast(getContext().getApplicationContext(),"hello")
	.setToastIcon(getResources().getDrawable(R.drawable.ic_reddit_icon_svg))
	.show(); 
```
</p>

* <b>set Dark Mode </b> to any kind of toast ,just call  ```.setDarkMode()``` on it.


<p float="left">
  <img align="left" src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/3ForCodeSnippets.png?raw=true"   width="275"   />            

```
  SuperiorToast.makeSuperiorToast(getContext().getApplicationContext(), "hello")
	.setDarkMode()
	.setToastIcon(getResources().getDrawable(R.drawable.ic_reddit_icon_svg))
	.show();
```
</p>

* <B> set Custom Background </B>(any kind of Drawable)<b> and other customization functions. </b>


<p float="left">
  <img align="left" src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/4ForCodeSnippets.png?raw=true"   width="275"   />            

```
   SuperiorToast.makeSuperiorToast(getContext().getApplicationContext() ,"hello")
	.setToastIcon(getResources().getDrawable(R.drawable.ic_reddit_icon_svg))
	.setBackgroundDrawable(getResources().getDrawable(R.drawable.purple_bg)) //<--
	.removeLeftVerticleStrip()
	.setTextColor("#ffffff")
	.show();
```
</p>

* ```.setToastIconTintColor(String HexCodeColorString)``` //pass hex color code string 
* ```.setElevation(float f)``` //pass floast value between 0f and 100f //applicable when the toast is shown using ```showWithAction``` 		or ```showWithSimpleAnimation ``` functions(explained below).
* ```.setTextColor(String HexCodeColorString)```
* ```.setBackgroundColor(String HexCodeColorString)``` //background of toast
* ```.setBackgroundDrawable(Drawable drawable) ```
* ```.setColorToLeftVerticleStrip(String HexCodeColorString)``` 
* ```.removeLeftVerticleStrip()``` 


# Sample Code for - Superior Toasts with Pre-designed Toasts ,ready for use
### Five toast types 
```
        1. INFORMATION_TOAST
        2. ERROR_TOAST
        3. WARNING_TOAST
        4. SUCCESS_TOAST
        5. CUSTOM_TOAST
```

### Default 
<p float="left">
 <img align="left" src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/5ForCodeSnippets.png?raw=true"   width="275"    />            

```
SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
	,SuperiorToastWithHeadersPreDesigned.INFORMATION_TOAST)
		.show();
```
</p>
<p float="left">
  <img align="left" src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/6ForCodeSnippets.png?raw=true"   width="275"   />            

```
SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
	,SuperiorToastWithHeadersPreDesigned.ERROR_TOAST)
		.show();
```
</p>
<p float="left">
  <img align="left" src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/7ForCodeSnippets.png?raw=true"   width="275"    />            

```
SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
	,SuperiorToastWithHeadersPreDesigned.WARNING_TOAST)
		.show();
```
</p>
<p float="left">
  <img align="left" src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/8ForCodeSnippets.png?raw=true"   width="275"  />            

```
SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
	,SuperiorToastWithHeadersPreDesigned.SUCCESS_TOAST)
		.show();
```
</p>

custom toast just shows the way the toast looks with the content text
<p float="left">
  <img align="left" src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/9ForCodeSnippets.png?raw=true"   width="275"    />            

```
SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
	,SuperiorToastWithHeadersPreDesigned.CUSTOM_TOAST)
		.show();
```
</p>

### UI Customizations
* <b>set Dark Mode </b>

<p float="left">
  <img align="left" src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/10ForCodeSnippets.png?raw=true"   width="275"   />            

```
SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
	,SuperiorToastWithHeadersPreDesigned.SUCCESS_TOAST)
		.setDarkMode()
		.show();
```
</p>

* <b>set subtitle or content text</b>

<p float="left">
  <img align="left" src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/11ForCodeSnippets.png?raw=true"   width="275"   />            

```
 SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
	,SuperiorToastWithHeadersPreDesigned.SUCCESS_TOAST)
		.setToastContentText("Content")
		.show();
```
</p>

* ```.setToastHeaderText(String header)``` //default header texts of Pre designed toasts like Success Toast can be changed.
* ```.setToastContentText(String content) ``` //content text to any Pre designed toasts like Success Toast can be given. Like Warning Toast can have content text 'are u sure ,u want to exit'.
* ```.setHeaderTextColor(String HexCodeColorString)```
* ```.setContentTextColor(String HexCodeColorString)```
* ```.removeIconImageView()```

* ```.setToastIcon(Drawable drawable)``` 
* ```.setToastIconTintColor(String HexCodeColorString)``` //pass hex color code string 
* ```.setElevation(float f)``` //pass floast value between 0f and 100f //applicable when the toast is shown using ```showWithAction``` 		or ```showWithSimpleAnimation ``` functions(explained below).
* ```.setBackgroundColor(String HexCodeColorString)``` //background of toast
* ```.setBackgroundDrawable(Drawable drawable) ```
* ```.setColorToLeftVerticleStrip(String HexCodeColorString)``` 
* ```.removeLeftVerticleStrip()``` 


# Animations
### Four Animation options
```
        1. ANIMATION_SLIDE_LEFT_RIGHT_ENTRY_EXIT
        2. ANIMATION_FADE_IN_OUT_ENTRY_EXIT
        3. ANIMATION_SLIDE_BOTTOM_ENTRY_EXIT
        4. ANIMATION_NO_ANIMATION
```
### Code

For to show toasts with animations, replace `.show()` methods in above codes with `.showWithSimpleAnimation( ViewGroup parentOrRootView, int animationType)`.\
\
ParentOrRootView is the rootmost container layout of the xml of activity. <b>Its neccessary that rootmost layout is either Relative/frame/Coordinator/constraint Layout</b>.\
\
<b>When calling from activty, Pass `(ViewGroup) this.getWindow().getDecorView().getRootView() ` as 'parentOrRootView' parameter .Pass `(ViewGroup) getActivity().getWindow().getDecorView().getRootView() ` when calling from fragment.</b>

* <b>Animation Slide Left Right Entry Exit</b>

<p float="left">
  <img align="left" src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/111.gif?raw=true""   width="190"   />            

for toasts from 'SuperiorToast' class.
```
SuperiorToast.makeSuperiorToast(getContext().getApplicationContext(),"hello")
	.setToastIcon(getResources().getDrawable(R.drawable.ic_reddit_icon_svg))
	.showWithSimpleAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView()
		,SuperiorToast.ANIMATION_SLIDE_LEFT_RIGHT_ENTRY_EXIT);
```
for toasts from 'SuperiorToastWithHeadersPreDesigned' class.
```
SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
		,SuperiorToastWithHeadersPreDesigned.SUCCESS_TOAST)
		.showWithSimpleAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView()
			,SuperiorToastWithHeadersPreDesigned.ANIMATION_SLIDE_LEFT_RIGHT_ENTRY_EXIT);

```

</p>


* <b>Animation Slide Bottom Entry Exit</b>

<p float="left">
  <img align="right" src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/222.gif?raw=true""   width="190"   />            

for toasts from 'SuperiorToast' class.
```
SuperiorToast.makeSuperiorToast(getContext().getApplicationContext(),"hello")
	.setToastIcon(getResources().getDrawable(R.drawable.ic_reddit_icon_svg))
	.showWithSimpleAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView()
		,SuperiorToast.ANIMATION_SLIDE_BOTTOM_ENTRY_EXIT);
```
for toasts from 'SuperiorToastWithHeadersPreDesigned' class.
```
SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
		,SuperiorToastWithHeadersPreDesigned.SUCCESS_TOAST)
		.showWithSimpleAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView()
			,SuperiorToastWithHeadersPreDesigned.ANIMATION_SLIDE_BOTTOM_ENTRY_EXIT);

```

</p>

* <b>Animation Fade In Fade Out Entry Exit</b>

<p float="left">
  <img align="left" src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/333.gif?raw=true""   width="190"   />            

for toasts from 'SuperiorToast' class.
```
SuperiorToast.makeSuperiorToast(getContext().getApplicationContext(),"hello")
	.setToastIcon(getResources().getDrawable(R.drawable.ic_reddit_icon_svg))
	.showWithSimpleAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView()
		,SuperiorToast.ANIMATION_FADE_IN_OUT_ENTRY_EXIT);
```
for toasts from 'SuperiorToastWithHeadersPreDesigned' class.
```
SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
		,SuperiorToastWithHeadersPreDesigned.SUCCESS_TOAST)
		.showWithSimpleAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView()
			,SuperiorToastWithHeadersPreDesigned.ANIMATION_FADE_IN_OUT_ENTRY_EXIT);

```

</p>
