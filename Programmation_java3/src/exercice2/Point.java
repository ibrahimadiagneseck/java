package exercice2;

public class Point {
	
	private float x;
	private float y;
	
	
	public Point() {}
	
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point point) {
		this.x = point.x;
		this.y = point.y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public float distance(float x, float y) {
		return (float) Math.sqrt((x - this.x)*(x - this.x) + (y - this.y)*(y - this.y));
	}
	
	public float distance(Point point) {
		return (float) Math.sqrt((point.x - this.x)*(point.x - this.x) + (point.y - this.y)*(point.y - this.y));
	}
	
	public static float distance(float x1, float y1, float x2, float y2) {
		return (float) Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
	}
	
	public void deplacer(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void translater(float dx, float dy) {
		this.x = this.x + dx;    
        this.y = this.y + dy;
	}
	

	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
