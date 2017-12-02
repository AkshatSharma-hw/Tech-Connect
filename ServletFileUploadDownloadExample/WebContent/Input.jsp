
<!doctype html>
<html lang="en">
  <head>
    <title>Health Wallet</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

      
      <script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
      
      
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
  </head>
  <body>
      <section id="section1">
           <nav class="navbar navbar-expand-sm fixed-top">
               <a class="navbar-brand" href="Health%20wallet.HTML">
                <img src="" alt="Logo" style="width:40px;">
              </a>
              <span class="navbar-text">
               Way to Health
              </span>
               <ul class="navbar-nav ">
                <li class="nav-item">
                  <a class="nav-link" href="#">Contact us</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">Join us!</a>
                </li>
              </ul>
            </nav> 
          <h1>navbar</h1>
      </section>
      <section id="section2">
          <h1>Form</h1>
           <form>
              <div class="form-group">
                <label for="email">Type</label>
                <input type="email" class="form-control" id="email">
              </div>
               <div class="form-group">
                <label for="email">From</label>
                <input type="email" class="form-control" id="email">
              </div>
               <div class="form-group">
                <label for="email">ID</label>
                <input type="email" class="form-control" id="email">
              </div>
               <div class="form-group">
                <label for="email">Date</label>
                <input type="email" class="form-control" id="email">
              </div>
              <button type="submit" class="btn btn-primary">Submit</button>
            </form> 
      </section>
      <section id="section3">
          <h1>Input</h1>
          <div ng-controller = "myCtrl">
         <input type = "file" file-model = "myFile"/>
         <button ng-click = "uploadFile()">upload me</button>
      </div>
      
      <script>
         var myApp = angular.module('myApp', []);
         
         myApp.directive('fileModel', ['$parse', function ($parse) {
            return {
               restrict: 'A',
               link: function(scope, element, attrs) {
                  var model = $parse(attrs.fileModel);
                  var modelSetter = model.assign;
                  
                  element.bind('change', function(){
                     scope.$apply(function(){
                        modelSetter(scope, element[0].files[0]);
                     });
                  });
               }
            };
         }]);
      
         myApp.service('fileUpload', ['$https:', function ($https:) {
            this.uploadFileToUrl = function(file, uploadUrl){
               var fd = new FormData();
               fd.append('file', file);
            
               $https:.post(uploadUrl, fd, {
                  transformRequest: angular.identity,
                  headers: {'Content-Type': undefined}
               })
            
               .success(function(){
               })
            
               .error(function(){
               });
            }
         }]);
      
         myApp.controller('myCtrl', ['$scope', 'fileUpload', function($scope, fileUpload){
            $scope.uploadFile = function(){
               var file = $scope.myFile;
               
               console.log('file is ' );
               console.dir(file);
               
               var uploadUrl = "/fileUpload";
               fileUpload.uploadFileToUrl(file, uploadUrl);
            };
         }]);
			
      </script>

      </section>
      <section id="section4">
          <h1>footer</h1>
          <footer>
            <nav class="navbar navbar-expand-sm bottom">
               <a class="navbar-brand" href="Health%20wallet.HTML">
                <img src="" alt="Logo" style="width:40px;">
              </a>
              <span class="navbar-text">
               Way to Health
              </span>
               <ul class="navbar-nav ">
                <li class="nav-item">
                  <a class="nav-link" href="#">Contact us</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">Join us!</a>
                </li>
              </ul>
            </nav> 
          </footer>
      </section>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
  </body>
</html>