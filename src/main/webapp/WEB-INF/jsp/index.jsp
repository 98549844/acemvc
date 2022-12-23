<%--
  Created by IntelliJ IDEA.
  User: kalam_au
  Date: 2022/8/5
  Time: 下午 03:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="expr4j" uri="/WEB-INF/tlds/exp4jtld" %>
<html>
<head>
    <title>Hello World!</title>
</head>
<body>
<h2>Hello World!</h2>

<h1>exp4j with jsp tags</h1>

<a href="setcustonfunction.do">
    Test custom function with exp4j jsp tags
</a>

<c:set var="expr_str" value="sin(x)"/>
<c:set var="x" value="4"/>



<%--
    Using exp4j jsp tag with expression language:
--%>
<h3>
    <expr4j:expr expr="${expr_str}" x="${x}">
        x = ${x}, ${expr_str} =
    </expr4j:expr>
</h3>
<%--
    Using exp4j jsp tag without tag body:
--%>
<h3>
    <expr4j:expr expr="sin(x)" x="4"/>
</h3>

<%--
    Using exp4j jsp tag with other tags:
--%>
<h3>
    <expr4j:expr x="2" y="3">
                <jsp:attribute name="expr">
                    2  + ${x}^2 - cos(sin(x^y))
                </jsp:attribute>
    </expr4j:expr>
</h3>


</body>
</html>
