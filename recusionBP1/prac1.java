package Java_Learning.recusionBP1;

//print number in decresing order

public class prac1 {
        //func to print number in decresing order
        public static void decresing(int num) {
            if (num == 1) {
                System.out.print(num);
                return;
            }
    
            System.out.print(num+" ");
            decresing(num-1);
            
        }

    public static void main(String[] args) {
        decresing(5);
    }
}