package com.example.challengetest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btnRegister);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edtTxtFirstName = findViewById(R.id.edtFirstName);
                TextView txtFirstName = findViewById(R.id.txtFirstName);
                txtFirstName.setText("FirstName: " + edtTxtFirstName.getText().toString());

                EditText edtTxtLastName = findViewById(R.id.edtLastName);
                TextView txtLastName = findViewById(R.id.txtLastName);
                txtLastName.setText("LastName: " + edtTxtLastName.getText().toString());

                EditText edtTxtEmail = findViewById(R.id.edtEmail);
                TextView txtEmail = findViewById(R.id.txtEmail);
                txtEmail.setText("Email: " + edtTxtEmail.getText().toString());
            }
        });
    }
}