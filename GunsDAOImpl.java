package com.wolken.wolkenapp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wolken.wolkenapp.Connect;
import com.wolken.wolkenapp.DTO.GunsDTO;

public class GunsDAOImpl implements GunsDAO {
	Connection con=null;
	

	public GunsDAOImpl() {
		
		Connect.getConnect();
	}


	@Override
	public void add(GunsDTO gunsdto) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println(gunsdto);
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wolken?user=root&password=Yashu@25101999")){

		
		try (PreparedStatement preparedStatement = con
				.prepareStatement("insert into wolken.guns_table values(?,?,?,?,?,?,?,?)");) {
			preparedStatement.setInt(1, gunsdto.getGunid());

			preparedStatement.setString(2, gunsdto.getName());

			preparedStatement.setDouble(3, gunsdto.getPrice());

			preparedStatement.setString(4, gunsdto.getSerialno());
			preparedStatement.setString(5, gunsdto.getBrandname());
			preparedStatement.setString(6, gunsdto.getType());
			preparedStatement.setInt(7, gunsdto.getNoofbullets());
			preparedStatement.setString(8, gunsdto.getMadein());
			
			preparedStatement.executeUpdate();
			System.out.println("added");
			System.out.println(con);
			preparedStatement.close();
		}
		}
		
	}
	@Override
	public void updateBySerialNumber(String serial, String name) throws SQLException {
		// TODO Auto-generated method stub
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wolken?user=root&password=Yashu@25101999")){

		try (PreparedStatement ps = con
				.prepareStatement("update wolken.guns_table set guns_name= ? where guns_serial_no= ?");) {
			    ps.setString(1,name);
			    ps.setString(2,serial);
			    System.out.println("updated!!");
				ps.executeUpdate();
				ps.close();
		}
		}

		
	}
	@Override
	public void delete(int id) throws SQLException {
		
		// TODO Auto-generated method stub
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wolken?user=root&password=Yashu@25101999")){

		
		try (PreparedStatement ps = con.prepareStatement("delete from wolken.guns_table where gun_id= ?");) {
			ps.setInt(1, id);

			ps.executeUpdate();
			System.out.println("deleted");
			ps.close();
		}
		}
	}


	@Override
	public void getall(String brandname) throws SQLException {
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wolken?user=root&password=Yashu@25101999")){

		// TODO Auto-generated method stub
		try (PreparedStatement ps = con.prepareStatement("select * from wolken.guns_table where brand_name= ?");) {
			ps.setString(1, brandname);
			
			try (ResultSet rs = ps.executeQuery()) {

				while (rs.next()) {

					int id = rs.getInt("gun_id");
					String name = rs.getString("guns_name");
					double price = rs.getDouble("price");
					String serial = rs.getString("guns_serial_no");
					// preparedStatement.executeUpdate();
					String brandName=rs.getString("brand_name");
					String type=rs.getString("type");
					int no_of_bullets=rs.getInt("no_of_bullets");
					String made=rs.getString("made_in");
					
					System.out.println(id+""+name+""+price+""+serial+""+brandName+""+type+""+no_of_bullets+""+made);

				}
				rs.close();
				
			}
			
			
			
			
			

			//ps.executeUpdate();
			System.out.println("updated");
			
			ps.close();
		}
		}
		
	}


	@Override
	public void getAllByCountryname(String countryname) throws SQLException {
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wolken?user=root&password=Yashu@25101999")){

		// TODO Auto-generated method stub
		try (PreparedStatement ps = con.prepareStatement("select * from wolken.guns_table where made_in= ?");) {
			ps.setString(1, countryname);
			
			try (ResultSet rs = ps.executeQuery()) {

				while (rs.next()) {

					int id = rs.getInt("gun_id");
					String name = rs.getString("guns_name");
					double price = rs.getDouble("price");
					String serial = rs.getString("guns_serial_no");
					// preparedStatement.executeUpdate();
					String brandName=rs.getString("brand_name");
					String type=rs.getString("type");
					int no_of_bullets=rs.getInt("no_of_bullets");
					String made=rs.getString("made_in");
					
					System.out.println(id+""+name+""+price+""+serial+""+brandName+""+type+""+no_of_bullets+""+made);
				}
				rs.close();
			}
			ps.close();
			System.out.println("updated");
		
		}
		
		
		
		
	}

}
}
