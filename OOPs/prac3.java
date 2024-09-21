package Java_Learning.OOPs;

//use of getters, setters and this

public class prac3 {

    public static void main(String[] args) {
        bankAccount user1 = new bankAccount();

        user1.name = "Nishant";
        user1.setPass("passWordAcc");

        System.out.println("Acc holder name : " + user1.name);
        System.out.println("Pass : " + user1.getPass());

    }
}

class bankAccount {
    public String name;
    private String pass;

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return this.pass;
    }
}