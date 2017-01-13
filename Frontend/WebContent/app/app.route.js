app.config(['$routeProvider','$locationProvider',
	function($routeProvider,$locationProvider)
	{
		$routeProvider.when('/about',{
			templateUrl: 'app/component/view/about.html',
			controller: 'AboutController',
			controllerAs: 'aboutCtrl'

		}).when('/contact',{
			templateUrl: 'app/component/view/contact.html',
			controller: 'ContactController',
			controllerAs: 'contactCtrl'

		}).when('/blog',{

			templateUrl: 'app/component/view/blog.html',
			controller: 'BlogController',
			controllerAs: 'blogCtrl'

		}).when('/home',{

			templateUrl: 'app/component/view/page.html',
			controller: 'HomeController',
			controllerAs: 'homeCtrl'

		}).when('/login',{

			templateUrl: 'app/component/view/login.html',
			controller: 'LoginController',
			controllerAs: 'loginCtrl'

		}).when('/register',{

			templateUrl: 'app/component/view/register.html',
			controller: 'RegisterController',
			controllerAs: 'registerCtrl'

		}).otherwise({
			redirectTo: '/home'
		})


	}]);