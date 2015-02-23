package com.wm.util;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import com.wm.feedback.dto.ClientEmailDTO;
import com.wm.feedback.dto.CompanyDTO;



public class OfyService {
	
	
	static {
		ObjectifyService.register(CompanyDTO.class);
		ObjectifyService.register(ClientEmailDTO.class);
	
    }

	 public static Objectify ofy() {       
	        return ObjectifyService.ofy();
	    }

	    public static ObjectifyFactory factory() {    	
	        return ObjectifyService.factory();
	    }
}
