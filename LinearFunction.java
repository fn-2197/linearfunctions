package linearfunction;

public class LinearFunction implements LinearFunctionMethods {
public double b;
public double m;
	public LinearFunction(int bi, double mi){
		b = bi;
		m = mi;
	}
	
	public double getSlope() {
		
		return m;
	}

	
	public double getYintercept() {
		
		return b;
	}

	@Override
	public double getRoot() {
		double r = b/m;
		return r;
	}

	@Override
	public double getYvalue(double x) {
		
		double r = m*x + b;
		return r;
	}

	@Override
	public double getXvalue(double y) {
		
		double r = (y-b)/m;
		return r;
	}

	

}
