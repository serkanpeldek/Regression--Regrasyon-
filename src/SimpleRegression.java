import java.text.DecimalFormat;

public class SimpleRegression extends Regression {

	private double xMean;
	private double yMean;
	private double[] xiMinusxMean;
	private double[] yiMinusyMean;
	private double[] xyMultiplication;
	private double numerator,denominator;
	public SimpleRegression(double[] x, double[] y) {
		super(x, y);
		xMean=mean(x);
		yMean=mean(y);
	 	xiMinusxMean=new double[x.length];
		yiMinusyMean=new double[y.length];
		xyMultiplication=new double[y.length];
	
	}

	public void train(){
		iMinusMean(xiMinusxMean,yiMinusyMean);
		multiply();
		numerator=sum(xyMultiplication);
		denominator=squareSum(xiMinusxMean);
		B1=round(numerator/denominator);
		B0=round(yMean-B1*xMean);
		coefficients[0]=B0;
		coefficients[1]=B1;
		
		System.out.println(B0+" "+B1);
	}
	public double squareSum(double[] array ){
		double sum=0.0;
		for(int i=0;i<array.length;i++){
			sum+=array[i]*array[i];
		}
		return sum;
	}
	public void multiply(){
		
		for(int i=0;i<x.length;i++){
		 
			xyMultiplication[i]= xiMinusxMean[i]*yiMinusyMean[i];
		}
	}
	private void iMinusMean(double[] arrayX,double[] arrayY){
		DecimalFormat df = new DecimalFormat("#.##");
		for(int i=0;i<arrayX.length;i++){
			arrayX[i]= round(x[i]-xMean);
			arrayY[i]=round(y[i]-yMean);
		}
	}
	private double round(double val){
		val = val*100;
		val = Math.round(val);
		val = val /100;
		return val;
	}
	private double mean(double[] array){
		double sum=sum(array);
		double mean;
		 
		mean=sum/array.length;
		return mean;
	}
	
	private double sum(double[] array){
		double sum=0.0;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		return sum;
	}
}
