
<!doctype html>
<html lang="en">
  <head>
    <title>Documents</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
       <link rel="stylesheet" href="Documents.css">
  </head>
  <body>
      <section id="section1">
           <nav class="navbar navbar-expand-sm fixed-top">
               <a class="navbar-brand" href="Health%20wallet.HTML">
                <img src="Screenshot%20(167).png" alt="Logo" style="width:40px;">
              </a>
              <span class="navbar-text">
               Smarter Way to Health
              </span>
               <ul class="navbar-nav ml-auto ">
                <li class="nav-item">
                  <a class="nav-link" href="About%20us.css">Contact us</a>
                </li>
              </ul>
            </nav> 
          <h1>About us</h1>
      </section>
           <section id="section2">
          <h1>Documents</h1>
          <div class="card-deck">
              <div class="card">
                <img class="card-img-top" src="..." alt="document1">
                <div class="card-body">
                  <h4 class="card-title">Type of report</h4>
                  <p class="card-text">Data</p>
                    <p class="card-text">From</p>
                </div>
                <div class="card-footer">
                  <%
String msg = (String)request.getAttribute("msg");
if(msg!=null){
%>
<h1><%=msg%></h1>
<%} %>
<form action="UploadDownloadFileServlet" method="post" enctype="multipart/form-data">
Select File to Upload:<input type="file" name="fileName">
<br>
<input type="submit" value="Upload">
</form>
<%
String fileName = (String)request.getAttribute("filename");
if(fileName!=null){
%>
<a href="ViewFileServlet?fileName=<%=fileName%>" target="_blank">View <%=fileName%></a> / <a href="UploadDownloadFileServlet?fileName=<%=fileName%>">Download <%=fileName%></a>

<%} %>
                </div>
              </div>
      </section>
      <section id="section3">
          <footer>
            <nav class="navbar navbar-expand-sm bottom">
               <a class="navbar-brand" href="Health%20wallet.HTML">
                <img src="Screenshot%20(167).png" alt="Logo" style="width:40px;">
              </a>
              <span class="navbar-text">
              Smarter Way to Health
              </span>
               <ul class="navbar-nav ml-auto ">
                <li class="nav-item">
                  <a class="nav-link" href="About%20us.css">Contact us</a>
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