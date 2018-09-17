package com.shieldfc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class SqliteQuery {

	public static Connection conn;
	public static Statement statmt;
	public static ResultSet resSet;


	// --------Connection to database--------
	public static void connect() throws ClassNotFoundException, SQLException 
	{
		conn = null;
		Class.forName("org.sqlite.JDBC");
		conn = DriverManager.getConnection("jdbc:sqlite:sqliteDBTest.db");
		System.out.println("database was connected");
		System.out.println("----------------------");
	}

	//---------Get first query-----------------
	public static List<String> getFirstQuery() throws ClassNotFoundException, SQLException, IOException {

		List<String> result = new ArrayList<>();

		String sql = Files.lines(Paths.get("first_query.sql")).collect(Collectors.joining("\n"));   //get first query from first_query.sql
		try ( // Autoclose
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery(sql)
				) {

			while (resultSet.next()) {
				String userStr = String.format("%s, %s, %s, %s",
						resultSet.getString("id"),
						resultSet.getString("name"),
						resultSet.getString("email_Address"),
						resultSet.getString("gender")
						);
				result.add(userStr);                              
			}
		}
		return result;
	}

	//---------Get second query-----------------
	public static List<String> getSecondQuery() throws ClassNotFoundException, SQLException, IOException {

		List<String> result = new ArrayList<>();

		String sql = Files.lines(Paths.get("second_query.sql")).collect(Collectors.joining("\n"));   //get second query from text file
		try ( // Autoclose
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery(sql)
				) {

			while (resultSet.next()) {
				String userStr = String.format("%s, %s, %s",
						resultSet.getString("name"),
						resultSet.getString("company_name"),
						resultSet.getString("city")
						);
				result.add(userStr);   
			}
		}
		return result;
	}

	//---------Get third query-----------------
	public static List<String> getThirdQuery() throws ClassNotFoundException, SQLException, IOException {

		List<String> result = new ArrayList<>();

		String sql = Files.lines(Paths.get("third_query.sql")).collect(Collectors.joining("\n"));   //get third query from text file
		try ( // Autoclose
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery(sql)
				) {

			while (resultSet.next()) {
				String userStr = String.format("%s, %s, %s",
						resultSet.getString("name"),
						resultSet.getString("company_name"),
						resultSet.getString("city")
						);
				result.add(userStr);   
			}
		}
		return result;
	}

	//---------Get fourth query-----------------
	public static List<String> getFourthQuery() throws ClassNotFoundException, SQLException, IOException {

		List<String> result = new ArrayList<>();

		String sql = Files.lines(Paths.get("fourth_query.sql")).collect(Collectors.joining("\n"));   //get fourth query from text file
		try ( // Autoclose
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery(sql)
				) {

			while (resultSet.next()) {
				String userStr = String.format("%s, %s, %s",
						resultSet.getString("name"),
						resultSet.getString("plan_name"),
						resultSet.getString("expiration_days")
						);
				result.add(userStr);   
			}
		}
		return result;
	}
	
	//---------Get fifth query-----------------
	public static List<String> getFifthQuery() throws ClassNotFoundException, SQLException, IOException {

		List<String> result = new ArrayList<>();

		String sql = Files.lines(Paths.get("fifth_query.sql")).collect(Collectors.joining("\n"));   //get fifth query from text file
		try ( // Autoclose
				Statement statement = conn.createStatement();
				ResultSet resultSet = statement.executeQuery(sql)
				) {

			while (resultSet.next()) {
				String userStr = String.format("%s, %s, %s", 
						resultSet.getString("men_name"),
						resultSet.getString("men_gender"),
						resultSet.getString("men_age"),
						resultSet.getString("men_company_company_name"),
						resultSet.getString("women_name"),
						resultSet.getString("women_gender"),
						resultSet.getString("women_age"),
						resultSet.getString("women_company_company_name")
						);
				result.add(userStr);   
			}
		}
		return result;
	}
}
