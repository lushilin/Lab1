package triangle;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class triangleTest {
	private String type;
	private int a;
	private int b;
	private int c;
	
	public triangleTest(String type, int a, int b, int c){
		this.type = type;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Parameters
	public static Collection prepareData(){
		Object[][] object = {
				{"not a triangle",1,1,2},{"equilateral",1,1,1},
				{"isosceles",2,2,3},{"scalene",2,3,4}};
		return Arrays.asList(object);
	}
	@Test
	public void TestTypeOfTriangle() 
	{
		triangle triangle = new triangle (); 
		assertEquals (type, triangle.typeOfTriangle(a,b,c)); 

	}

}

