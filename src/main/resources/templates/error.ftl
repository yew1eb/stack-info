<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Error</title>
</head>
<body>
<h1>Error Handler</h1>
<hr/>
<#if url??><h2>${url}</h2></#if>
<br/>
<#if exception??>
<#if exception.message??><h2>${exception.message}</h2></#if>
</#if>
</body>
</html>