public class udemyChalange {
    public static void main(String[] args) {
        int b=1111001;
        String str=b+"";
        
        String str2="123A216";

        String str3="13/1/2023";
        
        System.out.println("Is Binary :"+str.matches("[01]*"));
        System.out.println("Is HexaDecimal "+str2.matches("[0-9],[A-F]*"));
        // System.out.println(str3.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}*"));



    }
    
}
