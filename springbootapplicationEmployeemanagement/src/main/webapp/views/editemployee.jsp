<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <body bgcolor="pink">
        <h1>Edit Employee Details Here</h1>  
       <form:form method="GET" action="/editandsave">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden path="eid" /></td>  
         </tr>  
         <tr>    
            <td>Name :</td>    
            <td><form:input path="ename" /></td>  
           </tr>  
         <tr>    
          <td>Designation : </td>   
          <td><form:input path="designation"  /></td>  
         </tr>  
         <tr>    
          <td>Email :</td>    
          <td><form:input path="email" /></td>  
         </tr> 
         <tr>    
            <td>Mobile :</td>    
            <td><form:input path="mobile" /></td>  
           </tr>  
           <tr>    
            <td>Gender :</td>    
            <td><form:input path="gender" /></td>  
           </tr> 
           <td>City :</td>    
            <td><form:input path="city" /></td>  
           </tr> 
           <td>State :</td>    
            <td><form:input path="state" /></td> 
            </tr>
            <td>Country :</td>    
            <td><form:input path="country" /></td>
            </tr>
            <td>Address :</td>    
            <td><form:input path="address" /></td>   
           </tr>     
         <tr>    
          <td> </td>    
          <td><input type="submit" value="EditSave" /></td>    
         </tr>    
        </table>    
       </form:form>  
      
       </body>
