function Time($scope, $http) {
    $http.get('http://localhost:8080/time').
        success(function(data) {
            $scope.time = data;
        });
}
