package Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import DataLayer.Operations;
import models.Product;

public class ServiceCls implements Operations 
{

	@Override
	public Connection connect() throws SQLException,ClassNotFoundException 
	{
		
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch9009","root","angad#18");
    	if(con != null)
    		System.out.println("Successfully Connected !");
    	
    	return con;
		
	}

	@Override
	public void addProduct(Connection c, Product p) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllProducts(Connection c) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getById(Connection c, int d) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProduct(Connection c, int qty, int d) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(Connection c, int d) throws SQLException {
		// TODO Auto-generated method stub
		
	}