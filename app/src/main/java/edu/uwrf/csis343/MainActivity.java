package edu.uwrf.csis343;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//test comment

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.main_listview);

        ArrayList<Exercise> exercises = null;
        exercises.add(new Exercise("test", 3, 10,50));
        Workout testWorkout = new Workout(exercises);
        ArrayList<Workout> workoutList = new ArrayList<Workout>();
        listView.setAdapter(new WorkoutListAdapter(this, workoutList));

        // Button userInfoButton = (Button) findViewById(R.id.userInfoButton);
        //Button createWorkoutButton = (Button) findViewById(R.id.createWorkoutButton);
        //Button startWorkoutButton = (Button) findViewById(R.id.startWorkoutButton);
        //Button startWorkoutButton = (Button) findViewById(R.id.startWorkoutButton);


    /*userInfoButton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, UserInfo.class);
            startActivity(intent);
        }
    });

        createWorkoutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateWorkout.class);
                startActivity(intent);
            }
        });


        startWorkoutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StartWorkout.class);
                startActivity(intent);
            }
        });
*/
    }
}