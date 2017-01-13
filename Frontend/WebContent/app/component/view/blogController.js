angular.module('mkApp').
controller('BlogController',
 ['$scope', 'BlogService', function($scope, BlogService)
 {
	var self = this;
	self.blog = [];

	displayAllBlogs();

	function displayAllBlogs()
	{
		BlogService.displayAllBlogs().then(function(d)
		{
			self.blog=d;
		},
		function(errResponse)
		{
			console.error('unable to fetch it');
		})
	}
 }]);