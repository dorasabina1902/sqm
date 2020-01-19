
public class CertMock implements CertInterface {

	public static final int NORMAL_POINTS = 100;

	private int returnedPoints;

	public void setReturnedPoints(int returnedPoints) {
		this.returnedPoints = returnedPoints;
	}

	@Override
	public int takeCert(String certName, Employee emp) {
		return returnedPoints;
	}

}
