package Java_Learning.OOPs;

//interfaces

public class prac12 {

    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();
    }
    
}


interface chessPlayer {
    void moves();
}

class Queen implements chessPlayer {
    public void moves(){
        System.out.println("up, down, left, right, diagonally");
    }
}

class Rook implements chessPlayer {
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements chessPlayer {
    public void moves(){
        System.out.println("up, down, left, right, diagonally (by one step)");
    }
}