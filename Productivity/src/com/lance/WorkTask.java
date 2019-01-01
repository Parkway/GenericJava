package com.lance;

/******************************************
 * Created by Lance Douglas on 12/31/2018
 ******************************************/
public class WorkTask {

    //Amount of loops for work to take.
    int totalRuns = 10;

    //"Working on workTask."
    void Execute() {
        System.out.println("Working on task...\n");
    }

    //workTask done?
    boolean Done() {
        while (totalRuns > 0) {
            totalRuns--;
            //If totalRuns = 0, task is complete.
            if (totalRuns == 0) {
                System.out.println(
                    "Task is completed!\n" +
                    "Give yourself the reward you deserve\n" +
                    "with a nice post-coffee shit."
                );
                //Return workTask = true;
                return true;
            } else {
                //If not done, return workTask = false;
                return false;
            }
        }
        //Just needs to be here
        //for nonVoid boolean.
        //Should*** never be reached.
        return false;
    }
}
