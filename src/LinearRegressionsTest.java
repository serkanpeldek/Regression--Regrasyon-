
public class LinearRegressionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] x={1,2,4,3,5};
		double[] y={1,3,3,2,5};
		
        GradientDecent gradientDecent=new GradientDecent(x,y);
    //    gradientDecent.train();
        
        SimpleRegression simpleRegression=new SimpleRegression(x,y);
        
        simpleRegression.train();

	}

}
