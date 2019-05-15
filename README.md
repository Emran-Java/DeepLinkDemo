# DeepLinkDemo
Android deep link demo project 

For example we use 3 web Url

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
For open <b>DemoLink2Activity.java</b><br>
<img src="https://github.com/Emran-Java/DeepLinkDemo/blob/master/files/screenshot/web_url_two.png" alt="webUrlTwo" style="max-width:100%;"/>
<br>
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
<br>
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
<br>


