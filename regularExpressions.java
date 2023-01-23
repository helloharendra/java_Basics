public class regularExpressions {
    public static void main(String[] args) {
        
        String str1="f";
        String str2="8";
        String str3="abcd";
        System.out.println(str1.matches(".")); // . matches only single characters else give false
        System.out.println(str2.matches(".")); // . matches only single characters else give false
        System.out.println(str3.matches(".")); // . matches only single characters else give false
        System.out.println(str1.matches("[abcf]")); // . matches only single characters else give false

        String str="a";
        System.out.println(str.matches("\\w")); // w works for both integer and character
        System.out.println(str.matches("\\W")); // w works for both integer and character

        String str4="4";
        System.out.println(str4.matches("\\d"));
        System.out.println(str4.matches("\\D"));
        System.out.println();

        String str5="abcabcabaac";
        System.out.println(str5.matches("[abc]"));
        System.out.println(str5.matches("[abc]*")); 
 





    }
    
}
