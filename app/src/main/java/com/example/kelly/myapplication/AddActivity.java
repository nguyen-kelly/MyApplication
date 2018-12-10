package com.example.kelly.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
public class AddActivity extends AppCompatActivity {

    private DatabaseReference myRef;
    private FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("clients");
    }

    public void addClientToDatabase(View v) {
        EditText editName = findViewById(R.id.editName);
        String name = editName.getText().toString();

        EditText editNumber = findViewById(R.id.editNumber);
        String number = editNumber.getText().toString();

        if (name.length() > 0 && number.length() > 0) {
            String key = myRef.push().getKey();
            Client c = new Client(name, number, key);
            myRef.child(key).setValue(c);
            Toast.makeText(this, "hello has been added", Toast.LENGTH_SHORT).show();
        }
    }
}
