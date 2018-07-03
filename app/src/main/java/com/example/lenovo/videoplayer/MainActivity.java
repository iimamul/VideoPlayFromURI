package com.example.lenovo.videoplayer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView=(VideoView)findViewById(R.id.videoview);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        Uri uri= Uri.parse("https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4");

        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);

        videoView.start();
    }
}
