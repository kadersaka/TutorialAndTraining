package com.example.user.tutorialandtraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    private Button ai,bv,ce,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ai=findViewById(R.id.pictureid);
        bv=findViewById(R.id.videoid);
        p=findViewById(R.id.pdfbuttontouploadid);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,AddImage.class);
                startActivity(i);
            }
        });

        bv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,ImpTopic.class);
                startActivity(i);
            }
        });


        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pi=new Intent(Home.this,UploadActivity.class);
                startActivity(pi);
            }
        });


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        if (id==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
