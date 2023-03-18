package exercice1;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(4, 2);
		
		System.out.println(rectangle.perimetre());
		System.out.println(Rectangle.perimetre(4, 2));

	}

}
