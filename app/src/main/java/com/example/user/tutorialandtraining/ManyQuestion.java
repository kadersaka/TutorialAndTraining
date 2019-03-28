package com.example.user.tutorialandtraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ManyQuestion extends AppCompatActivity {
    Button mulqus,truefalse,logout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_many_question);




        mulqus=findViewById(R.id.multiplequestionid);
        truefalse=findViewById(R.id.truefalsequestionid);
        logout2=findViewById(R.id.logoutid2);


        logout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logout2=new Intent(ManyQuestion.this,MainActivity.class);
                startActivity(logout2);
            }
        });


        mulqus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mul=new Intent(ManyQuestion.this,QuizActivity.class);
                startActivity(mul);
            }
        });
       truefalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mul=new Intent(ManyQuestion.this,TrueFalse.class);
                startActivity(mul);
            }
        });
    }

}
