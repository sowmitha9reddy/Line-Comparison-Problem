package Line_Comparision;

import java.util.Objects;

class Line  implements Comparable<Line>{
	private int x1;
	private int y2;
	private int y1;
	private int x2;
	private float length;
	Line(int x1,int x2,int y1,int y2){
		this.x1=x1;
		this.y1=y1;
		this.y2=y2;
		this.x2=x2;
		
	}
	public int getX1() {
		return x1;
	}
	public int getY2() {
		return y2;
	}
	public int getY1() {
		return y1;
	}
	public int getX2() {
		return x2;
	}
	public float calculateLength() {
		length=(float)Math.sqrt((x2-x1)^2+(y2-y1)^2);
		
		return length;
	}
	 
	@Override
	public String toString() {
		
		return x1+" "+x2+" "+y1+" "+y2;
	}
	@Override
	public int compareTo(Line l2) {
		Line line1=this;
		System.out.println(line1);
		Line line2=l2;
		System.out.println(line2);
		Float line1Length=line1.calculateLength();
		Float line2Length=line2.calculateLength();
		return (-1)*line2Length.compareTo(line2Length);
		

	} 
	
	
	@Override
	public boolean equals(Object obj) {
	         
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Line line = (Line) obj;
	        return (x1 == line.x1 && y1 == line.y1 && x2 == line.x2 && y2 == line.y2) ||
	               (x1 == line.x2 && y1 == line.y2 && x2 == line.x1 && y2 == line.y1);
	    }

	    @Override
	    public int hashCode() {
	        return x1+y1+x2+y2;
	    }
		
	  
	    
	
	
}
