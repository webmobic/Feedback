package com.wm.feedback.services.implementation;

import com.wm.feedback.dao.ICompanyDAO;
import com.wm.feedback.dao.implementation.CompanyDAO;
import com.wm.feedback.dto.CompanyDTO;
import com.wm.feedback.services.ICompanyServices;

public class CompanyServices implements ICompanyServices{
	private static final ICompanyDAO companyDao=new CompanyDAO();
	CompanyDTO companyDto;
	@Override
	public boolean registerCompany(String companyName,String companyAddress,String contactNumber,String companyEmail,String companyPassword) {
		try{
		boolean flag=false;
		if(emailVerification(companyEmail)){
			companyDto=new CompanyDTO();
			companyDto.setCompanyName(companyName);
			companyDto.setCompanyAddress(companyAddress);
			companyDto.setCompanyContactNumber(contactNumber);
			companyDto.setCompanyEmail(companyEmail);
			companyDto.setCompanyPassword(companyPassword);
			flag=companyDao.registerCompany(companyDto);
			return flag;
		}else{
			return flag;
		}
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean emailVerification(String companyEmail){
		
		return companyDao.emailVerification(companyEmail); 
	}
}
