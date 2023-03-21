<html>

<body>
	<div class="main-form" id="main-form">
		<section>
			<h5 class="text-center">Enter your zipcode</h5>
			<div class="form-group">
				<input id="zipcode" type="text" class="form-control"
					placeholder="Enter zipcode here..." required="required">
			</div>
			<div class="form-group">
				<button onclick="loadData()" class="btn btn-primary btn-block">Find
					Area Details</button>
			</div>
		</section>
	</div>
	<div class="profile-area hideElement" id="profile-area">
		<section>
			<div id="loader" class="hideElement">
				<div class="spinner-border" role="status">
					<span class="sr-only">Loading...</span>
				</div>
			</div>
			<div id="profile" class="hideElement">
				<br> <br>


				<p>
					<strong>Country : </strong><span id="country"></span>
				</p>




				<p>
					<strong>State : </strong><span id="statename"></span>
				</p>




				<p>
					<strong>Localities : </strong><span id="associatedplaces"></span>
				</p>




				<p>
					<strong>Latitude : </strong><span id="associatedlatitude"></span>
				</p>




				<p>
					<strong>Longitude : </strong><span id="associatedlongitude"></span>
				</p>


			</div>
		</section>
	</div>
</body>
<script>
	function loadData() {
		document.getElementById("profile-area").classList.remove("hideElement");
		document.getElementById("loader").classList.remove("hideElement");
		document.getElementById("profile").classList.add("hideElement");

		var zipCode = document.getElementById("zipcode").value;

		if (zipCode != "" && zipCode != null) {
			var xhttp = new XMLHttpRequest();
			xhttp.onreadystatechange = function() {
				if (this.readyState == 4 && this.status == 200) {
					var jsonResponse = JSON.parse(this.responseText);
					document.getElementById("country").innerHTML = jsonResponse.country;
					document.getElementById("statename").innerHTML = jsonResponse.statename;
					document.getElementById("associatedplaces").innerHTML = jsonResponse.associatedplaces;
					document.getElementById("associatedlatitude").innerHTML = jsonResponse.associatedlatitude;
					document.getElementById("associatedlongitude").innerHTML = jsonResponse.associatedlongitude;
					document.getElementById("loader").classList
							.add("hideElement");
					document.getElementById("profile").classList
							.remove("hideElement");
				}
			};
			xhttp.open("GET", "getLocalityDetailsByZipCode?zipCode=" + zipCode,
					true);
			xhttp.send();
			console.log("done");
		} else {
			console.log("Enter zipcode...")
		}
	}
</script>

</html>