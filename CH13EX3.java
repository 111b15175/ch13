
public class CH13EX3{
    public static void main(String[] args){
        int num=12,den=0;
        
        try{
            if(den == 0){
                throw new ArithmeticException("Division by zero is not allowed");
            }
            else{
                int ans=num/den;
                System.out.println("Ans:" + ans);
            }
        }
        catch(ArithmeticException e){
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
        finally{
            System.out.println("Finally block executed");
        }
        
    }
}