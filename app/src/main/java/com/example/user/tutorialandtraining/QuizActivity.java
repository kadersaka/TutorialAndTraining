package com.example.user.tutorialandtraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
    private QuestionLibrary mQuestionLibarary=new QuestionLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1,mButtonChoice2,mButtonChoice3;
    private Button quit;

    private  String mAnswer;
    private  int mScore=0;
    public int mQuestionNumber=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mScoreView=(TextView)findViewById(R.id.scroeid2);
        mQuestionView=(TextView)findViewById(R.id.firstqueid);

        mButtonChoice1=(Button)findViewById(R.id.firstoptionid);
        mButtonChoice2=(Button)findViewById(R.id.secondoptionid);
        mButtonChoice3=(Button)findViewById(R.id.thridoptionid);

        quit=findViewById(R.id.quitid);


        updateQuestion();

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quit=new Intent(QuizActivity.this,ManyQuestion.class);
                startActivity(quit);
                QuizActivity.this.finish();
            }
        });

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mButtonChoice1.getText()==mAnswer)
                {
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this,"correct",Toast.LENGTH_SHORT).show();

                }else
                {
                    Toast.makeText(QuizActivity.this,"wrong",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mButtonChoice2.getText()==mAnswer)
                {
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this,"correct",Toast.LENGTH_SHORT).show();

                }else
                {
                    Toast.makeText(QuizActivity.this,"wrong",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mButtonChoice3.getText()==mAnswer)
                {
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();///apadoto bad


                    Toast.makeText(QuizActivity.this,"correct",Toast.LENGTH_SHORT).show();




                }else
                {

                    Toast.makeText(QuizActivity.this,"wrong",Toast.LENGTH_SHORT).show();
                    //ar por joto question dibo avaby copy kore kore barabo
                    //then updatequestion method call korbo...kinto ata jeheto sesh question tai akhan a ami updateQuestion use na kore intent call korlm....




                   updateQuestion();//apadoto bad dilm
                }
            }
        });

    }
    private void updateQuestion()
    {


        mQuestionView.setText(mQuestionLibarary.getQuestion(mQuestionNumber));

        mButtonChoice1.setText(mQuestionLibarary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibarary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibarary.getChoice3(mQuestionNumber));

        mAnswer=mQuestionLibarary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
        if (mQuestionNumber==11)
        {
            end();
        }



    }

    public void end() {

        Intent end=new Intent(QuizActivity.this,ManyQuestion.class);
        startActivity(end);
    }

    private void updateScore(int point){
        mScoreView.setText(""+mScore);
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
