<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    int maxSalary = (int) request.getAttribute("maxSalary");
%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Crear un nuevo empleado</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                margin: 0;
                padding: 0;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                background-color: #f5f5f5;
            }
            .form-container {
                background-color: #fff;
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                width: 300px;
            }
            h1 {
                text-align: center;
                font-size: 24px;
                margin-bottom: 20px;
            }
            label {
                display: block;
                margin-bottom: 5px;
                font-weight: bold;
            }
            input[type="text"], input[type="date"] {
                width: 100%;
                padding: 8px;
                margin-bottom: 10px;
                border: 1px solid #ccc;
                border-radius: 4px;
            }
            .button-container {
                display: flex;
                justify-content: space-between;
            }
            .button-container button {
                width: 48%;
                padding: 10px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                font-size: 16px;
            }
            .button-container .back-button {
                background-color: #f44336;
                color: white;
            }
            .button-container .submit-button {
                background-color: #007bff;
                color: white;
            }
        </style>
    </head>
    <body>
        <div class="form-container">
            <h1>Crear un nuevo employee <%=maxSalary%></h1>
            <form action="EmployeeServlet" method="post">
                <label for="birth-date">birth date</label>
                <input type="date" id="birth-date" name="birthDate" required>

                <label for="first-name">first name</label>
                <input type="text" id="first-name" name="firstName" required>

                <label for="last-name">last name</label>
                <input type="text" id="last-name" name="lastName" required>

                <label for="gender">gender</label>
                <input type="text" id="gender" name="gender" required>

                <label for="hire-date">hire date</label>
                <input type="date" id="hire-date" name="hireDate" required>

                <div class="button-container">
                    <button type="button" class="back-button" onclick="window.history.back()">Regresar</button>
                    <button type="submit" class="submit-button">Submit</button>
                </div>
            </form>
        </div>
    </body>
</html>