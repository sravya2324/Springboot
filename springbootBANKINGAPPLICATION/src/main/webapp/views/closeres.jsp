<%@ page contentType="text/html" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<body bgcolor="yellow">

<center>
<h1>SDFC BANK</h1><p></p>
<h3>EXTRAORDINARY SERVICES</h3><P></P>
<a href="/home" >Home</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/openaccount">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/closeaccount">Close A/C</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/aboutus">AboutUs</a>&nbsp;&nbsp;&nbsp;&nbsp;

<br><br>
<h1>Welcome ${name}</h1>
<br>
<p>Your account:${accno} has been deactivated ,status:${value}</p>

</center>
</body>