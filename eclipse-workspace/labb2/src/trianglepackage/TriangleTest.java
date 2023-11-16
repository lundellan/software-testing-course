package trianglepackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * TriangleTest for testing the Triangle class.
 * This template is used in the exercise phase 1.
 * Students should add relevant unit test cases related to the Triangle 
 * class to this class.
 */
public class TriangleTest {

	private Triangle rightAngledTriangle;

	
	@BeforeClass
	/*
	 * The method run once before any of the test methods in the class.
	 */
	public static void setUpBeforeClass() throws Exception {
	
	}

	@AfterClass
	/* 
	 * The method will be run after all the tests in the class have been run
	 */
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	/*
	 * Initializes common objects. The method will be run before the Test method.
	 */
	public void setUp() throws Exception {
		rightAngledTriangle = new Triangle(3, 4, 5);
	}

	@After
	/*
	 *   Cleanup method. This method will be run after the Test method is completed
	 */
	public void tearDown() throws Exception {
		rightAngledTriangle = null;
	}

	//@Test
	/* 
	 * Tests whether the triangle specified in the fixture (setUp) 
	 * is right-angled. 	
	 *
	 * A public void method that is attached to be run as a test case. 
	 * To run the method, JUnit first constructs a fresh instance of the class then 
	 * invokes the annotated method. Any exceptions thrown by the test will be reported
	 * by JUnit as a failure. If no exceptions are thrown, the test is assumed to have 
	 * succeeded. 
	*/
	/*
	public void test1() {
		assertTrue("Should return true for a right-angled triangle",
				rightAngledTriangle.isRightAngled());
		assertEquals("Should return 'right-angled'", "right-angled", rightAngledTriangle.classify());		
	}*/
	
	/*classify*/
	
	@Test
	public void test2 ()	{
		Triangle triangle = new Triangle(2, 2, 2);
		assertEquals("equilateral", triangle.classify());
	}
	
	@Test
	public void test3 ()	{
		Triangle triangle = new Triangle(5, 5, 8);
		assertEquals("isossceles", triangle.classify());
	}
	
	@Test
	public void test4 ()	{
		Triangle triangle = new Triangle(3, 4, 5);
		assertEquals("right-angled", triangle.classify());
	}
	
	@Test
	public void test5 ()	{
		Triangle triangle = new Triangle(2, 3, 4);
		assertEquals("scalene", triangle.classify());
	}
	
	@Test
	public void test6 ()	{
		Triangle triangle = new Triangle(1, 1, 10);
		assertEquals("impossible", triangle.classify());
	}
	
	/*setSide*/
	
	@Test
	public void test7 ()	{
		Triangle triangle = new Triangle(1,1,1);
		assertEquals(triangle, triangle.setSideLengths(1,1,1));
	}
	
	/* getSide */
	
	@Test
	public void test8()	{
		Triangle triangle = new Triangle(2,2,2);
		assertEquals("2,2,2", triangle.getSideLengths());
	}

	/* getPeri */
	
	@Test
	public void test9()	{
		Triangle triangle = new Triangle(2,2,2);
		assertEquals(6, triangle.getPerimeter());
	}
	
	@Test
	public void test10()	{
		Triangle triangle = new Triangle(0,-1,4);
		assertEquals(-1, triangle.getPerimeter());
	}
	
	/* getArea */
	
	@Test
	public void test11()	{
		Triangle triangle = new Triangle(3,4,5);
		assertEquals(6, triangle.getArea(), 0.1);
	}
	
	@Test
	public void test12()	{
		Triangle triangle = new Triangle(1,1,10);
		assertEquals(-1.0, triangle.getArea(), 0.1);
	}
	
	/* isIsosceles */
	
	@Test
	public void test13()	{
		Triangle triangle = new Triangle(5,5,8);
		assertEquals(true, triangle.isIsosceles());
	}
	
	@Test
	public void test15()	{
		Triangle triangle = new Triangle(1,2,3);
		assertEquals(false, triangle.isIsosceles());
	}
	
	/* isEqu*/
	
	@Test
	public void test16()	{
		Triangle triangle = new Triangle(2,2,2);
		assertEquals(true, triangle.isEquilateral());
	}
	
	@Test
	public void test17()	{
		Triangle triangle = new Triangle(1,2,3);
		assertEquals(false, triangle.isEquilateral());
	}
	
	/* isScalene*/
	
	@Test
	public void test18()	{
		Triangle triangle = new Triangle(1,2,3);
		assertEquals(true, triangle.isScalene());
	}
	
	@Test
	public void test19()	{
		Triangle triangle = new Triangle(1,2,1);
		assertEquals(false, triangle.isScalene());
	}
	
/* isImpossible*/
	
	@Test
	public void test20()	{
		Triangle triangle = new Triangle(1,2,3);
		assertEquals(false, triangle.isImpossible());
	}
	
	@Test
	public void test21()	{
		Triangle triangle = new Triangle(1,1,10);
		assertEquals(true, triangle.isImpossible());
	}
	
	
	/* BVA */
	
	@Test
	public void test24 ()	{
		Triangle triangle = new Triangle(1, 1, 1);
		assertEquals("equilateral", triangle.classify());
	}
	
	@Test
	public void test25 ()	{
		Triangle triangle = new Triangle(2, 2, Math.sqrt(4));
		assertEquals("right-angled", triangle.classify());
	}
	
	
	
	
	
	
	
	
	
	
	@Test
	public void test22 ()	{
		Triangle triangle = new Triangle(1,1,1);
		assertEquals(triangle, triangle.setSideLengths(0,0,0));
	}
	
	@Test
	public void test23 ()	{
		Triangle triangle = new Triangle(1,1,1);
		assertEquals(triangle, triangle.setSideLengths(Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE));
	}
}
