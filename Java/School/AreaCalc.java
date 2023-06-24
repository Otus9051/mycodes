import java.util.Scanner;

public class AreaCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Shape Area Calculator");
            System.out.println("---------------------");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the side length of the square: ");
                    double squareSide = scanner.nextDouble();
                    double squareArea = squareArea(squareSide);
                    System.out.println("The area of the square is: " + squareArea);
                    break;

                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double rectLength = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double rectWidth = scanner.nextDouble();
                    double rectArea = rectangleArea(rectLength, rectWidth);
                    System.out.println("The area of the rectangle is: " + rectArea);
                    break;

                case 3:
                    System.out.print("Enter the radius of the circle: ");
                    double circleRadius = scanner.nextDouble();
                    double circleArea = circleArea(circleRadius);
                    System.out.println("The area of the circle is: " + circleArea);
                    break;

                case 4:
                    System.out.print("Enter the base length of the triangle: ");
                    double triangleBase = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double triangleHeight = scanner.nextDouble();
                    double triangleArea = triangleArea(triangleBase, triangleHeight);
                    System.out.println("The area of the triangle is: " + triangleArea);
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }

        scanner.close();
    }

    public static double squareArea(double side) {
        return side * side;
    }

    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
