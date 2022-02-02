import java.util.Scanner;
public class Primerange {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
        primerange(a,b);
        
    }

    public static void primerange(int a, int b){
        for(int i = a; i<=b; i++){
               int count = 0;
             for(int j=1; j<=i; j++){
                 if(i%j==0){
                     count = count+1;
                 }
                }
                if(count == 2){
                    System.out.println(i);
                }
            }
        }
}
