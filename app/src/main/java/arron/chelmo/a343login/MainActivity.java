package arron.chelmo.a343login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button startWorkoutButton = (Button) findViewById(R.id.startWorkoutButton);


    startWorkoutButton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        }
    });

        Button createWorkoutButton = (Button) findViewById(R.id.createWorkoutButton);


        createWorkoutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateWorkout.class);
                startActivity(intent);
            }
        });

        Button viewInfoButton = (Button) findViewById(R.id.viewInfoButton);


        viewInfoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StartWorkout.class);
                startActivity(intent);
            }
        });



      //  protected void onCreate(Bundle savedInstanceState) {
      //      super.onCreate(savedInstanceState);
     //       setContentView(R.layout.activity_main);
     //   }

    }
}