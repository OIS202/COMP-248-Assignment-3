
public class Binoculars {
	private double diameter ;
	private double mainLength;
	private double eyeLength;
	public Binoculars() {
		diameter = 0.0;
		mainLength = 0.0;
		eyeLength = 0.0;
	}
	public void magnification() {
		double magnification = 0.0;
		magnification = mainLength/eyeLength;
		
	}
	public void fNumber() {
		double fNumber = mainLength/diameter;
	}
}
