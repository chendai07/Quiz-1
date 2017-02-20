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
package QBrating;
import java.util.*;
public class CalculateQBrating {
	public static void main(String[] args) {
		Scanner TD=new Scanner(System.in);    //input TD part
		System.out.print("Please input TD:"); //input TD part()
		double td=TD.nextDouble();             //input TD part
		                               
		Scanner Yards= new  Scanner(System.in);
		System.out.print("Please input Yards:");
		double yards=Yards.nextDouble();
		
		Scanner INT= new  Scanner(System.in);
		System.out.print("Please input INT:");
		double int1=Yards.nextDouble();
		
		Scanner COMP= new  Scanner(System.in);
		System.out.print("Please input COMP:");
		double comp=Yards.nextDouble();
		
		Scanner ATT= new  Scanner(System.in);
		System.out.print("Please input ATT:");
		double att=Yards.nextDouble();
		getMethod a= new getMethod();
		double a1=a.getA(comp, att);
		double b1=a.getB(yards, att);
		double c1=a.getC(td, att);
		double d1=a.getD(int1, att);
		System.out.print("The QB rating="+a.getQBRating(a1, b1, c1, d1));
		System.out.println();
		
	}
	

}
