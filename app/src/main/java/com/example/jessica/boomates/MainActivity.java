package com.example.jessica.boomates;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean boom1 = true;
    boolean boom2 = true;
    boolean boom3 = false;
    boolean boom4 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        updateBooms();
    }

    public void startCountdown() {
        final TextView timer1 = (TextView) findViewById(R.id.countdown_timer1);
        CountDownTimer Count = new CountDownTimer(30000, 1000) {
            public void onTick(long millisUntilFinished) {
                timer1.setText("Seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                timer1.setText("Finished");
            }
        };

        Count.start();
    }

    public void updateBooms(){
        ImageView img1= (ImageView) findViewById(R.id.boom1);
        if(boom1) {
            img1.setImageResource(android.R.drawable.ic_delete);
        }
        ImageView img2= (ImageView) findViewById(R.id.boom2);
        if(boom2) {
            img2.setImageResource(android.R.drawable.ic_delete);
        }
        ImageView img3= (ImageView) findViewById(R.id.boom3);
        if(boom3) {
            img3.setImageResource(android.R.drawable.ic_delete);
        }
        ImageView img4= (ImageView) findViewById(R.id.boom4);
        if(boom4) {
            img4.setImageResource(android.R.drawable.ic_delete);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
