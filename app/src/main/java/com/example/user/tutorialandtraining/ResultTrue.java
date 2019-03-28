package com.example.user.tutorialandtraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultTrue extends AppCompatActivity {

   private TextView t1result,t2result;
   private Button b1result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_true);

        t1result=findViewById(R.id.resulttext1id);
        t2result=findViewById(R.id.resulttext2id);
        b1result=findViewById(R.id.resulttextbuttonid);

        Bundle bundle=getIntent().getExtras();
        int score=bundle.getInt("finalscore");

        t2result.setText("You Scored "+score+" out of "+truefalsebook.questions.length);
        if (score==8)
        {
            t1result.setText("OutStanding");
        }else  if (score==7)
        {
            t1result.setText("Excellent");
        }
        else  if (score==3)
        {
            t1result.setText("Well-To-Do");
        }
        else  if (score==4)
        {
            t1result.setText("Good");
        }

        else  if (score==6)
        {
            t1result.setText("Very Nice");
        }
        else  if (score==9)
        {
            t1result.setText("Champion");
        }


        else  if (score==5)
        {
            t1result.setText("Very Very Good");
        }
        else
        {
            t1result.setText("Go Over Your Notes");
        }

        b1result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultTrue.this,ManyQuestion.class));
                ResultTrue.this.finish();
            }
        });
    }
}
