<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container">

<table class="table">
	<tr>
		<th>Nom</th>
		<th>Prenom</th>
		<th>Adresse</th>
		<th>Ville</th>
	</tr>
<c:forEach items="${userlist}" var="user">
	<tr>
		<td>${user.nom}</td>
		<td>${user.prenom}</td>
		<td>${user.adresse}</td>
		<td>${user.ville}</td>
	</tr>
</c:forEach>
</table>

</div>