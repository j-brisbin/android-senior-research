package com.example.haungsn.finalprojectapi15;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MenuActivity extends AppCompatActivity {

    private CardView memoryGameCard;
    private CardView timelineCard;
    private CardView triviaGameCard;

    private TextView memoryText;
    private TextView timelineText;
    private TextView triviaText;

    private Typeface robotoLight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        memoryGameCard = (CardView)findViewById(R.id.memory_game_card);
        timelineCard = (CardView)findViewById(R.id.timeline_card);
        triviaGameCard = (CardView)findViewById(R.id.trivia_game_card);

        memoryText = (TextView)findViewById(R.id.memory_game_text);
        timelineText = (TextView)findViewById(R.id.timeline_text);
        triviaText = (TextView)findViewById(R.id.trivia_game_text);

        robotoLight = Typeface.createFromAsset(getAssets(),"fonts/Roboto-Light.ttf");

        memoryText.setTypeface(robotoLight);
        timelineText.setTypeface(robotoLight);
        triviaText.setTypeface(robotoLight);

        memoryGameCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        timelineCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),TimelineActivity.class);
                startActivity(intent);
            }
        });

        triviaGameCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),TriviaActivity.class);
                startActivity(intent);
            }
        });
    }

}
