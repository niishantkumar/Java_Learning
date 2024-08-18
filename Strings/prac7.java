package Java_Learning.Strings;

//use of StringBulider

public class prac7 {

    // main func
    public static void main(String[] args) {

        StringBuilder alphabet = new StringBuilder("");

        // loop to add new chars to alphabet
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabet.append(ch);
        }

        System.out.println(alphabet);

        //converting StringBuilder into String
        alphabet.toString();

    }
}