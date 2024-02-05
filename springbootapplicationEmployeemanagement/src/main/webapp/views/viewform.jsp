<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<table border="1"> 
<tr> 
    <th>EmpId</th> 
    <th>EmpName</th> 
    <th>Designation</th> 
    <th>Email</th> 
    <th>Mobile</th> 
    <th>Gender</th> 
    <th>City</th> 
    <th>State</th>
    <th>Country</th> 
    <th>Address</th>
    <th>Delete</th>
     <th>Edit</th>

</tr> 
<c:forEach var="employee" items="${employees}"> 
    <tr>   
        <td>${employee.eid}</td>   
        <td>${employee.ename}</td>    
        <td>${employee.designation}</td>  
        <td>${employee.email}</td>  
        <td>${employee.mobile}</td>  
        <td>${employee.gender}</td>
        <td>${employee.city}</td>
        <td>${employee.state}</td>
        <td>${employee.country}</td>
        <td>${employee.address}</td>  
        <td> 
            <a href="/delete/${employee.eid}">Delete</a> 
        </td> 
        <td> 
            <a href="/edit/${employee.eid}">Edit</a> 
        </td> 
        </td>  
         </tr>   
</c:forEach> 
</table>

