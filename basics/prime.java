import java.util.* ; 

public class prime {
            public static void main(String[] args){
                        Scanner sc = new Scanner (System.in);
                        int n = sc.nextInt();
                        if(n==1){
                                    System.out.println("Not Prime Number");
                                    return ; 
                        }
                       for ( int  i = 2 ; i <= Math.sqrt(n); i++){
                                    if(n%i == 0 ){
                                                System.out.println("Not Prime");
                                                return ; 
                                    }
                       }
                       System.out.println("Prime number");
            }
}
