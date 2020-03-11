package com.example.arunshaju.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static String result(String player1Move, String player2Move){
        int result ;
        if(player1Move.equals(player2Move))
            return "Draw Game";
        if (player1Move .equals( "STONE" ) && player2Move .equals( "PAPER") )
            result = -1;

        else if (player1Move .equals( "PAPER" ) && player2Move .equals( "SCISSOR") )
            result = -1;

        else if (player1Move .equals( "SCISSOR" ) && player2Move .equals( "STONE") )
            result = -1;
        else
           result = 1;
        if(result == 1)
            return "You win!";
        else
            return "Computer win!";
    }
    public void stonePressed(View v){
        TextView mes =(TextView)findViewById(R.id.me);
        TextView coms =(TextView)findViewById(R.id.comp);
        String myMove = "STONE";
        String cMove = computerMove();
        mes.setText(myMove);
        coms.setText(cMove);
        String result = result(myMove, cMove);

        Toast.makeText(getApplicationContext(),result, Toast.LENGTH_LONG).show();


    }
    public void paperPressed(View v){
        TextView mes =(TextView)findViewById(R.id.me);
        TextView coms =(TextView)findViewById(R.id.comp);
        String myMove = "PAPER";
        String cMove = computerMove();
        mes.setText(myMove);
        coms.setText(cMove);
        String result = result(myMove, cMove);

        Toast.makeText(getApplicationContext(),result, Toast.LENGTH_LONG).show();
    }
    public void scissorPressed(View v){
        TextView mes =(TextView)findViewById(R.id.me);
        TextView coms =(TextView)findViewById(R.id.comp);
        String myMove = "SCISSOR";
        String cMove = computerMove();
        mes.setText(myMove);
        coms.setText(cMove);
        String result = result(myMove, cMove);

        Toast.makeText(getApplicationContext(),result, Toast.LENGTH_LONG).show();
    }
    public String computerMove(){
        double val = Math.random();
        if(val < 0.33)
            return "STONE";
        if(val < 0.66)
            return "PAPER";

        return "SCISSOR";

    }

}

