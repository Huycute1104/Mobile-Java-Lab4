package com.example.lab4_senddata;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            String[] cityArr = {"Hanoi", "HCM", "Da Nang", "Phan Thiet"};
            User user = new User("Pham Tran Huy", "SE160548");
            Bundle bundle = new Bundle();
            bundle.putString("string", "Send data with Bundle");
            bundle.putInt("number", 2401);
            bundle.putStringArray("array", cityArr);
            bundle.putSerializable("user", user);

            intent.putExtra("Bundle", bundle);
            startActivity(intent);
        });
    }
}