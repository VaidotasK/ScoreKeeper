
//App is for counting score in SNOOKER

package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaration of global variables and constants

    private final String PLAYER_1_NAME = "playerAName";
    private final String PLAYER_2_NAME = "playerBName";
    private final String SCORE_A = "playerAScore";
    private final String SCORE_B = "playerBScore";
    String playerAName;
    String playerBName;

    //Track the score of Team A
    int scorePlayerA;
    //Track the score of Team B
    int scorePlayerB;


    //Saves data before changing activity
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString(PLAYER_1_NAME, playerAName);
        savedInstanceState.putString(PLAYER_2_NAME, playerBName);
        savedInstanceState.putInt(SCORE_A, scorePlayerA);
        savedInstanceState.putInt(SCORE_B, scorePlayerB);
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Check whether we're recreating a previously destroyed instance
        if (savedInstanceState != null) {
            // Restore value of members from saved state
            playerAName = savedInstanceState.getString(PLAYER_1_NAME);
            playerBName = savedInstanceState.getString(PLAYER_2_NAME);
            scorePlayerA = savedInstanceState.getInt(SCORE_A);
            scorePlayerB = savedInstanceState.getInt(SCORE_B);
        }
    }

    //Shows scores of player A and B after changing phone position (new activity)
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Displays the given score for Player A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *  Methods for Player 1/A
     *
     * Increases score for Player A by 1
     */
    public void add1ToA(View view) {
        scorePlayerA += 1;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increases score for Player A by 2
     */
    public void add2ToA(View view) {
        scorePlayerA += 2;
        displayForPlayerA(scorePlayerA);
    }


    /**
     * Increases score for Player A by 3
     */
    public void add3ToA(View view) {
        scorePlayerA += 3;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increases score for Player A by 4
     */
    public void add4ToA(View view) {
        scorePlayerA += 4;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increases score for Player A by 5
     */
    public void add5ToA(View view) {
        scorePlayerA += 5;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increases score for Player A by 6
     */
    public void add6ToA(View view) {
        scorePlayerA += 6;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increases score for Player A by 7
     */
    public void add7ToA(View view) {
        scorePlayerA += 7;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increases score for Player A by 4 for Player B fault
     */
    public void faultAdd_4_toA(View view) {
        scorePlayerA += 4;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increases score for Player A by 5 for Player B fault
     */
    public void faultAdd_5_toA(View view) {
        scorePlayerA += 5;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increases score for Player A by 6 for Player B fault
     */
    public void faultAdd_6_toA(View view) {
        scorePlayerA += 6;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Increases score for Player A by 7 for Player B fault
     */
    public void faultAdd_7_toA(View view) {
        scorePlayerA += 7;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Methods for Team B
     *
     * Increases score for Player B by 1
     */
    public void add1ToB(View view) {
        scorePlayerB += 1;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Increases score for Player B by 2
     */
    public void add2ToB(View view) {
        scorePlayerB += 2;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Increases score for Player B by 3
     */
    public void add3ToB(View view) {
        scorePlayerB += 3;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Increases score for Player B by 4
     */
    public void add4ToB(View view) {
        scorePlayerB += 4;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Increases score for Player B by 5
     */
    public void add5ToB(View view) {
        scorePlayerB += 5;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Increases score for Player B by 6
     */
    public void add6ToB(View view) {
        scorePlayerB += 6;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Increases score for Player B by 7
     */
    public void add7ToB(View view) {
        scorePlayerB += 7;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Increases score for Player B by 4 for Player A fault
     */
    public void faultAdd_4_toB(View view) {
        scorePlayerB += 4;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Increases score for Player B by 5 for Player A fault
     */
    public void faultAdd_5_toB(View view) {
        scorePlayerB += 5;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Increases score for Player B by 6 for Player A fault
     */
    public void faultAdd_6_toB(View view) {
        scorePlayerB += 6;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Increases score for Player B by 7 for Player A fault
     */
    public void faultAdd_7_toB(View view) {
        scorePlayerB += 7;
        displayForPlayerB(scorePlayerB);
    }

    //This method resets the score of both teams to 0
    public void resetScore(View view) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
    }
}
