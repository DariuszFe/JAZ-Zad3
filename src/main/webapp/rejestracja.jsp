<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="Rejestracja" method="post">

    Imię :<input type="text" name="name" required="required"/><br/>
    Nazwisko :<input type="text" name="lastName" required="required"/><br/>
    Email :<input type="email" name="email" required="required"/><br/>
    Powtórz Email :<input type="email" name="email2" required="required"/><br/>
    Nazwa pracodawcy :<input type="text" name="prac" required="required"/><br/>
  Skąd dowiedziałeś się o konferencji : <br />
                        Ogłoszenie w pracy <input type="checkbox" name="ogloszenie" /><br />
                        Ogłoszenie na uczelni <input type="checkbox" name="ogloszenieucz" /><br />
                        Facebook <input type="checkbox" name="facebook" /><br />
                        Znajomi <input type="checkbox" name="znajomi" /><br />
                        Inne?(jakie) <input type="checkbox" name="inne" /><br />
                        <input type="text" name="jakie" /><br />
    Czym się zajmujesz : <input type="text" name="zaj"/><br/>
  <input type="submit" value=" OK ">
  
</form>

</body>
</html>