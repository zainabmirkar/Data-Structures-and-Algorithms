public class factorial {
    public static void main(String[] args){
        
       int factorial = fact(3); 
       System.out.println(factorial);
    }
    

    public static int fact(int number){
        int num = 3;

        int fact = 1;
        for(int i = 1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
}
