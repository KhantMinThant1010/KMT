import java.util.Scanner;

public class fullname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        scanner.close();
        
        String[] words = name.split(" ");
        StringBuilder name1  = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            name1.append(word.charAt(0));
        }
        System.out.println("Initials name : " + name1.toString().toUpperCase());
    }
}