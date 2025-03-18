import java.util.Random;

public class scramble {
    public static void main(String[] args) {
        String sentence = "when the imposter is sus";
        for (String word : sentence.split(" ")) {
            System.out.print(scrambleWord(word) + " ");
        }
    }
    public static String scrambleWord(String word) {
        if (word.length() <= 3)
        return word; 

        char[] chars = word.toCharArray();
        Random rand = new Random();

        for (int i = 1; i < chars.length - 1; i++) {
            int j;
            do {
                j = 1 + rand.nextInt(chars.length - 2); 
            } while (j == i); 

            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}