package Java_Learning.recusionBP1;

public class prac3 {
     //func for factorial
     public static int fact(int num){
        if(num == 1 || num == 0){
            return 1;
        }

        return num * fact(num - 1);
    }
    
   
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}