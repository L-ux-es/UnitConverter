<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Convert different units of measurement: distance, weight, temperature">
    <meta name="keywords" content="unit, conversion,distance,weight,temperature,kilogram,gram, meter,kilometer,pound,
celsius,fahrenheit,kelvin,ounce,mile">
    <meta name="author" content="L-ux-es">
    <title>Unit Converter</title>
    <style>
        <%@ include file="../stylesheet/style.css" %>
    </style>
    <script>
        <%@ include file="../js/showForm.js" %>
    </script>
</head>
<body>
<div class="container">
    <div class="unitConverter">
        <h1>Unit Converter</h1>
        <div class="unit-button-container">
            <button onclick="showForm('length-form')">Length</button>
            <button onclick="showForm('weight-form')">Weight</button>
            <button onclick="showForm('temperature-form')">Temperature</button>
        </div>
        <div class="container-form">
            <form id="length-form" action="length" method="post">
                <label for="value">Value</label>
                <input type="number" name="value" id="value">
                <jsp:include page="lengthForm.jsp"/>
                <button type="submit">Convert</button>
            </form>
            <form id="weight-form" action="weight" method="post">
                <label for="value">Value</label>
                <input type="number" name="value" id="value">
                <jsp:include page="weightForm.jsp"/>
                <button type="submit">Convert</button>
            </form>
            <form id="temperature-form" action="temperature" method="post">
                <label for="value">Value</label>
                <input type="number" name="value" id="value">
                <jsp:include page="temperatureForm.jsp"/>
                <button type="submit">Convert</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>