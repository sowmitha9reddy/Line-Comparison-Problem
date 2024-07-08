package Line_Comparision;

import java.util.Scanner;



public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation Program in Master Branch");
		Scanner scan= new Scanner(System.in);
		int x1=scan.nextInt();
		int x2=scan.nextInt();
		int y1=scan.nextInt();
		int y2=scan.nextInt();
		Line l1=new Line(x1,x2,y1,y2);
		System.out.println("Length of line:"+l1.calculateLength());
		
	}

}
 
 
 