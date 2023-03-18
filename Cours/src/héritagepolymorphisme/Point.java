package héritagepolymorphisme;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean identique(Point point) {
		if(this.x == point.x && this.y == point.y) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
	
		Point p1 = new Point(2, 2);
		Point p2 = new Point(2, 2); 
		PointColore pc1 = new PointColore(2, 2, (byte)3);
		PointColore pc2 = new PointColore(2, 2, (byte)3);
		
		System.out.println(p1.identique(p2));
		System.out.println(pc1.identique(pc2));
		
		Point p3 = new PointColore (3, 4, (byte)5);
		Point p4 = new PointColore (3, 4, (byte)6);
		
		System.out.println(p3.identique(p4));

	}

}
