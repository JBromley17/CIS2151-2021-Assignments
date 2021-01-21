

import java.util.Scanner;

/**
 *
 * @author Josiah Bromley
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner UserInput = new Scanner(System.in);
            System.out.println("Hello there, Insert Name: ");
            
            String name = UserInput.nextLine();
            System.out.println("Welcome, " + name + " Do you prefer Darkmode or LightMode?");
            
            String darkorlight = UserInput.nextLine();
            System.out.println("Setting mode to: " + darkorlight + ". Thank you, " + name);
    }
    
}
