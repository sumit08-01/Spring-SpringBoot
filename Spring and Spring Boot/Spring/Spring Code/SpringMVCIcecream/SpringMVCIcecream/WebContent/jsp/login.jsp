<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
    <head>
        <title>Ice Cream Parlour</title>
    </head>
    <body>       
        <H3> ICE CREAM PARLOUR </H3>
        <p></p>
        <form method="post" action="">
            <spring:bind path="icecream">
            </spring:bind>        
                    ENTER YOUR FAV FLAVOUR::
                   
                    <spring:bind path="icecream.flavour">
                         <input type="text" name='<c:out value="${status.expression}"/>'
                                   value='<c:out value="${status.value}"/>'>
                        
                    </spring:bind>
                     <br>
            <br>
            <input type="submit" alignment="center" value="submit">
        </form>
        <p>
        </p>
    </body>
</html>
