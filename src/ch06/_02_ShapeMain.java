package ch06;

public class _02_ShapeMain {
	public static void main(String[] args) {
		_02_Rectangle rectangle = new _02_Rectangle();
		_02_Triangle triangle = new _02_Triangle();
		_02_Circle circle = new _02_Circle();
		
		_02_Shape[] shapes = new _02_Shape[3];
		
		shapes[0] = rectangle;
		shapes[1] = triangle;
		shapes[2] = circle;
		
		for(int i=0; i<shapes.length; i++) {
			shapes[i].draw();
		}
	}
}
