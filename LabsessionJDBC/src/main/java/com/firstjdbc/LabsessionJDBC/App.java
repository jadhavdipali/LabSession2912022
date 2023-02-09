package com.firstjdbc.LabsessionJDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	static void Insertdata()
	{
		
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "dipalibjadhav");
			if(con.isClosed())
			{
				System.out.println("The connection is closed");
			}
			else
			{
				System.out.println("The connection is Established");
			}
			
			System.out.println("Inserting Your Data");
			//Creating the Insert Statement
    		String q = "insert into patient (p_id,p_name,p_addr) values(?,?,?)";
    		
			PreparedStatement pt = con.prepareCall(q);
    		
    		//Insert Record Using Scanner
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter patient id :- ");
    		int id = sc.nextInt();
    		System.out.println("Enter patient name :- ");
    		String name = sc.next();
    		System.out.println("Enter patient addr :- ");
    		String addr = sc.next();
    		
    		pt.setInt(1,id);
    		pt.setString(2,name);
    		pt.setString(3,addr);
    		
    		//Executing the query
    		pt.executeUpdate();
    		System.out.println("The Data Is Inserted Successfully....!");
    		
    		//Closing the connection
    		con.close();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	static void Updatdata()
	{
		
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "dipalibjadhav");
			if(con.isClosed())
			{
				System.out.println("The connection is closed");
			}
			else
			{
				System.out.println("The connection is Established");
			}
			
			System.out.println("Updating Your Data");
			//Creating the Insert Statement
    		String q = "update patient set p_name = ? , p_addr = ? where p_id=?";
    		
			PreparedStatement pt = con.prepareCall(q);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter patient name That you Want to change :- ");
			String name = sc.next();
			System.out.println("Enter patient addr That you want to change :- ");
			 String addr = sc.next();
			System.out.println("Enter patient Id where you want to change info :- ");
			int id = sc.nextInt();
			
			pt.setString(1,name);
			pt.setString(2, addr);
			pt.setInt(3, id);
			
			pt.executeUpdate();
			System.out.println("The Data Is Updated Successfully....!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void Deletdata()
	{
		
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "dipalibjadhav");
			if(con.isClosed())
			{
				System.out.println("The connection is closed");
			}
			else
			{
				System.out.println("The connection is Established");
			}
			
			System.out.println("Deleting Your Data");
			//Creating the Insert Statement
    		String q = "delete from patient where p_id = ?";
    		
			PreparedStatement pt = con.prepareCall(q);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter patent id the you want to delete :- ");
			int id = sc.nextInt();
			
			pt.setInt(1, id);
			
			pt.executeUpdate();
			System.out.println("The Data Is Deleted Successfully....!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	static void Displaydata()
	{
		
		try
    	{
			//Establish Connection To SQL											 (Database Name)    (User Name) (Pass)
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital","root","dipalibjadhav");
    		if(con.isClosed())
    		{
    			System.out.println("The connection is close");
    		}
    		else
    		{
    			System.out.println("The connection is Established");
    		}
    		
    		System.out.println("Displaying Your Data");
    		//Select Statement
        	String q = "select p_id,p_name,p_addr from patient";
        	PreparedStatement pt = con.prepareStatement(q);
        	ResultSet rset = pt.executeQuery();
        	
        	while(rset.next())
        	{
        		int id = rset.getInt(1);
        		String name = rset.getString(2);
        		String addr = rset.getString(3);
        	
        		
        		System.out.println("patient Id : "+id+" patient Name: "+name+" patient address: "+addr);
        	}
        	
        	//Closing the connection
    		con.close();
        }
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
	}
	
	static void operation()
	{	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Choise :-  1 : Insertion, 2 : Updation, 3 : Deletion, 4 : Display ");
			int c = sc.nextInt();
			
			switch(c)
			{
				case 1: Insertdata();
				break;
				
				case 2: Updatdata();
				break;
				
				case 3: Deletdata();
				break;
				
				case 4: Displaydata();
				break;
				
				default:System.out.println("Invalid Choice");
				break;
			}
	}
	
    public static void main( String[] args )
    {
    	operation();
        //System.out.println( "Hello World!" );
    }
}