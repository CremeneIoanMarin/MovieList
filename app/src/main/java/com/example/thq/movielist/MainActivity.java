package com.example.thq.movielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Movie> lstMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstMovie = new ArrayList<>();
        lstMovie.add(new Movie("V for Vendetta", "Category Movie", "Description Movie", R.drawable.vforvendetta));
        lstMovie.add(new Movie("Equilibrium", "Category Movie", "Description Movie", R.drawable.equilibrium));
        lstMovie.add(new Movie("Fight Club", "Category Movie", "Description Movie", R.drawable.fightclub));
        lstMovie.add(new Movie("Gladiator", "Category Movie", "Description Movie", R.drawable.gladiator));
        lstMovie.add(new Movie("Inception", "Category Movie", "Description Movie", R.drawable.inception));
        lstMovie.add(new Movie("Se7en", "Category Movie", "Description Movie", R.drawable.se7en));
        lstMovie.add(new Movie("Forrest Gump", "Category Movie", "Description Movie", R.drawable.forrestgump));
        lstMovie.add(new Movie("Pulp Fiction", "Category Movie", "Description Movie", R.drawable.pulpfiction));
        lstMovie.add(new Movie("The Godfather", "Category Movie", "Description Movie", R.drawable.thegodfather));
        lstMovie.add(new Movie("Django Unchained", "Category Movie", "Description Movie", R.drawable.djangounchained));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstMovie);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);

    }
}
