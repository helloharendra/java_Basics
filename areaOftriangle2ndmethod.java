import java.util.Scanner;

public class areaOftriangle2ndmethod {
    public static void main(String[] args) {
        int a,b,c;
        double s;

        System.out.println("Enter the value of a , b andc");

        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2f;

        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("value of s is :" +s);
        System.out.println(area);





    }
    
}
