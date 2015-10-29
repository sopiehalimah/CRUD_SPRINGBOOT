angular.module('aplikasiSpringboot', ['ngRoute'])
        .config(function ($routeProvider){
            $routeProvider
            .when('/home',{
                templateUrl: 'views/home.html',
                controller: 'homeController'
                
            })
            .when('/',{
                templateUrl: 'views/dashboard.html',
                controller: 'dashboardController'
                
            })
});