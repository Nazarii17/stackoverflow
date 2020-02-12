var app = angular.module("springApp", []);

app.controller("AppCtrl", function ($scope, $http) {
    $scope.websites = [];

    $http.get('http://localhost:8083//api/stackoverflow').success(function (data) {
        $scope.websites = data;
    })
});
