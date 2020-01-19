import java.util.ArrayList;

public class Employee {
	
	public static final int MIN_POINTS = 56;
	public static final int MAX_POINTS = 92;
	public static final int MIN_AGE = 18;
	public static final int MAX_AGE = 60;

	String fullname; 
	//this is the full name of the employee
	int age; 
	//this is the age of the employee
	ArrayList<Integer> certification_points; 
	//this represents all the points that the employee has for all his certifications taken during last 5 years
	
	public Employee(String fullname, int age, ArrayList<Integer> certification_points) {
		this.fullname = fullname;
		this.age = age;
		this.certification_points = certification_points;
	}
	
	public Employee() {
		this.certification_points = null;
		this.fullname = "Jimmy Jimmy";
		this.age = 0;
	}
	
	public ArrayList<Integer> getCertificationPoints() {
		return certification_points;
	}

	@SuppressWarnings("unchecked")
	public void setGrades(ArrayList<Integer> certification_points) throws EmployeeException {
		if(certification_points == null)
			throw new EmployeeException();
		this.certification_points = (ArrayList<Integer>)certification_points.clone();
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws EmployeeException {
		if(age < Employee.MIN_AGE)
			throw new EmployeeException();
		this.age = age;
	}
	
	public int getMinPoints() throws PointsException{
		if(this.certification_points == null)
			throw new PointsException();
		if(this.certification_points.size() == 0)
			throw new PointsException();
		
		int minimum = this.certification_points.get(0);
		for(int certification_point : this.certification_points)
			if(minimum > certification_point)
				minimum = certification_point;
		return minimum;
	}
	
	public void addNewCertPoints(String certification, CertInterface cert) 
			throws CertException {
		int newPoints = cert.takeCert(certification, this);
		if(newPoints == -1)
			throw new CertException();
		this.certification_points.add(newPoints);
	}
	
	public int multiplyNumbers(int a, int b) {
		return a * b;
	}
	
	
}
