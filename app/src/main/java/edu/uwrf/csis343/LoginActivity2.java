package edu.uwrf.csis343;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity2 extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
      //  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
   //     setSupportActionBar(toolbar);

 //      @Override
   //      public boolean onCreateOptionMenu(Menu menu){

   //     }


        Button loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText a = (EditText) findViewById(R.id.usernameText);
                String str = a.getText().toString();
                EditText b = (EditText) findViewById(R.id.passwordText);
                String pass = b.getText().toString();
                String password = helper.searchPass(str);

                if(pass.equals(password)) {
                    Intent intent = new Intent(LoginActivity2.this, MainActivity.class);
                    intent.putExtra("Username", str);
                    startActivity(intent);
                }
                else{
                    Toast temp = Toast.makeText(LoginActivity2.this,
                            "Username and password do not match!",
                            Toast.LENGTH_SHORT);
                    temp.show();
                }
            }
        });

        Button registerButton = (Button) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity2.this, register.class);
                startActivity(intent);
            }
        });


    }

}
