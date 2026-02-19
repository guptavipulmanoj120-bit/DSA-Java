import java.util.*;
class Loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //counter++ => counter = counter + 1
        for(int counter = 0; counter <= 3; counter++) {
         System.out.println("Hello World");
        }
        for(int i = 0; i <100; i++) {
         System.out.println(i);
        }
        int i = 0;

        while(i <= 10){
         System.out.println(i);
         i++;
        }

        int x = 0;
        
        do{
            System.out.println(x);
            x++;
        } while(x <=10);
        
         int n = sc.nextInt();
         
         int sum = 0;
        for(int j = 0; j <= n; j++ ) {
            sum = sum + j;
        }

        System.out.println(sum);
        for(int k = 1; k<11; k++) {
            System.out.println(k*n);
        }

        sc.close();
        

       
     }
}
