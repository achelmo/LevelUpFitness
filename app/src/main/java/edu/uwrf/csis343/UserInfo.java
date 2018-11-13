package edu.uwrf.csis343;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import edu.uwrf.csis343.SqliteHelp;

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


        String fName = SqliteHelp.COLOUMN_FirstName;
        String lName = SqliteHelp.COLOUMN_LastName;

        //firstNameTextView = (TextView)fName;

        firstNameTextView.setText("");
        firstNameTextView.append(SqliteHelp.COLOUMN_FirstName);
        //name.setText("");
        //name.append("Id: "+cn.getID());
        firstNameTextView.setText(lName);
        //findViewById(R.id.firstNameTextView) = fName;
       // firstNameTextView
       // String id = cursor.getString( SqliteHelp.getColumnIndex("FirstName") );



        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(UserInfo.this, MainActivity.class);
                startActivity(intent);
            }
        });

        signOutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(UserInfo.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }

}
