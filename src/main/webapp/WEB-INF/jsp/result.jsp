<!DOCTYPE html>
<html lang="en">
<head>
    <title>Resultado</title>
    <style>
        <%@ include file="../stylesheet/style.css" %>
    </style>
</head>
<body>
<div class="container">
    <div class="unitConverter">
        <div class="result-container">
            <h1>Result of your calculation</h1>
            <p>${value} ${unit} = ${convertedValue} ${otherUnit}</p>
            <a href="${pageContext.request.contextPath}/">Reset</a>
        </div>
    </div>
</div>
</body>
</html>