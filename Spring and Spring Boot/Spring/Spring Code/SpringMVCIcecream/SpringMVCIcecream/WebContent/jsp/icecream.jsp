<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
    <head>
        <title>Result</title>
    </head>
    <body>
<spring:bind path="icecream">
        <h1>
            Your Fav flavour is: <c:out value="${icecream.flavour}" />
        </h1>       
           <a href="login.html">logout</a>
         </spring:bind>
    </body>
</html>
