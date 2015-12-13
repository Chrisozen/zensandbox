<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>Liste des mappings :</h2>
<c:forEach items="${paramList}" var="item">
	<li><a href="${item}">${item}</a> 
</c:forEach>