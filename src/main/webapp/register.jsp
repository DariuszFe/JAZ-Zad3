<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Demo application</title>
    </head>
    
    <body>
    <center>
        <h2>Rejestracja</h2>
        
        <a href="index.jsp">Strona glowna</a>
        
        <div>
        	<form action="register_action" method="POST">
        		<table>
        			<tr>
        				<td>Login</td><td><input type="TEXT" name="username" /></td>
        			</tr>
        			<tr>
        				<td>Haslo</td><td><input type="password" name="password" /></td>
        			</tr>
        			<tr>
        				<td>Powtorz Haslo</td><td><input type="password" name="confirm_password" /></td>
        			</tr>
        			<tr>
        				<td>Email</td><td><input type="text" name="email" /></td>
        			</tr>
        			<tr>
        				<td></td><td><input type="submit" value="Register!" /></td>
        			</tr>
        		</table>
        	</form>
        </div>
        </center>
    </body>
</html>
