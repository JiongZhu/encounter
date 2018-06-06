<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>错误页面</title>
    <link rel="stylesheet" href="components/bootstrap/css/bootstrap.min.css">
</head>
<body>
    <div style="padding:20px 60px;">
        <h1>系统异常统一处理</h1>
        <h3>错误信息：${msg}</h3>
        <h3>请求地址：${url}</h3>
        <h2>Debug</h2>
        <a href="https://www.google.com/webhp?hl=zh-CN#safe=strict&hl=zh-CN&q=${msg}" class="btn btn-primary btn-lg" target="_blank" id="Google">Google</a>
        <a href="https://www.baidu.com/s?wd=${msg}" class="btn btn-info btn-lg"  target="_blank" id="Baidu">Baidu</a>
        <a href="http://stackoverflow.com/search?q=${msg}" class="btn btn-default btn-lg"  target="_blank" id="StackOverFlow">StackOverFlow</a>
        <h2>异常堆栈跟踪日志StackTrace</h2>
        <#list stackTrace as line>
            <p>${line}</p>
        </#list>
    </div>
</body>
</html>