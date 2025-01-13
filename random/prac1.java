package Java_Learning.random;

//subset of a string

public class prac1 {

    //func for subset
    public static void subset(String str){
        for(int i = 0; i<str.length();i++){
            for(int j = i; j<str.length();j++){
                for(int k = i; k<=j; k++){
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        String str = "NishantKumar";

        subset(str);
    }
}