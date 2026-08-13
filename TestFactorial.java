public class TestFactorial{
    public static void main(String[]args){
        try{
            if(Factorial.factorial(5)!=120){
                throw new AssertionError("Test failed for input 5");
            }
            if(Factorial.factorial(0)!=1){
                throw new AssertionError("Test failed for input 0");
            }
            System.out.println("All tests Passed!");
        }catch(Exception e){
            System.out.println("Tests failed: "+ e.getMessage());
        }
    }
}