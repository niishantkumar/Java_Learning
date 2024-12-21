package Java_Learning.recusionBP1;

public class prac2 {
    //func to print number in incresing order
    public static void incresingOrd(int num){
        if(num == 1){
            System.out.print(num+" ");
            return;
        }

        incresingOrd(num-1);
        System.out.print(num+" ");
    }

    public static void main(String[] args) {
        incresingOrd(6);
    }
    
}