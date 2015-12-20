<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container">

	<div class=" table-responsive">

		<button class="btn btn-primary" id="add_row"s>Ajouter</button>
		<button class="btn btn-primary">Supprimer</button>
		<button class="btn btn-primary">Nothing</button>
		<br><br>

		<table id="tab_logic" class="table-striped table-bordered table-hover"
			style="width: 100%;">
			<tr>
				<th>Nom</th>
				<th>Prenom</th>
				<th>Adresse</th>
				<th>Ville</th>
			</tr>
			<c:forEach items="${userlist}" var="user" varStatus="vs">
				<tr id="addr${vs.index}">
					<td>${user.nom}</td>
					<td>${user.prenom}</td>
					<td>${user.adresse}</td>
					<td>${user.ville}</td>
				</tr>
			</c:forEach>
			<tr id="addr5"></tr>
		</table>

	</div>
</div>