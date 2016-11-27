import shapes.Square;
import shapes.Rectangle;
import utils.Math;
public class Driver {
	public static void main(String[] args) {
		Square sq = new Square(100);
		System.out.println(sq.getArea());
		Rectangle rec = new Rectangle(50,80);
		System.out.println(rec.getArea());
		double num = 15.6;
		System.out.println(Math.factorial((int)num));
		System.out.println(Math.factorialLoop((int)num));
	}
}
