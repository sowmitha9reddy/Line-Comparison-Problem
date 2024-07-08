package Line_Comparision;

import java.util.Scanner;



public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation Program in Master Branch");
		
		Line l1=new Line(0,1,1,2);
		Line l2=new Line(0,1,1,2);
		Line l3=new Line(0,1,3,3);
		
		System.out.println(l1.equals(l2));
		System.out.println(l1.hashCode());
		System.out.println(l2.hashCode());
		System.out.println(l2.equals(l3));
		System.out.println(l3.hashCode());
		
		
	}

}
 
 
 