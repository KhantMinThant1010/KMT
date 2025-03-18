public class reverse {
    public static void printReverse(String string) {
        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printReverse("When the imposter is sus");
    }
}