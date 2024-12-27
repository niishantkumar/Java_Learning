package Java_Learning.recusionBP2.pracQues;

/* 
 * TOWER OF HANOI(Important!)
 * You have 3 towers and N disks of different sizes which can slide onto any tower.
 * The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e.,each disks its on top of an even larger one).
 * You have the following constraints:
 * (1) Only one disk can be moved at a time.
 * (2) A disk is slid off the top of one tower onto another tower.
 * (3)A disk can not be placed on top of a smaller disk.
 * Write a program to move the disks from the first tower to the last using Stacks
 */

public class prac4 {

    public static void towerHanoi(int n, int A, int C, int B) {
        if (n == 0) {
            return;
        }

        towerHanoi(n - 1, A, B, C);

        System.out.println(n + " disc is moved from " + A + " to " + C);

        towerHanoi(n - 1, B, C, A);
    }

    public static void main(String[] args) {
        towerHanoi(3, 1, 3, 2);
    }

}