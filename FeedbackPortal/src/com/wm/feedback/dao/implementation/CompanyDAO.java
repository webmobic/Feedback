package com.wm.feedback.dao.implementation;

import java.util.List;

import com.googlecode.objectify.Objectify;
import com.wm.feedback.dao.ICompanyDAO;
import com.wm.feedback.dto.ClientEmailDTO;
import com.wm.feedback.dto.CompanyDTO;
import com.wm.util.OfyService;

public class CompanyDAO implements ICompanyDAO{
	private static final Objectify obfy=OfyService.ofy();
	@Override
	public boolean registerCompany(CompanyDTO companyDto) {
		try{
			obfy.save().entity(companyDto);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean emailVerification(String companyEmail) {
		boolean flag=false;
		try{
			List<ClientEmailDTO> clientEmailList=obfy.load().type(ClientEmailDTO.class)
						.filter("clientEmail", companyEmail)
						.list();
			for(ClientEmailDTO client:clientEmailList){
				if(client.getClientEmail().equals(companyEmail)){
					flag= true;
				}else{
					flag=false;
				}
			}
			return flag;
		}catch(Exception e){
			return false;
		}
	
	}
}
