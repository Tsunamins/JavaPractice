//java input/output/scanner examples including formatting of cli
//so not compilable in the present state
import java.util.*;
import java.util.Scanner;


public class JavaInputOutput {



    //example where series of integers passed in:
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            
            int a = scan.nextInt();
            System.out.println(a);
        }
        scan.close();
        
    }

    //example of double, int and continued string
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); 
        String s = scan.nextLine();

   
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
       
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
          
            System.out.printf("%-15s%03d%n", s1, x);
            
    
        }
        System.out.println("================================");

}


}
    

