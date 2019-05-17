package com.example.thq.movielist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Movie_Activity extends AppCompatActivity {

    private TextView tvtitle, tvdescription, tvcategory;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_);

        tvtitle = (TextView) findViewById(R.id.txt_title);
        tvdescription = (TextView) findViewById(R.id.txt_desc);
        tvcategory = (TextView) findViewById(R.id.txt_cat);
        img = (ImageView) findViewById(R.id.moviethumbnail);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        tvtitle.setText(Title);
        tvdescription.setText(Description);
        img.setImageResource(image);

    }
}
