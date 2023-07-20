package UI_UX;

import java.sql.*;
import java.util.Scanner;
import services.ServiceCls;

public class JDBC_DAO_Operations 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		ServiceCls srv = new ServiceCls();
		int choice;
		String ch="Y";
		Scanner sc = new Scanner(System.in);
		
		Connection con = srv.connect();
		
		while(true)
		{
				
		System.out.println("\nMain Menu");
		System.out.println("1: Add ");
		System.out.println("2: Get All Products ");
		System.out.println("3: Get By Id");
		System.out.println("4: Update");
		System.out.println("5: Delete");
		System.out.println("6: Exit");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 2:
				srv.getAllProducts(con);				
				break;						
		
		}
		
		
		
		
		System.out.println("\nDo you want to continue: ");
		ch = sc.next();
		if(ch.equals("N") || ch.equals("n"))
			break;
		
		}
		
		
		
		
		
		
	}

}


}