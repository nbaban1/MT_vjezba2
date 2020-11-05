package com.example.mt_vjezba2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        final RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        MyData myDataset1 = new MyData("Repo Name 1", "60k stars", R.drawable.avatar1);
        MyData myDataset2 = new MyData("Repo Name 2", "90k stars", R.drawable.avatar2);
        MyData myDataset3 = new MyData("Repo Name 3", "150k stars",R.drawable.avatar3 );
        MyData myDataset4 = new MyData("Repo Name 4", "160k stars", R.drawable.avatar4);
        MyData myDataset5 = new MyData("Repo Name 5", "260k stars", R.drawable.avatar5);

        final ArrayList<MyData> myDataset = new ArrayList<MyData>();
        myDataset.add(myDataset1);
        myDataset.add(myDataset2);
        myDataset.add(myDataset3);
        myDataset.add(myDataset4);
        myDataset.add(myDataset5);



        final RecyclerView.Adapter adapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(adapter);
    }
}