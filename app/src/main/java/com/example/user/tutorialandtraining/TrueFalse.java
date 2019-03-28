package com.example.user.tutorialandtraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TrueFalse extends AppCompatActivity {

    private TextView mScoreViewTrue,mQuestionTrue;
    private ImageView mImageViewTrue;
    private Button mTrueButton,mFalseButton;

    private Boolean mAnswerTrue;
    private  int mScoreTrue=0;
    private  int mQuestionNumberTrue=0;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_false);

        mScoreViewTrue=findViewById(R.id.truescoreid);
        mQuestionTrue=findViewById(R.id.trueque1id);
        mImageViewTrue=findViewById(R.id.trueimageviewid);
        mTrueButton=findViewById(R.id.truebtn1id);
        mFalseButton=findViewById(R.id.truebtn2id);
        updateQuestionTrue();

        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAnswerTrue==true)
                {
                    mScoreTrue++;
                    updateScoreTrue(mScoreTrue);

                    if (mQuestionNumberTrue==truefalsebook.questions.length)
                    {
                        Intent i=new Intent(TrueFalse.this,ResultTrue.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("finalscore",mScoreTrue);
                        i.putExtras(bundle);
                        TrueFalse.this.finish();
                        startActivity(i);

                    }else
                    {
                        updateQuestionTrue();
                    }
                }else
                {
                    if (mQuestionNumberTrue==truefalsebook.questions.length)
                    {
                        Intent i=new Intent(TrueFalse.this,ResultTrue.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("finalscore",mScoreTrue);
                        i.putExtras(bundle);
                        TrueFalse.this.finish();
                        startActivity(i);

                    }else
                    {
                        updateQuestionTrue();
                    }
                }
            }
        });

        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAnswerTrue==false)
                {
                    mScoreTrue++;
                    updateScoreTrue(mScoreTrue);

                    if (mQuestionNumberTrue==truefalsebook.questions.length)
                    {
                        Intent i=new Intent(TrueFalse.this,ResultTrue.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("finalscore",mScoreTrue);
                        i.putExtras(bundle);
                        TrueFalse.this.finish();
                        startActivity(i);

                    }else
                    {
                        updateQuestionTrue();
                    }
                }else
                {
                    if (mQuestionNumberTrue==truefalsebook.questions.length)
                    {
                        Intent i=new Intent(TrueFalse.this,ResultTrue.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("finalscore",mScoreTrue);
                        i.putExtras(bundle);
                        TrueFalse.this.finish();
                        startActivity(i);

                    }else
                    {
                        updateQuestionTrue();
                    }
                }
            }
        });
    }

    private  void updateQuestionTrue(){
        mImageViewTrue.setImageResource(truefalsebook.images[mQuestionNumberTrue]);
        mQuestionTrue.setText(truefalsebook.questions[mQuestionNumberTrue]);
        mAnswerTrue=truefalsebook.answer[mQuestionNumberTrue];
        mQuestionNumberTrue++;
    }
    public void updateScoreTrue(int pointtrue)
    {
        mScoreViewTrue.setText(""+mScoreTrue);
    }
}
