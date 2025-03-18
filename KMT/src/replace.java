public class replace {
    public static void main(String[] args) {
        String input = "An apple a day keeps a doctor away";
        input = input.toUpperCase().replace("A", "n");
        System.out.println(input);
    }
}