
public class GradientDecent extends Regression {


	// TODO Auto-generated method stub

private	double py,error;
private	double learningRate;
private	int epochs;

	


	public GradientDecent(double[] x,double[] y){
		  super(x,y);
		  learningRate=0.01;
		  epochs=4;
	}
	
	public void train(){
	 
		for(int i=0;i<x.length;i++){ 
			py=B0+B1*x[i];
			error=py-y[i];
			
			B0=B0-learningRate*error;
			B1=B1-learningRate*error*x[i];
			
			System.out.println(B0+"  "+B1);
			if(epochs>0&&i==4){
				epochs--;
				i=0;
				
			} 
			
			if(epochs==0)break;
		}
		
		double[] coefficients=new double[2];
		coefficients[0]=B0;
		coefficients[1]=B1;
	}
	


}
