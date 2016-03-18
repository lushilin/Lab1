package triangle;

import org.junit.Test ;

import triangle.triangle;
import static org.junit.Assert.*;
public class triangleTest {
	private triangle tri;
	@Test
	public void testCompare(){
		tri = new triangle();
		assertEquals("equilateral",tri.compare(3, 3, 3));
	}
}
