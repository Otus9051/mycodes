import java.util.Scanner;

public class AreaCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Shape Area Calculator");
        System.out.println("---------------------");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice (1-4): ");
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
                double rectangleLength = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double rectangleWidth = scanner.nextDouble();
                double rectangleArea = rectangleArea(rectangleLength, rectangleWidth);
                System.out.println("The area of the rectangle is: " + rectangleArea);
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
            default:
                System.out.println("Invalid choice!");
                break;
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
