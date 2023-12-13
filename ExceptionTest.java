public class ExceptionTest{
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = i+1;
        }
        try{
            arr[7] = 0;
        }catch(ArithmeticException e){}
        finally{
            System.out.println("execute");
        }
        System.out.println("Done"); //Not executed because it was not an Arithmetic Exception
    }
}