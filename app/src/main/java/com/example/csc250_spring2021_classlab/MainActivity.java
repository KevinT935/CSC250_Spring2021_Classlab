package com.example.csc250_spring2021_classlab;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Scanner;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText nameTV;
    EditText nameTV2;
    private Object Scanner;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Scanner = new Scanner((Readable)nameTV);
        Scanner input = new Scanner(String.valueOf(nameTV2));
        int number = input.nextInt();
    }
    public void onNextScreenButtonClicked(View v)
    {
        Intent i = new Intent(this,Screen2.class);
        this.startActivity(i);
    }
}