package com.wm.feedback.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.Objectify;
import com.wm.feedback.dto.CompanyDTO;
import com.wm.feedback.services.ICompanyServices;
import com.wm.feedback.services.implementation.CompanyServices;
import com.wm.util.OfyService;

public class RegisterCompanyAction extends HttpServlet{
	
	private static final ICompanyServices companyService=new CompanyServices();
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			System.out.println("Going to register company");
			String companyName=request.getParameter("companyName");
			String companyAddress=request.getParameter("companyAddress");
			String contactNumber=request.getParameter("companyContactNumber");
			String companyEmail=request.getParameter("companyEmail");
			String companyPassword=request.getParameter("companyPassword");
			
			if(companyService.registerCompany(companyName,companyAddress,contactNumber,companyEmail,companyPassword)){
				RequestDispatcher rd=request.getRequestDispatcher("/jsp/login.jsp");
				rd.forward(request, response);
			}else{
				RequestDispatcher rd=request.getRequestDispatcher("/jsp/index.jsp");
				rd.forward(request, response);
			}
		}
}

