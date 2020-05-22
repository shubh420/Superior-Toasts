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

  <img src="img align="left" src="https://github.com/shubh420/Superior-Toasts/blob/shubh420-image-resources-update/Image%20Resources/1ForCodeSnippets.PNG?raw=true" /> 
	


```
 SuperiorToast.makeSuperiorToast(getContext().getApplicationContext(),
                        "hello").show();
```







