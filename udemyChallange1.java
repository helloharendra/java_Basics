//root of quadratic Equation
import java.util.Scanner;

public class udemyChallange1 {
    public static void main(String[] args) {
        
        double a,b,c;

        System.out.print("Enter the value of a,b,c");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        // x=sc.nextInt();

        double r1=((-b+Math.sqrt((b*b)-(4*a*c)))/(2*a));

        double r2=((-b-Math.sqrt((b*b)-(4*a*c)))/(2*a));

        // double root =((x+r1)*(x+r2));

        System.out.println("roots are :"+r1 +" "+r2);





    }
    
}
