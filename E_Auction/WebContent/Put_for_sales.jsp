<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PUT FOR SALES</title>
</head>
<body>
       <form method="post" action="PutSales">
       <table >
       <tr><td>User_id</td><td> <input type="text" name="User_id" readonly value="006"></td></tr></br>
       <tr><td>Product Name</td><td><input type="text" name="Product_name" required></td></tr></br>
       <tr><td>Short Description</td> <td><textarea rows="4" cols="20" name="Short_desc" required></textarea></td></tr></br>
       <tr><td>Detailed Description</td><td><textarea rows="6" cols="20" name="Detailed_desc" required></textarea></td></tr></br>
       <tr><td>Category</td><td><select name="Category" required>
                                  <option value="default"></option>
                                  <option value="Book">Book</option>
                                  <option value="Furniture">Furniture</option>
                                  <option value="Electronics">Electronics</option>
                                  <option value="Car">Car</option>
                           </select></td></tr></br>
       <tr><td>Starting Price</td><td><input type="text" name="Starting_price" required></td></tr></br>
       <tr><td>Bid end date</td><td><input type="text" name="Bid_end_date" placeholder="MM/DD/YYYY" required></td></tr></br>
       <tr><td colspan="2"><input type="submit" value="Submit"></td></tr>
       </table>
              
       </form>

</body>

</html>