package Java_Learning.OOPs;

//to show copy constructor

public class prac6 {

    // main func
    public static void main(String[] args) {
        BankAcc user1 = new BankAcc();
        user1.accNo = 1;
        user1.name = "Nishant";
        user1.Branch = "Main";

        BankAcc user2 = new BankAcc(user1);
        user2.accNo = 2;
        user2.name = "Singh";

        user1.getData();
        user2.getData();

    }
}

class BankAcc {
    int accNo;
    String name;
    String Branch;

    BankAcc() {

    }

    BankAcc(BankAcc x) { // copy constructor
        this.Branch = x.Branch;
    }

    void getData() {
        System.out.println("Acc No. : " + accNo);
        System.out.println("Name : " + name);
        System.out.println("Branch : " + Branch);
        System.out.println();
    }
}