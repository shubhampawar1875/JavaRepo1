package Datalayer;

import java.sql.*;
import models.Product;

public interface Operations 
{
	void connect() throws SQLException;
	void addProduct(Connection c,Product p) throws SQLException;
	void getAllProducts(Connection c) throws SQLException;
	void getById(Connection c,int d) throws SQLException;
	void updateProduct(Connection c,int qty,int d) throws SQLException;
	void deleteProduct(Connection c,int d) throws SQLException;
	
}