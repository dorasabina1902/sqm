import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestCaseEmployeeMethods {

	Employee emp;

	@Before
	public void setUp() throws Exception {
		emp = new Employee();
	}

	@Test
	public void testGetMinPointsCrossCheck() throws EmployeeException, PointsException {
		Random random = new Random();
		int noPoints = 98;
		ArrayList<Integer> points = new ArrayList<>();
		for (int i = 0; i < noPoints; i++)
			points.add(random.nextInt(11));

		emp.setGrades(points);

		int expectedMin = Collections.min(points);
		int actualMin = emp.getMinPoints();

		assertEquals(expectedMin, actualMin);
	}

	@Test
	public void testMultiplying2Numbers() {
		int value1 = 10;
		int value2 = 20;

		int expectedRes = value1 * value2;
		int actualRes = emp.multiplyNumbers(value1, value2);

		assertEquals(expectedRes, actualRes);
	}

	@Test
	public void testMultiplyNumbersInverse() {
		int value1 = 10;
		int value2 = 20;

		int actualRes = emp.multiplyNumbers(value1, value2);

		int difference = actualRes / value1;

		assertEquals(value2, difference);
	}

	@Category(ImportantTests.class)
	@Test
	public void testCostructorInverse() {
		String testName = "Bubu";
		int testAge = 23;
		ArrayList<Integer> testPoints = new ArrayList<>();
		emp = new Employee(testName, testAge, testPoints);

		assertNotNull(emp.getFullname());
		assertNotNull(emp.getCertificationPoints());
		assertNotEquals(0, emp.getAge());
	}

}
