package com.example.user.tutorialandtraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SomePdf extends AppCompatActivity {
    Button book1,book2,book3,book4,book5,book6,book7,book8,book9,book10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some_pdf);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        book1=findViewById(R.id.book1id);
        book2=findViewById(R.id.book2id);
        book3=findViewById(R.id.book3id);
        book4=findViewById(R.id.book4id);
        book5=findViewById(R.id.book5id);

        book6=findViewById(R.id.book6id);
        book7=findViewById(R.id.book7id);
        book8=findViewById(R.id.book8id);
        book9=findViewById(R.id.book9id);
        book10=findViewById(R.id.book10id);

        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent book1=new Intent(SomePdf.this,Book1.class);
                startActivity(book1);
            }
        });
        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent book2=new Intent(SomePdf.this,Book2.class);
                startActivity(book2);
            }
        });

        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent book3=new Intent(SomePdf.this,Book3.class);
                startActivity(book3);
            }
        });
        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent book4=new Intent(SomePdf.this,Book4.class);
                startActivity(book4);
            }
        });

        book5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent book5=new Intent(SomePdf.this,Book5.class);
                startActivity(book5);
            }
        });

        book6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent book6=new Intent(SomePdf.this,Book6.class);
                startActivity(book6);
            }
        });
        book7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent book7=new Intent(SomePdf.this,Book7.class);
                startActivity(book7);
            }
        });

        book8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent book8=new Intent(SomePdf.this,Book8.class);
                startActivity(book8);
            }
        });
        book9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent book9=new Intent(SomePdf.this,Book9.class);
                startActivity(book9);
            }
        });

        book10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent book10=new Intent(SomePdf.this,Book10.class);
                startActivity(book10);
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
