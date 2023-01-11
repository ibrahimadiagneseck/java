package héritagepolymorphisme;

public class PointColore extends Point {
	
	private byte c;
	
	public PointColore() {
	}
	
	public PointColore(int x, int y) {
		super(x, y);
	}
	
	public PointColore(int x, int y, byte c) {
		super(x, y);
		this.c = c;
	}


	public boolean identique(PointColore pointColore) {
		if(super.identique(pointColore) && this.c == pointColore.c) {
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
