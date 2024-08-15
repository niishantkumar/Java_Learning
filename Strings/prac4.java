package Java_Learning.Strings;

//comparison of strings

public class prac4 {

    public static void main(String[] args) {
        
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2){
            System.out.println("S1 == S2");
        }
        if (s1 == s3) {
            System.out.println("S1 == S3");
        }
        else{
            System.out.println("S1 == S3 is false");
        }

        if (s1.equals(s3)) {
            System.out.println("s1.equals(s3)");
        }
        if (s1.equals(s2)) {
            System.out.println("s1.equals(s2)");
        }
    }
    
}
