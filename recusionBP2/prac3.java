package Java_Learning.recusionBP2;

/*
 * Friends pairing problem
 * Given n friends, each one can remain single or can be
 * paired up with some other friends. Each friend can be
 * paired only once. Find out the total number of ways in
 * which friends can remain single or can be paired up.
 */

public class prac3 {
    public static int pairingFriends(int n) {

        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int fSingle = pairingFriends(n - 1);
        int fPair = (n - 1) * pairingFriends(n - 2);

        return fSingle + fPair;
    }

    public static void main(String[] args) {

        System.out.println("Total ways for 3 : " + pairingFriends(3));

    }
}