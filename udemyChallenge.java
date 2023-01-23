import java.util.Scanner;

public class udemyChallenge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        String num=sc.next();

        if(num.matches("[0110]+")){
            System.out.println("Binary");

        }else if(num.matches("[0-7]+")){
            System.out.println("Octal");

        }else if(num.matches("[0-9]+")){
            System.out.println("decimal");
        }else if(num.matches(".[0-9A-F]+")){
            System.out.println("Hexadecimal");
 
        }else{
            System.out.println("Not a number");
        }



    }
    
}
