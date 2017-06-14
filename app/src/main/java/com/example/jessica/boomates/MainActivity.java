package com.example.jessica.boomates;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
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

        TextView btn = (TextView) findViewById(R.id.countdown_timer2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCountdown(v);
            }
        });



    }

    public void startCountdown(View v) {
        final TextView timer2 = (TextView) findViewById(R.id.countdown_timer2);
        CountDownTimer Count = new CountDownTimer(86400000, 1000) {
            public void onTick(long millisUntilFinished) {
                int seconds = (int) (millisUntilFinished / 1000) % 60 ;
                int minutes = (int) ((millisUntilFinished / (1000*60)) % 60);
                int hours   = (int) ((millisUntilFinished / (1000*60*60)) % 24);
                timer2.setText(hours + ":" + minutes + ":" + seconds);
            }

            public void onFinish() {
                timer2.setText("Finished");
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
