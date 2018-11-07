package edu.uwrf.csis343;

import java.util.ArrayList;

public class Exercise {

    private String mName;
    private int mSets;
    private int mReps;
    private double mWeight;

    //constructor
    public Exercise(String name) {
        mName = name;
        mSets = 0;
        mReps = 0;
        mWeight = 0;
    }

    //constructor with sets/reps/weight
    public Exercise(String name, int sets, int reps, double weight) {
        mName = name;
        mSets = sets;
        mReps = reps;
        mWeight = weight;
    }

    //getters
    public String getName() {
        return mName;
    }
    public int getSets() {
        return mSets;
    }
    public int getReps() {
        return mReps;
    }
    public double getWeight() {
        return mWeight;
    }

    //setters
    public void setmName(String name) {
        this.mName = name;
    }
    public void setmSets(int sets) {
        this.mSets = sets;
    }
    public void setmReps(int reps) {
        this.mReps = reps;
    }
    public void setmWeight(double weight) {
        this.mWeight = weight;
    }
}