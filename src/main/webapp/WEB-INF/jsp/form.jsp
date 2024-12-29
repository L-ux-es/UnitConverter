<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Unit Converter</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        .container {
            width: 100%;
            height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }

        .unitConverter {
            width: 80%;
            height: 60%;
            border: 3px solid green;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        /*Eliminar esto , es solo para maqueta*/
        .container-form {
            height: 60%;
            width: 100%;
            display: flex;
            flex-direction: row;
            justify-content: space-around;
        }

        form {
            display: flex;
            flex-direction: column;
            justify-content: space-between;
        }

        #weight-form, #temperature-form {
            display: none;
        }
    </style>
    <script>
        function showForm(formId) {
            document.getElementById('length-form').style.display = 'none';
            document.getElementById('weight-form').style.display = 'none';
            document.getElementById('temperature-form').style.display = 'none';
            document.getElementById(formId).style.display = 'flex';
        }
    </script>
</head>
<body>
<div class="container">
    <div class="unitConverter">
        <h1>Unit Converter</h1>
        <button onclick="showForm('length-form')">Length</button>
        <button onclick="showForm('weight-form')">Weight</button>
        <button onclick="showForm('temperature-form')">Temperature</button>
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