function updateMultiplication() {
	$.ajax({
		url: "http://localhost:8080/multiplications/random"
	}).then(function(data){
		// Cleans the form
		$("#attempt-form").find();
	});
}