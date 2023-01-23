public class UdemyChallange2 {
    public static void main(String[] args) {
        String str="a!B@c#12&";
        String str2="    abc   sda   asda";

System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

System.out.println(str2.replaceAll("\\s+"," ").trim());


String words[]=str2.split("\\s");
System.out.println(words.length);

    }
    
}
