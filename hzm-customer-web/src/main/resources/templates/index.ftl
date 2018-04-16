<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
</head>
<body>
<form action="/login" method="post">
    用户 <input name="customerName" type="text"><br/>
    密码<input name="customerPassword" type="password"><br/>
    <input value="登录" class="btn btn-primary"  type="submit">
</form>
<a href="/cardID">身份证</a>
</body>
</html>