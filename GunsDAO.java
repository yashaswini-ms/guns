package com.wolken.wolkenapp.DAO;

import java.sql.SQLException;

import com.wolken.wolkenapp.DTO.GunsDTO;

public interface GunsDAO {

	void add(GunsDTO gunsdto) throws SQLException;

	//void updateBySerialNumber(String serial, GunsDTO gunsdto) throws SQLException;

	void updateBySerialNumber(String serial, String name) throws SQLException;

	void delete(int id) throws SQLException;

	void getall(String brandname) throws SQLException;

	void getAllByCountryname(String countryname) throws SQLException;

}
