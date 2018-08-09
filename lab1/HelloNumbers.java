public class HelloNumbers{
    public static void main(String[] args){
        int x = 1;
        int result_x = 0;
        while (x < 10){  
            System.out.println((x * x - x) / 2 + "");
            x = x + 1;
        }
    }
}