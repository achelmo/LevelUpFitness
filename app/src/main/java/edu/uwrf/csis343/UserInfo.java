package edu.uwrf.csis343;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button backButton = (Button) findViewById(R.id.backButton);
        Button signOutButton = (Button) findViewById(R.id.signOutButton);
        TextView firstNameTextView = (TextView) findViewById(R.id.firstNameTextView);
        TextView lastNameTextView = (TextView) findViewById(R.id.LastNameTextView);


       // SQLiteDatabase db;
       // db.query(contacts)
        //Cursor dbCursor = mDataBase.query(TABLE_NAME, null, null, null, null, null, null);
        //String[] columnNames = dbCursor.getColumnNames();


        String fName = DatabaseHelper.COLOUMN_FirstName;
        //String lName = ;

        //firstNameTextView = (TextView)fName;

        firstNameTextView.setText("");
        firstNameTextView.append(DatabaseHelper.COLOUMN_FirstName);
        //name.setText("");
        //name.append("Id: "+cn.getID());
       // firstNameTextView.setText(lName);
        //findViewById(R.id.firstNameTextView) = fName;
       // firstNameTextView
       // String id = cursor.getString( DatabaseHelper.getColumnIndex("FirstName") );



        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(UserInfo.this, MainActivity.class);
                startActivity(intent);
            }
        });

        signOutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(UserInfo.this, LoginActivity2.class);
                startActivity(intent);
            }
        });

    }

}
