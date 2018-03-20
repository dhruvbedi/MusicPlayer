package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rock = (Button) findViewById(R.id.rock);
        rock.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent i = new Intent(MainActivity.this, Rock.class);
                                        startActivity(i);
                                    }
                                }
        );

        Button pop = (Button) findViewById(R.id.pop);
        pop.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Intent i = new Intent(MainActivity.this, Pop.class);
                                       startActivity(i);
                                   }
                               }
        );


        Button metal = (Button) findViewById(R.id.metal);
        metal.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent i = new Intent(MainActivity.this, Metal.class);
                                         startActivity(i);
                                     }
                                 }
        );


        Button edm = (Button) findViewById(R.id.edm);
        edm.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       Intent i = new Intent(MainActivity.this, Edm.class);
                                       startActivity(i);
                                   }
                               }
        );


    }
}