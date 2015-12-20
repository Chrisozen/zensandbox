$(document).ready(function(){
    var i=5;
   $("#add_row").click(function(){
	    var lastrowid = $('#yourtableid tr:last').attr('id');
	   
	    $('#addr'+i).html("" +
	    		"<td><input name='nom"+i+"' type='text' placeholder='Nom' class='form-control input-md'  /> </td>" +
	    		"<td><input name='prenom"+i+"' type='text' placeholder='Prenom' class='form-control input-md'  /> </td>" +
	    		"<td><input  name='adresse"+i+"' type='text' placeholder='Adresse'  class='form-control input-md'></td>" +
	    		"<td><input  name='ville"+i+"' type='text' placeholder='Ville'  class='form-control input-md'></td>");
	
	    $('#tab_logic').append('<tr id="addr'+(i+1)+'"></tr>');
	    i++; 
	});
});