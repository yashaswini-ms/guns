package com.wolken.wolkenapp.SERVICE;

import java.sql.SQLException;

import com.wolken.wolkenapp.DAO.GunsDAO;
import com.wolken.wolkenapp.DAO.GunsDAOImpl;
import com.wolken.wolkenapp.DTO.GunsDTO;

public class GunsServiceImpl implements GunsService{
	GunsDAO gunsdao=new GunsDAOImpl();

	@Override
	public void validateAndAdd(GunsDTO gunsdto) {
		// TODO Auto-generated method stub
		System.out.println("&&&&");
		
	//	try {
		//	if(gunsdto.getPrice()!=0) {
				try {
					if(gunsdto!=null) {
					gunsdao.add(gunsdto);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					
					e.printStackTrace();
				}
				
			//}
		//}catch(Exception e) {
		//	e.printStackTrace();
		//}
		
	}

	@Override
	public void valiadteAndUpdate(String serial, String name) {
		// TODO Auto-generated method stub
		try {
			if(serial!=null) {
				gunsdao.updateBySerialNumber(serial,name);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void validateAndDelete(int id) {
		// TODO Auto-generated method stub\
		try {
			if(id!=0) {
				gunsdao.delete(id);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	
	@Override
	public void getall(String brandname) {
		// TODO Auto-generated method stub
		try {
			if(brandname!=null) {
				gunsdao.getall(brandname);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void getallByCountry(String countryname) {
		// TODO Auto-generated method stub
		try {
			gunsdao.getAllByCountryname(countryname);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	

	
		
		
		// TODO Auto-generated method stub
		
		
	}


