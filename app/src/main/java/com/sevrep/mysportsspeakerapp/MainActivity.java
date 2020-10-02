package com.sevrep.mysportsspeakerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imgBoxing;
    private ImageButton imgKickboxing;
    private ImageButton imgJudo;
    private ImageButton imgKarate;
    private ImageButton imgAikido;
    private ImageButton imgTaekwondo;

    private MediaPlayer sportPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBoxing = findViewById(R.id.imgBoxing);
        imgKickboxing = findViewById(R.id.imgKickboxing);
        imgJudo = findViewById(R.id.imgJudo);
        imgKarate = findViewById(R.id.imgKarate);
        imgAikido = findViewById(R.id.imgAikido);
        imgTaekwondo = findViewById(R.id.imgTaekwondo);

        imgBoxing.setOnClickListener(this);
        imgKickboxing.setOnClickListener(this);
        imgJudo.setOnClickListener(this);
        imgKarate.setOnClickListener(this);
        imgAikido.setOnClickListener(this);
        imgTaekwondo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgBoxing: placeSportName(imgBoxing.getTag().toString()); break;
            case R.id.imgKickboxing: placeSportName(imgKickboxing.getTag().toString()); break;
            case R.id.imgJudo: placeSportName(imgJudo.getTag().toString()); break;
            case R.id.imgKarate: placeSportName(imgKarate.getTag().toString()); break;
            case R.id.imgAikido: placeSportName(imgAikido.getTag().toString()); break;
            case R.id.imgTaekwondo: placeSportName(imgTaekwondo.getTag().toString()); break;
            default:
        }
    }

    private void placeSportName(String sportName) {
        MediaPlayer sportPlayer = MediaPlayer.create(getApplicationContext(), getResources().getIdentifier(sportName, "raw", getPackageName()));
        sportPlayer.start();
    }
}