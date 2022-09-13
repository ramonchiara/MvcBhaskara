<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Equação de 2º Grau</title>
        <link rel="stylesheet" href="style.css" type="text/css"/>
    </head>
    <body>
        <h1>Equação de 2º Grau</h1>
        <p>A equação <i>${equacao.a} &middot; x<sup>2</sup> + ${equacao.b} &middot; x + ${equacao.c} = 0</i>
            <c:choose>
                <c:when test="${equacao.solucaoReal}">
                    tem raízes <i>x<sub>1</sub> = ${equacao.x1}</i> e <i>x<sub>2</sub> = ${equacao.x2}</i>.
                </c:when>
                <c:otherwise>
                    não tem solução real.
                </c:otherwise>
            </c:choose></p>
        <p>Calcular raízes para uma <a href="index.html">nova equação</a>.</p>
    </body>
</html>
