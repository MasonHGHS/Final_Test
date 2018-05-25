package com.example.a2007015.final_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.VideoView;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    VideoView Videoview;
    Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Videoview = (VideoView) findViewById(R.id.videoView);

        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.funny);
        Videoview.setVideoURI(uri);

        Button playButton = (Button) findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Videoview.start();
            }
        });
    }
}
