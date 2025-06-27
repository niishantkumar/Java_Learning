package Java_Learning.greedyAlgorithms;

import java.util.ArrayList;
import java.util.Collections;

//job sequencing problem

class Job {
    int jobId;
    int deadline;
    int profit;

    Job(int jobId, int deadline, int profit) {
        this.jobId = jobId;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class Prac7 {

    public static void main(String[] args) {
        int jobsINfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsINfo.length; i++) {
            jobs.add(new Job(i, jobsINfo[i][0], jobsINfo[i][1]));
        }

        Collections.sort(jobs, (ob1, ob2) -> (ob2.profit - ob1.profit));// descending order

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.jobId);
                time++;
            }
        }

        // print seq
        System.out.println("Max jobs executed : " + seq.size());
        System.out.println("Jobs executed : " + seq);
    }

}
