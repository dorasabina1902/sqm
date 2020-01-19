import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestCaseEmployeeCert {

	Employee emp;
	
	@Before
	public void setUp() throws Exception {
		
		ArrayList<Integer> certification_points = new ArrayList<>();
		certification_points.add(67);
		certification_points.add(88);
		emp = new Employee("Gheorghe Sabina",23,certification_points);	
	}
	
	@Category(ImportantTests.class)
	@Test
	public void testAddNewGradeRight() throws CertException {
		
		int existingNoGrades = emp.getCertificationPoints().size();
		CertMock mockCert = new CertMock();
		mockCert.setReturnedPoints(99);
		
		emp.addNewCertPoints("OCI", mockCert);
		
		assertEquals(existingNoGrades+1, emp.getCertificationPoints().size());

	}
	
	@Test(expected = CertException.class)
	public void testAddNewPointsException() throws CertException {
		
		CertMock mockExam = new CertMock();		
		mockExam.setReturnedPoints(-1);
		emp.addNewCertPoints("OCI", mockExam);

	}

}
