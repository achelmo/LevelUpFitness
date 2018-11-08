package edu.uwrf.csis343;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//test comment

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button userInfoButton = (Button) findViewById(R.id.userInfoButton);
    Button createWorkoutButton = (Button) findViewById(R.id.createWorkoutButton);
    Button startWorkoutButton = (Button) findViewById(R.id.startWorkoutButton);


    userInfoButton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
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


    }
}
