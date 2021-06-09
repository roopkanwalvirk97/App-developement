//Submitted by: Roopkanwal Kaur_C0793358
package com.example.assignment1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView userDie, computerDie;
    private Button rollButtonLower, rollButtonHigher;
    private ImageView imageViewResult ;
    private int computerRandom, userRandom;

    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //we find the view and link it to instance of
        // the object that I created
        computerDie = findViewById(R.id.computer_die);
        userDie = findViewById(R.id.user_die);


        rollButtonLower = findViewById(R.id.roll_button_lower);
        rollButtonHigher = findViewById(R.id.roll_button_higher);

        imageViewResult = findViewById(R.id.imageView_result);

        rollButtonLower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // what we want to do when we click on button
                createRandom();
                if(computerRandom < userRandom){
                    imageViewResult.setImageResource(R.drawable.computerwin);
                }
                else if(computerRandom > userRandom){
                    imageViewResult.setImageResource(R.drawable.user);
                }
                else {
                    imageViewResult.setImageResource(R.drawable.tie);
                }
            }
        });

        rollButtonHigher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // what we want to do when we click on button
                createRandom();
                if(computerRandom > userRandom){
                    imageViewResult.setImageResource(R.drawable.computerwin);
                }
                else if(computerRandom < userRandom){
                    imageViewResult.setImageResource(R.drawable.user);
                }
                else {
                    imageViewResult.setImageResource(R.drawable.tie);
                }
            }
        });

    }

    private void createRandom() {
        computerRandom = random.nextInt(6) + 1;
        userRandom = random.nextInt(6) + 1;
        diceRoll(computerRandom, userRandom);
    }

    private void diceRoll(int computerRandom, int userRandom) {
        char first_die = (char) (computerRandom + '0');
        char second_die = (char) (userRandom + '0');
        switch(first_die){
            case '1' :
                userDie.setImageResource(R.drawable.dice1);
                break;
            case '2' :
                userDie.setImageResource(R.drawable.dice2);
                break;
            case '3' :
                userDie.setImageResource(R.drawable.dice3);
                break;
            case '4' :
                userDie.setImageResource(R.drawable.dice4);
                break;
            case '5' :
                userDie.setImageResource(R.drawable.dice5);
                break;
            case '6' :
                userDie.setImageResource(R.drawable.dice6);
                break;
            default:
        }
        switch(second_die){
            case '1' :
                computerDie.setImageResource(R.drawable.dice1);
                break;
            case '2' :
                computerDie.setImageResource(R.drawable.dice2);
                break;
            case '3' :
                computerDie.setImageResource(R.drawable.dice3);
                break;
            case '4' :
                computerDie.setImageResource(R.drawable.dice4);
                break;
            case '5' :
                computerDie.setImageResource(R.drawable.dice5);
                break;
            case '6' :
                computerDie.setImageResource(R.drawable.dice6);
                break;
            default:
        }
    }
}
