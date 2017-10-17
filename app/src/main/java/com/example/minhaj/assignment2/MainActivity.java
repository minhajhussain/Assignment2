package com.example.minhaj.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView myRecylerView = (RecyclerView) findViewById(R.id.RecyclerView);
        myRecylerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<String> contacts = new ArrayList<>();
        for(int i =0 ; i<1000 ;i++)
        {
            contacts.add("Name " + "Number " + i + "Email: LaLa" );

        }

        myRecylerView.setAdapter(new ListAdapter(contacts));


    }

}
