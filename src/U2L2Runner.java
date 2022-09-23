public class U2L2Runner {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(150, 200); //Rectangle creation
        Rectangle r2 = new Rectangle(100);
        Rectangle r3 = new Rectangle();

        r1.setWidth(125); //Changing width ex 2
        r2.setWidth(125);
        r2.setLength(125);
        r3.setWidth(125);

        r1.printRectangleInfo(); //printing rectangle data
        r2.printRectangleInfo();
        r3.printRectangleInfo();

        System.out.print("The total length of fencing needed (all three rectangles) is:"); //prints the perimeter of all three Rectangles.
        System.out.print(r1.calculatePerimeter() + r2.calculatePerimeter() + r3.calculatePerimeter());
        System.out.println("ft.");
        System.out.print("The total grass seed needed is:");
        System.out.print(r1.calculateArea() + r2.calculateArea() + r3.calculateArea());
        System.out.print("sq ft.");
    }
}
