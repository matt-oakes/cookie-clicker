package io.codebar.cookieclicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView counterTextView;
    private int currentScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView cookieImage = (ImageView) findViewById(R.id.imgCookie);
        cookieImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentScore++;
                updateCounter();
            }
        });

        counterTextView = (TextView) findViewById(R.id.lblTotal);
        updateCounter();
    }

    private void updateCounter() {
        counterTextView.setText(String.valueOf(currentScore));
    }
}
