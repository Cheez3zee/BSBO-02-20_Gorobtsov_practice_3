package ru.mirea.gorobtsov.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = new TextView(this);
        Bundle arguments = getIntent().getExtras();
        String date = arguments.get("date").toString();
        textView.setText("КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ ЧИСЛО,"
                + Math. pow(4,2)  + " а текущее время " + date);
        setContentView(textView);
    }
}