package Java_Learning.OOPs;

//access specifiers

public class prac2 {

    public static void main(String[] args) {

        bankAcc user1 = new bankAcc();

        user1.setPass("pass");

        user1.display();
    }

}

class bankAcc {
    String name = "\"nish\"";
    String password;

    void setPass(String pwd) {
        password = pwd;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Password : " + password);
    }
}