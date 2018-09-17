package com.shieldfc;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class SqlTest  {

	@Test(priority=1, description="testing sql query for first test")
	public void firstTest() throws ClassNotFoundException, SQLException, IOException {
		SqliteQuery.connect();
		List<String> expectedList = SqliteQuery.getFirstQuery();
		for (int i = 0; i < 9; i++) {

			List<String>getList = SqliteQuery.getFirstQuery();
			Assert.assertEquals(getList, expectedList);
		}
		
		System.out.println("Query checked 10 times");
		System.out.println("Result of first query: ");
		System.out.println(expectedList + "\n");
	}
	
	@Test(priority=2, description="testing sql query for second test")
	public void secondTest() throws ClassNotFoundException, SQLException, IOException {
		SqliteQuery.connect();
		List<String> expectedList = SqliteQuery.getSecondQuery();
		for (int i = 0; i < 9; i++) {

			List<String>getList = SqliteQuery.getSecondQuery();
			Assert.assertEquals(getList, expectedList);
		}
		
		System.out.println("Query checked 10 times");
		System.out.println("Result of second query: ");
		System.out.println(expectedList + "\n");
	}
	
	@Test(priority=3, description="testing sql query for third test")
	public void thirdTest() throws ClassNotFoundException, SQLException, IOException {
		SqliteQuery.connect();
		List<String> expectedList = SqliteQuery.getThirdQuery();
		for (int i = 0; i < 9; i++) {

			List<String>getList = SqliteQuery.getThirdQuery();
			Assert.assertEquals(getList, expectedList);
		}
		
		System.out.println("Query checked 10 times");
		System.out.println("Result of third query: ");
		System.out.println(expectedList + "\n");
	}
	
	@Test(priority=4, description="testing sql query for fourth test")
	public void fourthTest() throws ClassNotFoundException, SQLException, IOException {
		SqliteQuery.connect();
		List<String> expectedList = SqliteQuery.getFourthQuery();
		for (int i = 0; i < 9; i++) {

			List<String>getList = SqliteQuery.getFourthQuery();
			Assert.assertEquals(getList, expectedList);
		}
		
		System.out.println("Query checked 10 times");
		System.out.println("Result of fourth query: ");
		System.out.println(expectedList + "\n");
	}
	
	@Test(priority=5, description="testing sql query for fifth test")
	public void fifthTest() throws ClassNotFoundException, SQLException, IOException {
		SqliteQuery.connect();
		List<String> expectedList = SqliteQuery.getFifthQuery();
		for (int i = 0; i < 9; i++) {

			List<String>getList = SqliteQuery.getFifthQuery();
			Assert.assertEquals(getList, expectedList);
		}
		
		System.out.println("Query checked 10 times");
		System.out.println("Result of fifth query: ");
		System.out.println(expectedList + "\n");
	}
}
