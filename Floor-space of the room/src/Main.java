import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //inputs the Scanner and number Pi
        Scanner scanner = new Scanner(System.in);
        final double pi = 3.14;

        //user inputs the shape of the object
        String shape = scanner.nextLine();


        //program prints out the area depending on object shape and inputs
        switch (shape) {
            //in case of triangle, user inputs three numbers - sides of the triangle
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                //calculates the number p (half of paramiter of triangle)
                double p = (a + b + c) / 2;
                //calculates and prints out the area of triangle
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            //in case of rectangle, user inputs two numbers - sides of the rectangle
            case "rectangle":
                double h = scanner.nextDouble();
                double g = scanner.nextDouble();
                //calculates and prints out the area of the rectangle
                System.out.println(h * g);
                break;
            //in case of circle, user inputs one number - radius of the circle
            case "circle":
                double r = scanner.nextDouble();
                //calculates and prints out the circle area
                System.out.println(r * r * pi);
                break;
            //if the shape of object is unknown, program prints out the message
            default:
                System.out.println("Unknown object");
                break;
        }
    }
}