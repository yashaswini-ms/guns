package com.wolken.wolkenapp.SERVICE;

import com.wolken.wolkenapp.DTO.GunsDTO;

public interface GunsService {

	void validateAndAdd(GunsDTO gunsdto);

	void valiadteAndUpdate(String serial, String name);

	void validateAndDelete(int id);

	//void getall(GunsDTO gunsdto);

	void getall(String brandname);

	void getallByCountry(String countryname);

}
