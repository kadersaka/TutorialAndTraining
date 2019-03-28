package com.example.user.tutorialandtraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Home2 extends AppCompatActivity {
    private Button x,y,z,fet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        x=findViewById(R.id.xid);
        y=findViewById(R.id.yid);
        fet=findViewById(R.id.fetchpdfid);



        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

      x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte=new Intent(Home2.this,ImagesActivity.class);
                startActivity(inte);
            }
        });

        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte=new Intent(Home2.this,ImpTopic2.class);
                startActivity(inte);
            }
        });

        fet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fee=new Intent(Home2.this,Get.class);
                startActivity(fee);
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
