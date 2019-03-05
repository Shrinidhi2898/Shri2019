package org.controller;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.det.Customer;
import org.service.CusService;
import org.service.CusServiceImpl;

/**
 * Servlet implementation class PutSales
 */
@WebServlet("/PutSales")
public class PutSales extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	CusService serv = new CusServiceImpl();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("TEXT/HTML");
		PrintWriter  pw = response.getWriter();
		int uid = Integer.parseInt(request.getParameter("User_id"));
		String pdtname = request.getParameter("Product_name");
		String short_desc = request.getParameter("Short_desc");
		String det_desc = request.getParameter("Detailed_desc");
		String Category = request.getParameter("Category");
		int price = Integer.parseInt(request.getParameter("Starting_price"));
		String bid_date = request.getParameter("Bid_end_date");
		String status = "NOT SOLD";
		try
	    {
	      
	      SimpleDateFormat sdfSource = new SimpleDateFormat("mm/dd/yyyy");
	      
	     
	      Date date = sdfSource.parse(bid_date);
	      
	      SimpleDateFormat sdfDestination = new SimpleDateFormat("yyyy/mm/dd");
	      
	      
	      bid_date = sdfDestination.format(date);
	      
	  
	 
	      
	    }
	    catch(ParseException pe)
	    { 
	      System.out.println("Parse Exception : " + pe);
	    }
		Customer cus = new Customer(uid,pdtname,short_desc,det_desc,Category,price,bid_date,status);
		Boolean r = serv.Insert(cus);
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		
		if(r)
		{
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Registered');");
			pw.println("</sscript>");
			rd.forward(request, response);
			
			
		}
		else
			pw.println("error");
		
		
		
		
	}

}
