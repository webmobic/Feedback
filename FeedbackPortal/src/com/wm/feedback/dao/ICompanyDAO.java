package com.wm.feedback.dao;

import com.wm.feedback.dto.CompanyDTO;

public interface ICompanyDAO {
	
	public boolean registerCompany(CompanyDTO companyDto);

	public boolean emailVerification(String companyEmail);

}
