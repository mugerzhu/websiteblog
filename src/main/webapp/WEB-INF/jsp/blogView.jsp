<%--
  Created by IntelliJ IDEA.
  User: muger
  Date: 2018/8/6
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>${blog.b_title}</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <meta name="author" content="" />
    <!-- Facebook and Twitter integration -->
    <meta property="og:title" content=""/>
    <meta property="og:image" content=""/>
    <meta property="og:url" content=""/>
    <meta property="og:site_name" content=""/>
    <meta property="og:description" content=""/>
    <meta name="twitter:title" content="" />
    <meta name="twitter:image" content="" />
    <meta name="twitter:url" content="" />
    <meta name="twitter:card" content="" />
    <!--<meta name="viewport" content="width=device-width,initial-scale=1.0">-->
    <link rel="stylesheet" href="/editor/css/editormd.css"/>
    <link rel="stylesheet" type="text/css" href="/editor/css/editormd.preview.min.css"/>
    <link href="https://fonts.googleapis.com/css?family=Oxygen:300,400" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,600,700" rel="stylesheet">

    <!-- Animate.css -->
    <link rel="stylesheet" href="/css/animate.css">
    <!-- Icomoon Icon Fonts-->
    <link rel="stylesheet" href="/css/icomoon.css">
    <!-- Bootstrap  -->
    <link rel="stylesheet" href="/css/bootstrap.css">

    <!-- Magnific Popup -->
    <link rel="stylesheet" href="/css/magnific-popup.css">

    <!-- Flexslider  -->
    <link rel="stylesheet" href="/css/flexslider.css">

    <!-- Theme style  -->
    <link rel="stylesheet" href="/css/style.css">
    <script src="/js/jquery.min.js"></script>
    <script src="/editor/lib/marked.min.js"></script>
    <script src="/editor/lib/prettify.min.js"></script>
    <script src="/editor/lib/raphael.min.js"></script>
    <script src="/editor/lib/underscore.min.js"></script>
    <script src="/editor/lib/sequence-diagram.min.js"></script>
    <script src="/editor/lib/flowchart.min.js"></script>
    <script src="/editor/lib/jquery.flowchart.min.js"></script>
    <script src="/editor/editormd.min.js" type="text/javascript" charset="utf-8"></script>
    <!-- Modernizr JS -->
    <script src="/js/modernizr-2.6.2.min.js"></script>
    <!-- FOR IE9 below -->
    <!--[if lt IE 9]>
    <script src="/js/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="fh5co-loader"></div>

<div id="page">
    <nav class="fh5co-nav" role="navigation">
        <div class="container-wrap">
            <div class="top-menu">
                <div class="row">
                    <div class="col-xs-2">
                        <div id="fh5co-logo"><a href="/">ZDHSpace</a></div>
                    </div>
                    <div class="col-xs-10 text-right menu-1">
                        <ul>
                            <li><a href="/">Home</a></li>
                            <li class="active"><a href="/blog">Blog</a></li>
                            <li><a href="/contact">Contact</a></li>
                        </ul>
                    </div>
                </div>

            </div>
        </div>
    </nav>
    <div class="container-wrap">
        <aside id="fh5co-hero">
            <div class="flexslider">
                <ul class="slides">
                    <li style="background-image: url(/images/img_bg_3.jpg);">
                        <div class="overlay-gradient"></div>
                        <div class="container-fluids">
                            <div class="row">
                                <div class="col-md-6 col-md-offset-3 slider-text slider-text-bg">
                                    <div class="slider-text-inner text-center">
                                        <h1>Blog</h1>
                                        <h2></h2>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
        </aside>
        <div id="fh5co-blog">
            <div id="doc-content">
                <textarea style="display: none;">${blog.b_content}</textarea>
            </div>
        </div>
    </div><!-- END container-wrap -->

    <div class="container-wrap">
        <footer id="fh5co-footer" role="contentinfo">
            <div class="row">
                <div class="col-md-3 fh5co-widget">
                    <h4>About Neat</h4>
                    <p>Facilis ipsum reprehenderit nemo molestias. Aut cum mollitia reprehenderit. Eos cumque dicta adipisci architecto culpa amet.</p>
                </div>
                <div class="col-md-3 col-md-push-1">
                    <h4>Latest Posts</h4>
                    <ul class="fh5co-footer-links">
                        <li><a href="#">Amazing Templates</a></li>
                        <li><a href="#">100+ Free Download Templates</a></li>
                        <li><a href="#">Neat is now available</a></li>
                        <li><a href="#">Download 1000+ icons</a></li>
                        <li><a href="#">Big Deal for this month of March, Join Us here</a></li>
                    </ul>
                </div>

                <div class="col-md-3 col-md-push-1">
                    <h4>Links</h4>
                    <ul class="fh5co-footer-links">
                        <li><a href="#">Home</a></li>
                        <li><a href="#">Work</a></li>
                        <li><a href="#">Services</a></li>
                        <li><a href="#">Blog</a></li>
                        <li><a href="#">About us</a></li>
                    </ul>
                </div>

                <div class="col-md-3">
                    <h4>Contact Information</h4>
                    <ul class="fh5co-footer-links">
                        <li>198 West 21th Street, <br> Suite 721 New York NY 10016</li>
                        <li><a href="tel://1234567920">+ 1235 2355 98</a></li>
                        <li><a href="mailto:info@yoursite.com">info@yoursite.com</a></li>
                        <li><a href="http://sc.chinaz.com/jiaoben/">gettemplates.co</a></li>
                    </ul>
                </div>

            </div>

            <div class="row copyright">
                <div class="col-md-12 text-center">
                    <p>
                        <small class="block">Copyright &copy; 2017.Company name All rights reserved.</small>
                    </p>
                    <p>
                    <ul class="fh5co-social-icons">
                        <li><a href="#"><i class="icon-twitter"></i></a></li>
                        <li><a href="#"><i class="icon-facebook"></i></a></li>
                        <li><a href="#"><i class="icon-linkedin"></i></a></li>
                        <li><a href="#"><i class="icon-dribbble"></i></a></li>
                    </ul>
                    </p>
                </div>
            </div>
        </footer>
    </div><!-- END container-wrap -->
</div>

<div class="gototop js-top">
    <a href="#" class="js-gotop"><i class="icon-arrow-up2"></i></a>
</div>
<script type="text/javascript">
    var testEditor;
    $(function() {
        testEditor = editormd.markdownToHTML("doc-content", {//注意：这里是上面DIV的id
            htmlDecode : "style,script,iframe",
            emoji : true,
            taskList : true,
            tex : true,
            flowChart : true,
            sequenceDiagram : true,
            codeFold : true
        });
    });
</script>
<!-- jQuery -->
<script src="/js/jquery.min.js"></script>
<!-- jQuery Easing -->
<script src="/js/jquery.easing.1.3.js"></script>
<!-- Bootstrap -->
<script src="/js/bootstrap.min.js"></script>
<!-- Waypoints -->
<script src="/js/jquery.waypoints.min.js"></script>
<!-- Flexslider -->
<script src="/js/jquery.flexslider-min.js"></script>
<!-- Magnific Popup -->
<script src="/js/jquery.magnific-popup.min.js"></script>
<script src="/js/magnific-popup-options.js"></script>
<!-- Counters -->
<script src="/js/jquery.countTo.js"></script>
<!-- Main -->
<script src="/js/main.js"></script>
</body>
</html>
