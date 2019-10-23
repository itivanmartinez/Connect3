package com.example.connect3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //0 for red, 1 for yellow,
    int activePlayer = 0;
    int[] pos ={2,2,2,2,2,2,2,2,2};
    /*int[][] winpositions = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}}*/
    public void dropIn(View view){
        ImageView counter = (ImageView) view;
        int counterTag = Integer.parseInt(counter.getTag().toString());
        if (pos[counterTag]==2){
            pos[counterTag]=activePlayer;
            counter.setTranslationY(-800);

            if (activePlayer==0){
                counter.setImageResource(R.drawable.red);
                activePlayer=1;
            }else {

                counter.setImageResource(R.drawable.yellow);
                activePlayer=0;
            }
            counter.animate().translationYBy(800).setDuration(600);

        }





    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
