package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickButtonListner();

    }
    public void onClickButtonListner(){
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Context Context=getApplicationContext();
                        CharSequence text="Navigating Activity 2";
                        int duration=Toast.LENGTH_SHORT;
                        toast=Toast.makeText(Context,text,duration);
                        toast.show();
                        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                        startActivity(intent);

                    }
                }
        );
    }

}