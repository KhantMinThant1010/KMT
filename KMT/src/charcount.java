import java.util.Scanner;
public class charcount {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int c=0;
        System.out.print("Enter a word: ");
        String input=s.next();
        System.out.print("Enter the character you'd like to count: ");

        char cha=s.next().charAt(0);

        for(int i=0; i<input.length();i++) {
            if (input.charAt(i) == cha) {
                c++;
            }
        }
        System.out.println("The character "+cha+" appears "+c+" time(s).");
    }   
}