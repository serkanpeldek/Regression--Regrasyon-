
public class Regression {

	protected	double[] x;
	protected	double[] y;
	protected	double B0;
	protected	double B1;
	protected	double[] coefficients=new double[2];
	
	public Regression(double[] x,double[] y){
		this.x=(double[]) x.clone();
		this.y=(double[]) y.clone();
		  B0=0.0;
		  B1=0.0;
	 
	}
	
	public double[] getCoefficients() {
		return coefficients;
	}
}
