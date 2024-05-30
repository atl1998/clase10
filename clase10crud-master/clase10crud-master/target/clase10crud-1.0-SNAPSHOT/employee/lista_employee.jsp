<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.clase10crud.beans.Employees" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="lista" scope="request" type="ArrayList<Employees>" />
<html>
    <head>
        <title>Trabajos</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
              crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="clearfix mt-3 mt-2">
                <a href="<%=request.getContextPath()%>/EmployeeServlet">
                    <h1 class="float-start link-dark">Employees</h1>
                </a>
                <a class="btn btn-primary float-end mt-1" href="<%=request.getContextPath() %>/EmployeeServlet?action=new">Crear trabajo</a>
            </div>
            <hr/>
            <form method="post" action="<%=request.getContextPath()%>/EmployeeServlet?action=s">
                <div class="form-floating mt-3">
                    <input type="text" class="form-control" id="floatingInput"
                           placeholder="Por ID o por nombre" name="textoBuscar" value="<%= request.getAttribute("busqueda") != null ? request.getAttribute("busqueda") : "" %>">
                    <label for="floatingInput">Buscar trabajo</label>
                </div>
            </form>
            <table class="table table-striped mt-3">
                <tr class="table-primary">
                    <th>emp_no</th>
                    <th>Birth Date</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Gender</th>
                    <th>Hire Date</th>
                </tr>
                <% for (Employees employees : lista) { %>
                <tr>
                    <td><%=employees.getEmp_no()  %>
                    </td>
                    <td><%=employees.getBirth_date()%>
                    </td>
                    <td><%=employees.getFirst_name()%>
                    </td>
                    <td><%=employees.getLast_name()%>
                    </td>
                    <td><%=employees.getGender()%>
                    </td>
                    <td><%=employees.getHire_date()%>
                    </td>

            </table>
        </div>
    </body>
</html>