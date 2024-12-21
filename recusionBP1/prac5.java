package Java_Learning.recusionBP1;

public class prac5 {
    //nth fibonacci term
    public static int fibo(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibo(n-1) + fibo(n-2);
    }
    
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
}
