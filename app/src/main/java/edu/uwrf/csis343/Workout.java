package edu.uwrf.csis343;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Workout {

    private String mDate;
    private String mName;
    private ArrayList<Exercise> mExerciseList;

    //constructor
    public Workout(ArrayList<Exercise> exercises) {
        mDate = getDate();
        mExerciseList = exercises;
    }

    //getters
    public String getDate() { return mDate; }
    public String getName() { return mName; }
    public ArrayList<Exercise> getExerciseList() { return mExerciseList; }
    public String getTodaysDate() {
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yy");
        String formattedDate = df.format(c);
        return formattedDate;
    }

    //setters
    public void setDate() {
        this.mDate = getTodaysDate();
    }
    public void setExerciseList(ArrayList<Exercise> exerciseList) {
        this.mExerciseList = exerciseList;
    }
}
