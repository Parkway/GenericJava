package com.lance;

/***********************************************************************
 * Created by Lance Douglas on 12/31/2018
 ***********************************************************************/
public class WorkTask {

    int totalRuns = 10;

    void Execute() {
        System.out.println("Working...\n");
    }

    boolean Done() {
        while (totalRuns > 0) {
            totalRuns--;
            if (totalRuns == 0) {
                System.out.println(
                    "Task is completed!\n" +
                    "Give yourself the reward you deserve\n" +
                    "with a nice post-coffee shit."
                );
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
