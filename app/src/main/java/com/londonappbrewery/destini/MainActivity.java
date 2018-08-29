package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Story;
    private Button OptionA;
    private Button OptionB;
    private int CheckStoryline;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Story = (TextView) findViewById(R.id.storyTextView);
        OptionA = (Button) findViewById(R.id.buttonTop);
        OptionB = (Button) findViewById(R.id.buttonBottom);
        CheckStoryline = 1;         //Start


        OptionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("destini", "OptionA");

                //if (Story.getText().equals(getString(R.string.T1_Story))){          //T1
                if(CheckStoryline == 1) {
                    Log.d("destini", "test");
                    Story.setText(getString(R.string.T3_Story));
                    OptionA.setText(getString(R.string.T3_Ans1));
                    OptionB.setText(getString(R.string.T3_Ans2));
                    CheckStoryline = 3;
                    //}else if (Story.getText().equals(getString(R.string.T3_Story))){    //T3
                }else if(CheckStoryline == 3) {
                    Story.setText(getString(R.string.T6_End));
                    OptionA.setVisibility(View.GONE);
                    OptionB.setVisibility(View.GONE);
                    CheckStoryline = 6;
                    //}else if(Story.getText().equals(getString(R.string.T2_Story))) {    //T2
                }else if(CheckStoryline ==2){
                    Story.setText(getString(R.string.T3_Story));
                    OptionA.setText(getString(R.string.T3_Ans1));
                    OptionB.setText(getString(R.string.T3_Ans2));
                    CheckStoryline = 3;
                }
            }
        });


        OptionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("destini", "OptionB");

                //if (Story.getText().equals(getString(R.string.T1_Story))){          //T1
                if (CheckStoryline == 1) {
                    Log.d("destini", "test");
                    Story.setText(getString(R.string.T2_Story));
                    OptionA.setText(getString(R.string.T2_Ans1));
                    OptionB.setText(getString(R.string.T2_Ans2));
                    CheckStoryline = 2;
                //}else if (Story.getText().equals(getString(R.string.T3_Story))){    //T3
                }else if(CheckStoryline == 3) {
                    Story.setText(getString(R.string.T5_End));
                    OptionA.setVisibility(View.GONE);
                    OptionB.setVisibility(View.GONE);
                    CheckStoryline = 5;
                    //}else if (Story.getText().equals(getString(R.string.T2_Story))){    //T2
                }else if(CheckStoryline == 2) {   
                    Story.setText(getString(R.string.T4_End));
                    OptionA.setVisibility(View.GONE);
                    OptionB.setVisibility(View.GONE);
                    CheckStoryline = 4;
                }
            }
        });



    }


}
