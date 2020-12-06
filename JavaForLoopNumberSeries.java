import java.util.*;
import java.io.*;
import java.lang.Math;

class JavaForLoopNumberSeries{
    public static void main(String []argh){
        //Scanner in = new Scanner(System.in);
        //int t=in.nextInt();

      

        // for(int i=0;i<t;i++){
        //     int a = in.nextInt();
        //     int b = in.nextInt();
        //     int n = in.nextInt();
        // }


        //in.close();

        //sample of incoming data
        int queries = 2;
        int a = 0;
        int b = 2;
        int n = 10;

        //track answer
        String answer = "";

        //first portion of series:
        int s0 = a + 1 * b;
        answer = answer + s0;
        System.out.println(answer);
  
        // track increasing number series
        int accumulator = 0;
        int exp = 1;

        for(int j = 1; j < n; j++){
            
            int base = 2;
            int current_exp = base * exp;
            //2 6 14 30 62 126 254 510 1022 2046
            accumulator = accumulator + (current_exp * b);
            int next_value = accumulator + s0;
            answer = answer + " " + next_value;
            exp = exp * 2;

            
    
        }

        System.out.println(answer);

        

        


    }
}
