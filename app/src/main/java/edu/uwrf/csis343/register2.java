package edu.uwrf.csis343;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register2 extends AppCompatActivity {

    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    //Button _registerButton;
    EditText _firstNameText;
    EditText _lastNameText;
    EditText _passwordText;
    EditText _phoneText;
    EditText _emailText;
    EditText _weightText;
    EditText _heightText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);


        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        openHelper=new sqliteHelp(this);
        Button _registerButton = (Button)findViewById(R.id.regButton);
        _firstNameText=(EditText)findViewById(R.id.firstNameText);
        _lastNameText=(EditText)findViewById(R.id.lastNameText);
        _passwordText=(EditText)findViewById(R.id.passwordText);
        _phoneText=(EditText)findViewById(R.id.phoneText);
        _emailText=(EditText)findViewById(R.id.emailText);
        _weightText=(EditText)findViewById(R.id.weightText);
        _heightText=(EditText)findViewById(R.id.heightText);


        _registerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                db=openHelper.getWritableDatabase();
                String fname = _firstNameText.getText().toString();
                String lname = _lastNameText.getText().toString();
                String pass = _passwordText.getText().toString();
                String phone = _phoneText.getText().toString();
                String email = _emailText.getText().toString();
                String weight = _weightText.getText().toString();
                String height = _heightText.getText().toString();
                insertdata(fname,lname,pass,phone,email,weight,height);
                Toast.makeText(getApplicationContext(), "register successfully",Toast.LENGTH_LONG).show();

            }
        });

    }


    public void insertdata(String fname, String lname, String pass, String phone, String email, String weight, String height){
        ContentValues contentValues = new ContentValues();
        contentValues.put(sqliteHelp.COLOUMN_FirstName, fname);
        contentValues.put(sqliteHelp.COLOUMN_LastName, lname);
        contentValues.put(sqliteHelp.COLOUMN_PASSWORD, pass);
        contentValues.put(sqliteHelp.COLOUMN_PHONE, phone);
        contentValues.put(sqliteHelp.COLOUMN_USERNAME, email);
        contentValues.put(sqliteHelp.COLOUMN_WEIGHT, weight);
        contentValues.put(sqliteHelp.COLOUMN_HEIGHT, height);
        long id = db.insert(sqliteHelp.TABLE_NAME, null, contentValues);
    }
}
