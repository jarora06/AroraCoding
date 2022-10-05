# Refer to Rectangle.java file
public class RectangleClient extends Rectangle{
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle();
		rec1.setFields(5, 8, 10, 4); 
		rec2.setFields(9, 3, 12, 21); 
		System.out.println("Rectangle 1: "+ rec1); //prints out the first rectangle
		System.out.println("Rectangle #2: "+ rec2); //prints out the second rectangle

}
}
