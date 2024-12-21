package Java_Learning.recusionBP1;

public class prac4 {
    //sum of n natural numbers
    public static int sumNaturalNum(int n){
        if(n == 1){
            return 1;
        }

        int sum = n + sumNaturalNum(n-1);

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 8 natural numbers : "+sumNaturalNum(8));
    }
    
}