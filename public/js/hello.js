function Hello($scope, $http) {
    $http.get('http://localhost:8080/greeting?name=cjh').
        success(function(data) {
            $scope.greeting = data;
        });
}
