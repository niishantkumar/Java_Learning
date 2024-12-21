package Java_Learning.recusionBP1;

public class prac10 {
    //x^n
    public static int pow(int num, int pow){
        if(pow == 0){
            return 1;
        }

        return num* pow(num,pow-1);
    }

    public static void main(String[] args) {
        System.out.println("5^3 = "+pow(5, 4));
    }
    
}