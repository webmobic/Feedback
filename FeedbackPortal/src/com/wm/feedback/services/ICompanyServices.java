package com.wm.feedback.services;

import com.wm.feedback.dto.CompanyDTO;

public interface ICompanyServices {

	boolean registerCompany(String companyName, String companyAddress,
			String contactNumber, String companyEmail, String companyPassword);
}
