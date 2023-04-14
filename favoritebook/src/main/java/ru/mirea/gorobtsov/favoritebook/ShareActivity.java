package ru.mirea.gorobtsov.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView text = findViewById(R.id.textViewBook2);
            String university = extras.getString(MainActivity.KEY);
            text.setText(String.format("Мой любимая книга: %s", university));
        }
    }
    public void onClick(View v) {
        EditText editText = (EditText) findViewById(R.id.plain_text_input);
        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, editText.getText().toString());
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}