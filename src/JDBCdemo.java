package anurag;

// IF java.sql not found error, go to module-info.java and add ---> requires java.sql;
// right click on project name, go to build path, go further and add connector.jar file


//in sql shell
//	show databases;
//	create database db_name;
//	use db_name;
//	show tables;
//	create table table_name(colName datatype, colname2 dType);
//	insert into table_name(colName, colname2) values(val1, val2), (val3, val4);
	

import java.sql.*;
public class JDBCdemo {

	public static void main(String[] args) {
		        
		try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "root"
            );
            System.out.println("Connection Successful!");

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Insert Data
            String insertQuery = "INSERT INTO students VALUES (6, 'Sita', 29)";
            stmt.executeUpdate(insertQuery);
            System.out.println("Data Inserted!");

            // 5. Retrieve Data
            String selectQuery = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("\nStudent Table Data:");
            while(rs.next()) {
                int id = rs.getInt("Roll");
                String name = rs.getString("name");
                System.out.println(id + " - " + name);
            }

            // 6. Close connection
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
		    }
		
	}


