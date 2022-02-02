
import java.util.Scanner;
public class MaxMin{
    public static void main(String[] args){
         Scanner in = new Scanner(System.in);
         System.out.println("Enter 3 numbers :");
         int first = in.nextInt();
         int second = in.nextInt();
         int third = in.nextInt();

         int max = largest( first,  second,  third);
         System.out.println("Maximum number is" + max);

         int min = smallest(first, second, third);
         System.out.println("Minimum number is" + min);
        in.close();

    }

    public static int largest(int first, int second, int third){
           int max =  first;
           if(second>max){
               max= second;
           }
           if(third>max){
               max= third;
           }
           return max;
    }
    public static int smallest(int first, int second, int third){
           int min =  first;
           if(second<min){
               min= second;
           }
           if(third<min){
               min= third;
           }
          
           return min;
        }
    }