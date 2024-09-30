package Java_Learning.recursionBasicsP1;

//print from n to 1(decreasing order)

public class prac1 {

    // recursive func to print from n to 1
    public static void print_Nto1(int n) {

        System.out.print(n + " ");
        if (n == 1) {
            return;
        }
        print_Nto1(n - 1);
    }

    // main func
    public static void main(String[] args) {
        print_Nto1(5);
    }

}