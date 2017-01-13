var home = angular.module('techLookAppHome', []);

home.controller('HomeController', function($location) {

	// to highlight the active menu
	this.homeMenu = true;
});

home.controller('AboutController', function() {

	// to highlight the active menu
	this.aboutMenu = true;
});

home.controller('ContactController', function() {

	// to highlight the active menu
	this.contactMenu = true;
});

home.controller('BlogController', function() {

	// to highlight the active menu
	this.contactMenu = true;
});

home.controller('LoginController', function() {

	// to highlight the active menu
	this.contactMenu = true;
});
home.controller('RegisterController', function() {

	// to highlight the active menu
	this.contactMenu = true;
});