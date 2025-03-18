public class concat {
    public static void main(String[] args) {
        String one = "Hi, ";
        String two= "mom.";
                
        String result1 = one + two;
        System.out.println(result1);
       
        String result2 = one.concat(two);
        System.out.println(result2);
    }
}