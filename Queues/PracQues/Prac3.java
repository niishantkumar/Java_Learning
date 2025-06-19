package Java_Learning.Queues.PracQues;

import java.util.Arrays;

/*
 We have an array of jobs where every job has a deadline and associated profit if the job is
 finished before the deadline. It is also given that every job takes a single unit of time, so the
 minimum possible deadline for any job is 1. Maximize the total profit if only one job can be
 scheduled at a time.

 Sample Input 1 :
 JobID  Deadline  Profit
   a       4        20
   b       1        10
   c       1        40
   d       1        30
   
 Sample Output 1 : c, a

 */

public class Prac3 {

  // func to calc max profit
  public static int maxProfit(Job arr[]) {
    int profit = 0;
    int max_deadline = 0;

    // loop to find max deadline
    for (int i = 0; i < arr.length; i++) {
      max_deadline = Math.max(max_deadline, arr[i].deadline);
    }

    char timeLine[] = new char[max_deadline];// array to track which timeline is not used yet
    // initial value * -> denoting not used
    for (int i = 0; i < timeLine.length; i++) {
      timeLine[i] = '*';
    }

    // sorting arr wrt profit in descending order
    Arrays.sort(arr, (job_a, job_b) -> (job_b.profit - job_a.profit));

    for (int i = 0; i < arr.length; i++) {
      for (int j = arr[i].deadline - 1; j >= 0; j--) {
        if (timeLine[j] == '*') {
          profit += arr[i].profit;
          timeLine[j] = arr[i].job_id;
          break;
        }
      }
    }

    // print jobs that got executed
    for (int i = 0; i < timeLine.length; i++) {
      if (timeLine[i] != '*') {
        System.out.print(timeLine[i] + " ");
      }
    }
    System.out.println();

    return profit;
  }

  // main func
  public static void main(String[] args) {

    Job jobs[] = new Job[4];

    jobs[0] = new Job('a', 4, 20);
    jobs[1] = new Job('b', 1, 10);
    jobs[2] = new Job('c', 1, 40);
    jobs[3] = new Job('d', 1, 30);

    System.out.println("Profit : " + maxProfit(jobs));
  }
}

class Job {

  public char job_id;
  public int deadline;
  public int profit;

  public Job(char job_id, int deadline, int profit) {
    this.job_id = job_id;
    this.deadline = deadline;
    this.profit = profit;
  }

}