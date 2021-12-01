package com.example.basketball;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA=0;
    public void displayForTeamA( int score ) {
        TextView scoreView = (TextView) findViewById( R.id.team_a_score);
        scoreView.setText( String.valueOf( score ) );
    }
    public void score_3(View view){
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }
    public void score_2(View view){
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }
    public void score_freethrow(View view){
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }
    int scoreB=0;

    public void score_3_B(View view){
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }
    public void score_2_B(View view){
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
    public void score_freethrow_B(View view){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }
    public void displayForTeamB( int score ) {
        TextView scoreView = (TextView) findViewById( R.id.team_b_score);
        scoreView.setText( String.valueOf( score ) );
    }
    public void resetScore(View view){
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);

    }
}