
package week.pkg1.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author deleryharrison
 * Program Name: Health Profile Console Application
 * Program Description: A user will be able to input their basic health information in the application
 */
public class Week1Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create Scanner object to get input in Console enviroment
        Scanner scan = new Scanner(System.in);
        
        // loop until user gives us an 'X'
        String name = "";
        
        while (true) {
            System.out.print("Enter name or X to quit: ");
            name = scan.nextLine();
            
            if (!name.equalsIgnoreCase("X")) {
                
                // get the rest of the information
                System.out.print("Enter age: ");
                int age = scan.nextInt();
                System.out.print("Enter weight: ");
                double weight = scan.nextDouble();
                System.out.print("Enter height - feet: ");
                int feet = scan.nextInt();
                System.out.print("Enter height - inches: ");
                double inches = scan.nextDouble();       // 10 ENTER
                scan.nextLine();    // read until it hits '\n or ENTER KEY -- use up the ENTER KEY              
                
                // show the health profile
                HealthProfile hp = new HealthProfile(name, age, weight, feet, inches);
                System.out.println("\n Health Profile for " + hp.getName());
                double bmi = hp.calculateBMI();
                DecimalFormat fmt = new DecimalFormat("0.0");
                System.out.println("BMI: " + fmt.format(bmi));
                System.out.println("BMI Category: " + hp.calculateCategory());
                System.out.println("Max heart rate: " + hp.calculateMaxHR());
                System.out.println();
            }
            else {
                break;  // break out of the while loop 
            }
        }
    }
    
}
