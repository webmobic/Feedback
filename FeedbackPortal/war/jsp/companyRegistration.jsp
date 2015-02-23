<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Company Registration</title>
	<!-- BOOTSTRAP STYLES-->
    <link href="/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="/css/font-awesome.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="/css/custom.css" rel="stylesheet" />
    <link href="/css/login.css" rel="stylesheet" />
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />

</head>
<body>
    <div class="container">
        <div class="row text-center  ">
            <div class="col-md-12">
                <br /><br />
                <h2>Admin : Register</h2>
               
                <h5>( Register yourself to get access )</h5>
                 <br />
            </div>
        </div>
         <div class="row">
               
                <div class="col-md-6 col-md-offset-3 col-sm-10 col-sm-offset-1 col-xs-12 col-xs-offset-0">
                        <div class="panel panel-default" id="login_penal">
                            
                            <div class="panel-body" id="login_body">
                                <form action="/registerCompanyAction" name="companyRegistration" id="companyRegistration" method="post">
<br/>
										<div class="form-group">
                                            <label>Company Name</label>
                                            <input name="companyName" type="text" class="form-control" placeholder="Enter Name" />
                                        </div>
										<div class="form-group">
                                            <label>Email</label>
                                           <input type="text" name="companyEmail" class="form-control" placeholder="Enter Email" />
                                        </div>
									 	<div class="form-group">
                                            <label>Password</label>
                                            <input name="companyPassword" type="password" class="form-control" placeholder="Enter Password" />
                                        </div>
										<div class="form-group">
                                            <label>Retype Password</label>
                                            <input name="retypePassword" type="password" class="form-control" placeholder="Retype Password" />
                                        </div> 
                                        <div class="form-group">
                                            <label>Adress</label>
                                            <input name="companyAddress" type="password" class="form-control" placeholder="Enter Address" />
                                        </div>
                                        <div class="form-group">
                                            <label>Contact No.</label>
                                            <input name="companyContactNumber" type="text" class="form-control" placeholder="Enter Contact No." />
                                        </div>
										 <input type="submit" class="btn btn-success " value="Register Me">	
                                        <hr />							 
                                    Already Registered ?  <a href="/loginPage" >Login here</a>
                                    </form>
                            </div>
                           
                        </div>
                    </div>
                
                
        </div>
    </div>


     <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="/js/jquery-1.10.2.js"></script>
      <!-- BOOTSTRAP SCRIPTS -->
    <script src="/js/bootstrap.min.js"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="/js/jquery.metisMenu.js"></script>
      <!-- CUSTOM SCRIPTS -->
    <script src="/js/custom.js"></script>
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-38955291-1', 'auto');
  ga('send', 'pageview');

</script>
</body>
</html>
