package edu.dtcc.emailman.custombrowser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the button reference
        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);

        // Create a listener for button 1
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an intent to launch a browser session
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://nbcnews.com"));
                // Start the activity
                startActivity(intent);
            }
        });

        // Create a listener for button 2
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an intent to launch a browser session
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://cbsnews.com"));
                // Start the activity
                startActivity(intent);
            }
        });

        // Create a listener for button 3
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an intent to launch a browser session
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://abcnews.com"));
                // Start the activity
                startActivity(intent);
            }
        });
    }
}
