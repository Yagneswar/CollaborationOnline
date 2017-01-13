angular.module('mkApp').factory('BlogService',['$http','$q',function($http,$q)
	{

		var REST_SERVICE_URI='http://localhost:8084/Yagnes_collaboration/blog/allblog';
		var factory={
			displayAllBlogs : displayAllBlogs
		};

		return factory;
		function displayAllBlogs()
		{
			var deferred=$q.defer();
			$http.get(REST_SERVICE_URI).then(function(response) {


				deferred.resolve(response.data);
			},
			 function(errResponse){
                console.error('Error while fetching Blog');
                deferred.reject(errResponse);
            });
			
			return deferred.promise;

		}
	}]);
	