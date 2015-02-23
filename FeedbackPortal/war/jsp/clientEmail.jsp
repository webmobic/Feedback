<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div class="panel-body" id="login_body">
                                <form action="/clientEmailAction" id="clientEmail" method="post">
                                       <br />
                                     <div class="form-group">
                                            <label>Email</label>
                                            <input name="clientEmail" type="text" class="form-control" placeholder="Your Email" />
                                        </div>
										
                                     <input type="submit" value="Register Email" class="btn btn-primary"/>
                                    <hr />
                                    Not register ? <a href="registeration.html" >click here </a> 
                                    </form>
                            </div>
</body>
</html>