import java.util.Scanner;


//volume and area of cubiod
public class udemyChallenge2 {
    public static void main(String[] args) {

        int height,length,breath;
        System.out.print("Enter the value of height,length and breath");

        Scanner sc=new Scanner(System.in);
        height=sc.nextInt();
        length=sc.nextInt();
        breath=sc.nextInt();

        float totalArea=(length*breath+length*height+breath*height);
        float volume=(length*breath*height);
        System.out.println("total area is : "+totalArea);
        System.out.println("volume is : "+volume);

 
    }
     
}
