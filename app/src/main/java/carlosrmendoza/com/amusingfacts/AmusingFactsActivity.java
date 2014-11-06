package carlosrmendoza.com.amusingfacts;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class AmusingFactsActivity extends Activity { //Main activity (AmusingFactsActivity)

    private RandomColors randomColors = new RandomColors(); //creates an instance of RandomColors.java class (an object)

    @Override
    protected void onCreate(Bundle savedInstanceState) { //on application opening method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amusing_facts); //sets view when application opens

        final RelativeLayout mainRelativeLayoutScreen = (RelativeLayout) findViewById(R.id.mainRelativeLayoutScreen); //mainRelativeLayoutScreen call
        String color = randomColors.getRandomColor(); //generate random color
        mainRelativeLayoutScreen.setBackgroundColor(Color.parseColor(color)); //assign random color to mainRelativeLayoutScreen

        final Button snappleCategoryButton = (Button) findViewById(R.id.snappleCategoryButton); //snappleCategoryButton call
        final Button historyCategoryButton = (Button) findViewById(R.id.historyCategoryButton); //historyCategoryButton call
        final Button sportsCategoryButton = (Button) findViewById(R.id.sportsCategoryButton); //historyCategoryButton call
        final Button animalCategoryButton = (Button) findViewById(R.id.animalCategoryButton); //animalCategoryButton call

        snappleCategoryButton.setOnClickListener(new View.OnClickListener() { //on click listener for snappleCategoryButton method

            @Override
            public void onClick(View view) { //action on click for snappleCategoryButton method
                Intent intent = new Intent(AmusingFactsActivity.this, SnappleFactsActivity.class);
                startActivity(intent); //open SnappleFactsActivity
            }
        });

        historyCategoryButton.setOnClickListener(new View.OnClickListener() { //on click listener for snappleCategoryButton method

            @Override
            public void onClick(View view) { //action on click for historyCategoryButton method
                Intent intent = new Intent(AmusingFactsActivity.this, HistoryFactsActivity.class);
                startActivity(intent); //open HistoryFactsActivity
            }
        });

        sportsCategoryButton.setOnClickListener(new View.OnClickListener() { //on click listener for snappleCategoryButton method

            @Override
            public void onClick(View view) { //action on click for sportsCategoryButton method
                Intent intent = new Intent(AmusingFactsActivity.this, SportsFactsActivity.class);
                startActivity(intent); //open SportsFactsActivity
            }
        });

        animalCategoryButton.setOnClickListener(new View.OnClickListener() { //on click listener for snappleCategoryButton method

            @Override
            public void onClick(View view) { //action on click for animalCategoryButton method
                Intent intent = new Intent(AmusingFactsActivity.this, AnimalFactsActivity.class);
                startActivity(intent); //open SportsFactsActivity
            }
        });


    }
}
