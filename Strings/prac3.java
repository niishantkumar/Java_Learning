package Java_Learning.Strings;

//given a route containing 4 directions (E, W, N, S)
//find the shortest path to reach destination

public class prac3 {

    // func to cal shortest dis
    public static float shortestDis(String str){
        float dis = 0;
        int x = 0;
        int y = 0;
        char dir;

        for(int i = 0; i<str.length(); i++){
            dir = str.charAt(i);
            if (dir == 'N') {
                y++;
            }
            else if (dir == 'S') {
                y--;
            }
            else if(dir == 'E'){
                x++;
            }
            else{
                x--;
            }
        }

        dis = (float)Math.sqrt((x*x) + (y*y));

        return dis;
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";

        System.out.println("The shortest distance is : " + shortestDis(str));
    }
}