
app.controller('videoSectionController', function($scope) {
    $scope.sectionTitle = "Our videos";
});

app.controller('blogSectionController', function($scope) {
    $scope.sectionTitle = "Blog";
});

app.controller('aboutSectionController', function($scope) {
    $scope.sectionTitle = "About Klarigo";
});

app.controller('contactsSectionController', function($scope) {
    $scope.sectionTitle = "Contacts";
});

app.controller('navigationBarController', function ($scope, $location) {
    $scope.isActive = function (viewLocation) {
        return viewLocation === $location.path();
    }
});