<!DOCTYPE html>
<html lang="en">
<head>
    <title>Result</title>
    <style>
        <%@ include file="../stylesheet/style.css" %>
        <%@ include file="../stylesheet/result.css" %>
    </style>
</head>
<body>
<div class="container">
    <div class="unitConverter">
        <h1>Unit Converter</h1>
        <div class="result-container">
            <h3>Result of your calculation</h3>
            <p>${value} ${unit} = ${convertedValue} ${otherUnit}</p>
            <a href="${pageContext.request.contextPath}/">Reset</a>
        </div>
    </div>
</div>
</body>
</html>