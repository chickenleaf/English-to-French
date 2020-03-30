package com.example.lashwinib.englishtofrench;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    public void playPhrase(View view)
    {
        Button buttonPressed = (Button) view;

        Log.i("Button Pressed", buttonPressed.getTag().toString());

        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(buttonPressed.getTag().toString(), "raw", getPackageName()));

        //int sound = getResources().getIdentifier(buttonPressed.getTag().toString(), "raw", getPackageName());

        //mediaPlayer = MediaPlayer.create(this,sound );
        //mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()

        mediaPlayer.start();

        //mediaPlayer= MediaPlayer.create(this, Uri.parse(Environment.getExternalStorageDirectory().getPath()+ "/Music/music.mp3"));

        //mediaPlayer.setLooping(true);

        //mediaPlayer.start();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
