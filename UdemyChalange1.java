import java.util.Scanner;

public class UdemyChalange1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter website Address");
        String url=sc.nextLine();


        String protocol=url.substring(0,url.indexOf(":"));

        String ext=url.substring(url.lastIndexOf(".")+1);

        
        if (protocol.equals("http")){
            System.out.println("hyper text transfer protocol");
        }else if(protocol.equals("ftp")){
            System.out.println("File transfer Protocal");
        }
        if (ext.equals("com")){
            System.out.println("Commertial");
        }else if(ext.equals("org")){
            System.out.println("Organization");

        }else if(ext.equals("net")){
            System.out.println("network");

        }

        }
    }
    
