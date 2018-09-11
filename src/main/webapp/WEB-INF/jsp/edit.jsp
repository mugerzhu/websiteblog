<%--
  Created by IntelliJ IDEA.
  User: muger
  Date: 2018/8/6
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Edit Blog</title>
    <link rel="stylesheet" href="/editor/css/editormd.css" />
    <script src="/js/jquery.min.js"></script>
    <script src="/editor/editormd.js"></script>
    <style>
        #submitbtn{
            position: absolute;
            right: 50px;
            bottom: 0px;
        }
    </style>
</head>
<body>
<form action="/blog" method="post">
    <div style="text-align: center">
        <input name="title">
    </div>
    <div id="editormd">
        <textarea name="content"></textarea>
    </div>
    <button id="submitbtn" type="submit">提交</button>
</form>
<script type="text/javascript">
    $(function() {
        var editor = editormd("editormd", {
            width: "75%",
            path : "/editor/lib/",
            imageUpload : true,
            imageFormats : ["jpg", "jpeg", "gif", "png", "bmp", "webp"],
            imageUploadURL : "/upload/image"
        });
    });
</script>
</body>
</html>
