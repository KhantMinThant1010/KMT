public class repeated {
    public static void main(String[] args) {
        String input = "aadocnccnfaeufnda2312312";
        StringBuilder repeated = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (input.indexOf(c) < input.lastIndexOf(c) && repeated.indexOf(String.valueOf(c)) == -1) {
                repeated.append(c);
            }
        }
        System.out.println("Repeated characters: " + repeated);
    }
}