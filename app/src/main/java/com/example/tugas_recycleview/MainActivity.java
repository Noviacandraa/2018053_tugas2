package com.example.tugas_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity { RecyclerView recylerView;

    String s1[], s2[],s3[];
    int images[] =
            {R.drawable.burger,R.drawable.hotdog,R.drawable.nasi,R.drawable.spageti,R.drawable.sushi,R.drawable.tomyum};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recylerView = findViewById(R.id.rv_food);

        s1 = getResources().getStringArray(R.array.makanan);
        s2 = getResources().getStringArray(R.array.deskripsi);
        s3 = getResources().getStringArray(R.array.star);
        MakananAdapter appAdapter = new
                MakananAdapter(this,s1,s2,s3,images);
        recylerView.setAdapter(appAdapter);
        recylerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
