<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
     <title>JSP - Hello World</title>
</head>
<body>


    <div align="center">
        <h1><%= "Hello00000 World!" %>
        <h1>Web Test</h1>
        <form action="/calculate" method="post">
            <p>
                input number A <input type="number" name="a" required />
            </p>
            <p>
                input number B <input type="number" name="b" required />
            </p>
            <p>
                <input type="submit" value="Run" />
            </p>

            <a href="#" class="btn btn-primary">Click!</a>

            <h1><%= "Por favor" %>
                <a href="#" class="btn btn-primary">Haga clic!</a>
            </h1>
</h1>



        </form>
    </div>



<br/>
</body>
</html>