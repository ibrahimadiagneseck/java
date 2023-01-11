package exercice2;

public class TestPoint {

	public static void main(String[] args) {
		
		Point point1 = new Point(2, 2);
		Point point2 = new Point(6, 6);
		
		System.out.println(point1);
		System.out.println(point2);
		
		float distance;
		
		distance = point1.distance(6, 6);
		System.out.println(distance);
		
		distance = point1.distance(point2);
		System.out.println(distance);
		
		distance = Point.distance(2, 2, 6, 6);
		System.out.println(distance);
		

	}

}
