package com.wm.feedback.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.googlecode.objectify.Objectify;
import com.wm.feedback.dto.CompanyDTO;
import com.wm.feedback.dto.SessionDTO;
import com.wm.util.OfyService;

public class LoginCompanyAction extends HttpServlet{
	private static final Objectify obfy=OfyService.ofy();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		System.out.println("Login user");
		String userEmail=request.getParameter("userName");
		String userPass=request.getParameter("userPass");
		
		List<CompanyDTO> companyList=obfy.load().type(CompanyDTO.class)
												.filter("companyEmail", userEmail)
												.list();
		if(companyList.size() != 0){
			System.out.println("User Exist");
			HttpSession session=request.getSession();
			SessionDTO sessionDto=new SessionDTO();
			for(CompanyDTO companyDto:companyList){
				if(authenticateUser(companyDto,userPass)){
					sessionDto.setUserName(companyDto.getCompanyEmail());
					sessionDto.setCompanyClientId(companyDto.getCompanyId().toString());
					session.setAttribute("sessionDTO", sessionDto);
					
				}
			}
			RequestDispatcher rd=request.getRequestDispatcher("/jsp/dashboard.jsp");
			rd.forward(request, response);
		}
}
	
	public boolean authenticateUser(CompanyDTO company,String password){
		boolean flag=false;
		try{
			if(password.equals(company.getCompanyPassword())){
				flag=true;
			}else{
				flag=false;
			}
		}catch(Exception e){
			
		}
		return flag;
	}

}
