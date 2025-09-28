import java.util.Scanner;

public class RectangleAreaAndPerimeter {
   public static void main(String[] strings) {
    Scanner sc = new Scanner(System.in);
       System.out.println("donner moi la largeur");
        double width = sc.nextDouble();
        System.out.println("donner moi la longueur");
        double height = sc.nextDouble();
        // Calculate the perimeter of the rectangle
        double perimeter = 2 * (height + width);
		
        // Calculate the area of the rectangle
        double area = width * height;			

        // Print the calculated perimeter using placeholders for values
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

        // Print the calculated area using placeholders for values
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
    }
}


