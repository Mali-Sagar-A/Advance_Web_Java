<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>i18n Locale Demo</title>

    <%-- Set the locale from param or browser default --%>
    <c:choose>
        <c:when test="${not empty param.theLocale}">
            <c:set var="theLocale" value="${param.theLocale}" />
        </c:when>
        <c:otherwise>
            <c:set var="theLocale" value="${pageContext.request.locale}" />
        </c:otherwise>
    </c:choose>

    <%-- Apply the locale to the session --%>
    <fmt:setLocale value="${theLocale}" scope="session" />
    <fmt:setBundle basename="com.app.jsp.tagDemo.i18n.resources.mylabels" />
</head>
<body>

    <a href="index.jsp?theLocale=en_US">English(US)</a>
    <a href="index.jsp?theLocale=es_ES">Spanish(ES)</a>
    <a href="index.jsp?theLocale=de_DE">German(DE)</a>
    <a href="index.jsp?theLocale=mr_IN">Marathi(IN)</a>

    <hr>

    <fmt:message key="label.greeting"/><br><br>
    <fmt:message key="label.firstname"/> <i>Sagar</i><br><br>
    <fmt:message key="label.lastname"/> <i>Mali</i><br><br>
    <fmt:message key="label.welcome"/><br><br>

    <hr>
    Selected Locale: ${theLocale}

</body>
</html>
