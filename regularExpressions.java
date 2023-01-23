public class regularExpressions {
    public static void main(String[] args) {
        
        String str1="f";
        String str2="8";
        String str3="abcd";

        System.out.println(str1.matches(".")); // . matches only single characters else give false
        System.out.println(str2.matches(".")); // . matches only single characters else give false
        System.out.println(str3.matches(".")); // . matches only single characters else give false

    }
    
}
