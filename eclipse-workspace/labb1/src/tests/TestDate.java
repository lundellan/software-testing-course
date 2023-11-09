package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import labb1.NextDate;

public class TestDate {

	@Test
	public void test() {
		NextDate testDate = new NextDate(-1, 1, 2023);
		assertEquals("invalid Input Date", testDate.run(-1, 1, 2023));
	}
	
	@Test
	public void test18() {
		NextDate testDate = new NextDate(1, -1, 1900);
		assertEquals("invalid Input Date", testDate.run(1, -1, 1900));
	}
	
	@Test
	public void test1() {
		NextDate testDate = new NextDate(12, 30, 2020);
		assertEquals("12/31/2020", testDate.run(12, 30, 2020));
	}
	
	@Test
	public void test16() {
		NextDate testDate = new NextDate(12, 32, 2020);
		assertEquals("Invalid Input Date", testDate.run(12, 32, 2020));
	}
	
	@Test
	public void test17() {
		NextDate testDate = new NextDate(12, 32, 2021);
		assertEquals("Invalid Input Date", testDate.run(12, 32, 2021));
	}

	@Test
	public void test2() {
		NextDate testDate = new NextDate(12, 31, 2020);
		assertEquals("1/1/2021", testDate.run(12, 31, 2020));
	}
	
	@Test
	public void test3() {
		NextDate testDate = new NextDate(2, 28, 2020);
		assertEquals("2/29/2020", testDate.run(2, 29, 2020));
	}
	
	@Test
	public void test5() {
		NextDate testDate = new NextDate(2, 28, 2016);
		assertEquals("2/29/2016", testDate.run(2, 29, 2016));
	}
	
	@Test
	public void test4() {
		NextDate testDate = new NextDate(2, 28, 2019);
		assertEquals("3/1/2019", testDate.run(2, 28, 2019));
	}
	
	@Test
	public void test6() {
		NextDate testDate = new NextDate(2, 29, 2019);
		assertEquals("Invalid Input Date", testDate.run(2, 29, 2019));
	}
	
	@Test
	public void test9() {
		NextDate testDate = new NextDate(2, 27, 2019);
		assertEquals("2/28/2019", testDate.run(2, 27, 2019));
	}
	
	@Test
	public void test10() {
		NextDate testDate = new NextDate(2, 30, 2019);
		assertEquals("Invalid Input Date", testDate.run(2, 30, 2019));
	}
	
	@Test
	public void test7() {
		NextDate testDate = new NextDate(2, 28, 2000);
		assertEquals("2/29/2000", testDate.run(2, 28, 2000));
	}
	
	@Test
	public void test11() {
		NextDate testDate = new NextDate(1, 30, 2019);
		assertEquals("1/31/2019", testDate.run(1, 30, 2019));
	}
	
	@Test
	public void test12() {
		NextDate testDate = new NextDate(1, 31, 2019);
		assertEquals("2/1/2019", testDate.run(1, 31, 2019));
	}
	
	@Test
	public void test8() {
		NextDate testDate = new NextDate(2, 28, 1900);
		assertEquals("3/1/1900", testDate.run(2, 28, 1900));
	}
	
	@Test
	public void test13() {
		NextDate testDate = new NextDate(4, 30, 2019);
		assertEquals("5/1/2019", testDate.run(4, 30, 2019));
	}
	
	@Test
	public void test14() {
		NextDate testDate = new NextDate(4, 29, 2019);
		assertEquals("4/30/2019", testDate.run(4, 29, 2019));
	}
	
	@Test
	public void test15() {
		NextDate testDate = new NextDate(4, 31, 2019);
		assertEquals("Invalid Input Date", testDate.run(4, 31, 2019));
	}

}
