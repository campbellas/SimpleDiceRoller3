package com.example.simplediceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {
    //Set up dice values
    final int D20 = 20;
    final int D12 = 12;
    final int D10 = 10;
    final int D8 = 8;
    final int D6 = 6;
    final int D4 = 4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void rollD20(View v){
        String rolled_d20 =
                Integer.toString(ThreadLocalRandom.current().nextInt(1, D20+1));
        ((TextView)findViewById(R.id.et_d20)).setText(rolled_d20);
    }
    public void rollD12(View v){
        String rolled_d12 =
                Integer.toString(ThreadLocalRandom.current().nextInt(1, D12+1));
        ((TextView)findViewById(R.id.et_d12)).setText(rolled_d12);
    }
    public void rollD10(View v){
        String rolled_d10 =
                Integer.toString(ThreadLocalRandom.current().nextInt(1, D10+1));
        ((TextView)findViewById(R.id.et_d10)).setText(rolled_d10);
    }
    public void rollD8(View v){
        String rolled_d8 =
                Integer.toString(ThreadLocalRandom.current().nextInt(1, D8+1));
        ((TextView)findViewById(R.id.et_d8)).setText(rolled_d8);
    }
    public void rollD6(View v){
        String rolled_d6 =
                Integer.toString(ThreadLocalRandom.current().nextInt(1, D6+1));
        ((TextView)findViewById(R.id.et_d6)).setText(rolled_d6);
    }

    public void rollD4(View v){
        String rolled_d4 =
                Integer.toString(ThreadLocalRandom.current().nextInt(1, D6+1));
        ((TextView)findViewById(R.id.et_d4)).setText(rolled_d4);
    }

    /*
    public void rollDice(View v){
        /*
        This function will select which button was utilized and apply the appropriate expression.

        Button b = (Button) v; //Initialize a Button instance of View v.
        String button_select = b.getText().toString(); //Retrieve the text of the button.

        switch(button_select){ //Compare to string literal.  Switch statements require constants.
            case "ROLL D20":
                String rolled_d20 =
                        Integer.toString(ThreadLocalRandom.current().nextInt(1, D20+1));
                ((EditText)findViewById(R.id.et_d20)).setText(rolled_d20);
                break;
            case "ROLL D12":
                String rolled_d12 =
                        Integer.toString(ThreadLocalRandom.current().nextInt(1, D12+1));
                ((EditText)findViewById(R.id.et_d12)).setText(rolled_d12);
                break;
            case "ROLL D10":
                String rolled_d10 =
                        Integer.toString(ThreadLocalRandom.current().nextInt(1, D10+1));
                ((EditText)findViewById(R.id.et_d10)).setText(rolled_d10);
                break;
            case "ROLL D8":
                String rolled_d8 =
                        Integer.toString(ThreadLocalRandom.current().nextInt(1, D8+1));
                ((EditText)findViewById(R.id.et_d8)).setText(rolled_d8);
                break;
            case "ROLL D6":
                String rolled_d6 =
                        Integer.toString(ThreadLocalRandom.current().nextInt(1, D6+1));
                ((EditText)findViewById(R.id.et_d6)).setText(rolled_d6);
                break;
            case "ROLL D4":
                String rolled_d4 =
                        Integer.toString(ThreadLocalRandom.current().nextInt(1, D4+1));
                ((EditText)findViewById(R.id.et_d4)).setText(rolled_d4);
                break;
            default:
                break;
        }
        */
}