class stringMethods{
    public static void main(String[] args) {
        String str1="     hellooharendra";
        System.out.println("String is : "+str1);
        System.out.println("String Length is : "+str1.length());
        System.out.println(str1 .toUpperCase());
        System.out.println(str1 .toLowerCase());
        System.out.println(str1 .trim());
        System.out.println(str1 .substring(6));
        System.out.println(str1 .substring(6,10));
        System.out.println(str1 .charAt(6));
        System.out.println(str1 .replace('h','n'));
        System.out.println(str1 .startsWith("h"));
        System.out.println(str1 .startsWith("h"));
        System.out.println(str1 .endsWith("a"));
        System.out.println(str1 .indexOf("n"));
        System.out.println(str1 .indexOf("?"));
        System.out.println(str1 .indexOf("."));
        System.out.println(str1 .indexOf(".",7));
         
        String str2="hellooharendra";
        System.out.println(str1 .equals(str2));
        System.out.println(str1 .equalsIgnoreCase(str2));
        System.out.println(str1 .compareTo(str2));














    }
}