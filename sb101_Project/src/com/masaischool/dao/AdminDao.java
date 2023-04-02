package com.masaischool.dao;

import com.masaischool.bean.Admin;
import com.masai.exception.AdminException;

public interface AdminDao  {
	
	//login admin
	public Admin loginAdmin(String username,String password)throws AdminException;
	
	
	//logout admin
	public void logoutAdmin() throws AdminException;

}

