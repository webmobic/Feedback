package com.wm.feedback.action;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.Objectify;
import com.wm.feedback.dto.ClientEmailDTO;
import com.wm.util.OfyService;

public class ClientEmailAction extends HttpServlet{
	private static final Objectify obfy=OfyService.ofy();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response){
		String clientEmail=request.getParameter("clientEmail");
		ClientEmailDTO client=new ClientEmailDTO();
		client.setClientEmail(clientEmail);
		obfy.save().entity(client).now();
	}

}
