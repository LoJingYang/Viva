/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q6;
import java.util.Scanner;
/**
 *
 * @author 60115
 */
public class L3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner f =new Scanner(System.in);
                
        System.out.print("Enter the radius of a circle :");
        double radius =f.nextDouble();
        
        System.out.print("Enter the x-coordinate of the point: ");
        double x = f.nextDouble();
        
        System.out.print("Enter the y-coordinate of the point: ");
        double y = f.nextDouble();
        
        // Calculate the distance of the point from the center (0, 0) //Math.sqrt is suare root code
        double distance = Math.sqrt(x * x + y * y);

        // Determine if the point is inside, on, or outside the circle
        if (distance < radius) {
            System.out.println("The point (" + x +  ", "+ y +  ") is inside the circle.");
        } else if (distance == radius) {
            System.out.println("The point (" + x + ", " + y + ") is on the circle.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is outside the circle.");
        }
    }
    
}
