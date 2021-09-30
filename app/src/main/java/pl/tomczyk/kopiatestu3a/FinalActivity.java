package pl.tomczyk.kopiatestu3a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Intent intent=getIntent();
        int score = intent.getIntExtra("wynik",0);
        textview =(TextView) findViewById(R.id.textView);
        textview.setText("twoj wynik to" + Integer.toString(score));
    }

    public void comeback(View view) {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
}