package com.wolken.wolkenapp;

import java.util.Scanner;

import com.wolken.wolkenapp.DTO.GunsDTO;
import com.wolken.wolkenapp.SERVICE.GunsService;
import com.wolken.wolkenapp.SERVICE.GunsServiceImpl;

public class GunsUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		GunsDTO gunsdto=new GunsDTO();
		
		GunsService gunsservice=new GunsServiceImpl();
		try {
		
		System.out.println("enetr the guns id");
		gunsdto.setGunid(scan.nextInt());
		System.out.println("Enter gun name");
		gunsdto.setName(scan.next());
		System.out.println("Enter gun price");
		gunsdto.setPrice(scan.nextDouble());
		System.out.println("Enter gun serialno");
		gunsdto.setSerialno(scan.next());
		System.out.println("Enter gun brandname");
		gunsdto.setBrandname(scan.next());
		System.out.println("Enter gun type");
		gunsdto.setType(scan.next());
		System.out.println("Enter gun noOfbullets");
		gunsdto.setNoofbullets(scan.nextInt());
		System.out.println("Enter made in");
		gunsdto.setMadein(scan.next());
		System.out.println(gunsdto);
		
		
		
		gunsservice.validateAndAdd(gunsdto);
		System.out.println("enetr the serial no");
		String serial=scan.next();
		System.out.println("enter the name");
		String name=scan.next();
		gunsservice.valiadteAndUpdate(serial,name);
		
		
		System.out.println("enetr the gun id to be deleted");
		int id=scan.nextInt();
		gunsservice.validateAndDelete(id);
		System.out.println("enetr brand name to be delete");
		String brandname=scan.next();
		gunsservice.getall(brandname);
		
		System.out.println("enetr country name to be delete");
		String countryname=scan.next();
		gunsservice.getallByCountry(countryname);

		Connect.closeConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
