/**
 * Main logic of index page
 */
var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/video',{
            templateUrl: '/sections/video.ftl',
            controller: 'videoSectionController'
        })
        .when('/blog',{
            templateUrl: '/sections/blog.ftl',
            controller: 'blogSectionController'
        })
        .when('/about',{
            templateUrl: '/sections/about.ftl',
            controller: 'aboutSectionController'
        })
        .when('/contacts',{
            templateUrl: '/sections/contacts.ftl',
            controller: 'contactsSectionController'
        })
        .otherwise({ 
            redirectTo: '/'
        });
});
