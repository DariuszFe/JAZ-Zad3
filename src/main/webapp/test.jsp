<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="Rejestracja" action="post">

  Imię :<input type="text" name="name" /><br />
  Nazwisko :<input type="text" name="lastName" /><br />
  Email :<input type="text" name="email" /><br />
  Powtórz Email :<input type="text" name="email2" /><br />
  Nazwa pracodawcy :<input type="text" name="prac" /><br />
  Skąd dowiedziałeś się o konferencji : <br />
                        Ogłoszenie w pracy <input type="checkbox" name="ogloszenie" /><br />
                        Ogłoszenie na uczelni <input type="checkbox" name="ogloszenieucz" /><br />
                        Facebook <input type="checkbox" name="facebook" /><br />
                        Znajomi <input type="checkbox" name="znajomi" /><br />
                        Inne?(jakie) <input type="checkbox" name="inne" /><br />
                        <input type="text" name="jakie" /><br />
   Czym się zajmuje : <input type="text" name="zaj" /><br />
  <input type="submit" value=" OK ">
  
</form>

</body>
</html>