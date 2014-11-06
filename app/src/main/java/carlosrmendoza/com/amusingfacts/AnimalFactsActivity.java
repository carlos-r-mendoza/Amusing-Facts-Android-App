package carlosrmendoza.com.amusingfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class AnimalFactsActivity extends Activity { //AnimalFactsActivity

    private FactBook FactBook = new FactBook(); //new instance of FactBook class (an object)
    private RandomColors randomColors = new RandomColors(); //new instance of RandomColors class (an object)

    @Override
    protected void onCreate(Bundle savedInstanceState) { //what is displayed on screen when initialized
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_facts); //sets content to be displayed


        final TextView animalFactTextView = (TextView) findViewById(R.id.animalFactTextView); //TextView variable that displays facts
        final RelativeLayout animalBackground = (RelativeLayout) findViewById(R.id.animalBackground); //Background of facts variable
        final Button showNewFactButton = (Button) findViewById(R.id.showNewFactButton); //button variable
        final String factBookType = "animalFactsType";


        String color = randomColors.getRandomColor(); //creates random color onCreate
        animalBackground.setBackgroundColor(Color.parseColor(color)); //gives background random color onCreate

        showNewFactButton.setOnClickListener(new View.OnClickListener() { //makes button clickable
            @Override
            public void onClick(View view) { //method that happens when button is clicked
                String animalFact = FactBook.getFacts(factBookType); //variable receives a fact from FactBook object
                animalFactTextView.setText(animalFact); //TextView receives new fact
                String color = randomColors.getRandomColor(); //variable receives new color from RandomColors object
                animalBackground.setBackgroundColor(Color.parseColor(color)); //Background receives new color
                showNewFactButton.setTextColor(Color.parseColor(color)); //Button text receives new color
            }
        });
    }
}
