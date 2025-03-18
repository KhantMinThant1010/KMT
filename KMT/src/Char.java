import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char word = s.next().charAt(0);
        

        if (word >= 65 && word <= 90) {
            System.out.println("The character is an uppercase letter.");
        } else if (word >= 97 && word <= 122) {
            System.out.println("The character is a lowercase letter.");
        } else if (word >= 48 && word <= 57) {
            System.out.println("The character is a digit.");
            
        } else {
            System.out.println("The character is a special symbol.");
        }
        System.out.println("What the sigma");
    }
}
