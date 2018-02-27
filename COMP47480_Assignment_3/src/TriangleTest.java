import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	Triangle triangle;
	@Before
	public  void setup() throws Exception {
		triangle = new Triangle();
	}
	@After
	public  void teardown()throws Exception {
		triangle= null;
	}

	@Test
	public void test_typeof_equilateral(){
		assertEquals(" This is not a Equilateral","Equilateral", triangle.typeof(1,1,1));
		assertNotEquals(" This is not a Equilateral","Equilateral", triangle.typeof(1,2,1));
		assertEquals(" This is not a Invalid","Invalid", triangle.typeof(0,0,0));	
	}
	
	@Test
	public void test_typeof_isosceles(){
		assertEquals(" This is not a Isosceles","Isosceles", triangle.typeof(1,1,2));
		assertEquals(" This is not a Isosceles","Isosceles", triangle.typeof(2,1,2));
		assertEquals(" This is not a Isosceles","Isosceles", triangle.typeof(2,1,1));
		assertNotEquals(" This is not a Scalene","Isosceles", triangle.typeof(1,2,3));
		assertEquals(" This is not a Invalid","Invalid", triangle.typeof(0,0,0));
	}
	
	@Test
	public void test_typeof_scalene(){
		assertEquals(" This is not a Scalene","Scalene", triangle.typeof(1,2,3));
		assertEquals(" This is not a Invalid","Invalid", triangle.typeof(0,0,0));
	}
	
	@Test
	public void test_typeof_valid_triangle(){
		assertEquals(" This is not a Invalid","Invalid", triangle.typeof(0,4,2));
		assertEquals(" This is not a Invalid","Invalid", triangle.typeof(1,0,9));
		assertEquals(" This is not a Invalid","Invalid", triangle.typeof(1,7,0));
	}

}
