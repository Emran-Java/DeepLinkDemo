# DeepLinkDemo
Android deep link demo project
# What is deep link in Android area?
Deep link is technique to use in android for filter and open target activity by click web link.

In general think Deep linking (<a href="https://en.wikipedia.org/wiki/Deep_linking" target="_blank">wikipedia</a>)
<br>In the context of the World Wide Web, deep linking is the use of a hyperlink that links to a specific, generally searchable or indexed, piece of web content on a website (e.g. "http://example.com/path/page"), rather than the website's home page (e.g., "http://example.com"). The URL contains all the information needed to point to a particular item, in this case the "Example" section of the English Wikipedia article entitled "Deep linking", as opposed to only the information needed to point to the highest-level home page of Wikipedia at https://www.wikipedia.org/.

Must learn, "Create Deep Links to App Content" (<a herf="https://developer.android.com/training/app-links/deep-linking" target="_blank">Android Developer</a>)
When a clicked link or programmatic request invokes a web URI intent, the Android system tries each of the following actions, in sequential order, until the request succeeds:
1. Open the user's preferred app that can handle the URI, if one is designated.
2. Open the only available app that can handle the URI.
3. Allow the user to select an app from a dialog.

<h4>Android project instruction</h4>

Step 0: Create a android project and select language Java
Step 1: Create 3 Activity 
<br>- MainActivity
<br>- DemoLink2Activity
<br>- DemoLink3Activity
Step 2: 
_________________________________________________
<h4>Backend setup</h>
<br>For example we use 3 web Url

<h3><a href="https://www.pexels.com/@md-emran-hossain-emran-11822" target="_blank">Web Url One</a></h3>
https://www.pexels.com/@md-emran-hossain-emran-11822
<p>
  After install this app on device, then if we clic this link, android system can show a diolag to asking what application use for this url.
  /*<br>
                Here,<br>
                SCHEME = https<br>
                HOST = www.pexels.com<br>
                PATH PATTERN = /@md-emran-hossain-emran-11822<br>
                * */
</p>
<img src="https://github.com/Emran-Java/DeepLinkDemo/blob/master/files/screenshot/link_0ne.jpg" alt="Demo Screenshot 1" style="max-width:100%;"/>


<h3><a href="uapp://yrhost.com/target_activity" target="_blank">Web Url Two</a></h3>
uapp://yrhost.com/target_activity

<h3><a href="uapp://yrhost.com/target_another_activity" target="_blank">Web Url Three</a></h3>
uapp://yrhost.com/target_another_activity
<br>
<p>
  Those two link use for open directly specific two difference activity
  <br>
 /*<br>
                Here,<br>
                SCHEME = uapp<br>
                HOST = yrhost.com<br>
                PATH PATTERN = /target_activity<br>
                * */
  But those links are not true link. So we need to add script in our web site, 
  For testimg we use LAMPP server 
  <img src="https://github.com/Emran-Java/DeepLinkDemo/blob/master/files/screenshot/backend_files.png" alt="backendScreenshot" style="max-width:100%;"/>
</p>
<br>
<a href="https://github.com/Emran-Java/DeepLinkDemo/tree/master/files/web" target="_blank">Backend html files</a>

For open <b>DemoLink2Activity.java</b><br>
<img src="https://github.com/Emran-Java/DeepLinkDemo/blob/master/files/screenshot/web_url_two.png" alt="webUrlTwo" style="max-width:100%;"/>
<p>
  <html>
	<head>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	</head>
	<body>
    <script>

             $( window ).on( "load", function() {
               window.location.replace("uapp://yrhost.com/target_activity");
               setTimeout(function () {
				   //your app link to redirect play store
                   window.location.replace("https://play.google.com/store/apps/details?id=com.lintree.emran.lintree");
               }, 2000);
               
           });
        </script>
    </body>
	
</html>

</p>
<br>
For open <b>DemoLink2Activity.java</b><br>
<img src="https://github.com/Emran-Java/DeepLinkDemo/blob/master/files/screenshot/web_url_two.png" alt="webUrlTwo" style="max-width:100%;"/>
<p>
  <html>
	<head>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	</head>
	<body>
    <script>

            $( window ).on( "load", function() {
               window.location.replace("uapp://yrhost.com/target_another_activity");
               setTimeout(function () {
				   //your app link to redirect play store
                   window.location.replace("https://play.google.com/store/apps/details?id=com.lintree.emran.lintree");
               }, 2000);
               
           });
        </script>
    </body>
    
</html>
</p>
<h3><a href="https://github.com/Emran-Java/DeepLinkDemo/blob/master/files/media/deep_link.mp4" target="_blank">Demo video</a></h3>
<a href="https://github.com/Emran-Java/DeepLinkDemo/blob/master/files/media/deep_link.gif" target="_blank">
  <img src="https://github.com/Emran-Java/DeepLinkDemo/blob/master/files/media/deep_link.gif" alt="Demo video gif" style="max-width:100%;">
</a>

<h3><a href="https://github.com/Emran-Java/DeepLinkDemo/blob/master/files/apk/deep-linkapp-debug-20190515.apk" target="_blank">Demo app APK file</a></h3>
<br>

