package com.app.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        Button button=findViewById(R.id.log_in);
        button.setOnClickListener(this);
        LogInActivity logInActivity=this;
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
