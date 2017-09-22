package com.tut.tutorial;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button fight = (Button) findViewById(R.id.fightButton);


        final ImageView pokeball = (ImageView) findViewById(R.id.pokeball);
//        final ImageView pikachu = (ImageView) findViewById(R.id.pikachu);
//        final ImageView houndoom = (ImageView) findViewById(R.id.megahoundoom);
//        final ImageView alakazam = (ImageView) findViewById(R.id.megaAlakazam);
//        final ImageView blaziken = (ImageView) findViewById(R.id.Blaziken);

        final int[] pokeArray = {
                R.drawable.megalucario,
                R.drawable.pikachu,
                R.drawable.megahoundoom,
                R.drawable.megaalakazam,
                R.drawable.blaziken
        };

        final SoundPool sp = new SoundPool(5, AudioManager.STREAM_MUSIC,0);
        final int soundID = sp.load(this,R.raw.open,1);


        fight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Fight!","Fight Clicked");

                    sp.play(soundID,1.0f,1.0f,0,0,1.0f);


                Random ran = new Random();
                int number = ran.nextInt(5);
                Log.d("Random number","Number is "+ number);
                pokeball.setImageResource(pokeArray[number]);




            }
        });





    }
}
