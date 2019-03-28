package com.example.user.tutorialandtraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class LinkActivity extends AppCompatActivity {
    private Button tutorials,pdfs,classroom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tutorials=findViewById(R.id.tutorialsid);
        pdfs=findViewById(R.id.pdfsid);
        classroom=findViewById(R.id.classroomid);

        tutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tu=new Intent(LinkActivity.this,VideoActivity.class);
                startActivity(tu);
            }
        });
        pdfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pdf=new Intent(LinkActivity.this,SomePdf.class);
                startActivity(pdf);
            }
        });
        classroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cls=new Intent(LinkActivity.this,ClassRoom.class);
                startActivity(cls);
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
