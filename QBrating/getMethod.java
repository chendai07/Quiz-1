package QBrating;

public class getMethod {
	public double getA(double comp,double att){
		double a;
		return a=(comp/att-3.0)*5.0;
	}
	public double getB(double yards,double att){
		double b;
		return b=(yards/att-3.0)*25;
	}
	public double getC(double td,double att){
		double c;
		return c=(td/att)*20.0;
	}
	public double getD(double int1,double att){
		double d;
		return d=2.375-(int1/att-25.0);
	}
	public double getQBRating(double a,double b,double c,double d){
		return (a+b+c+d)*100/6;
	}

}
