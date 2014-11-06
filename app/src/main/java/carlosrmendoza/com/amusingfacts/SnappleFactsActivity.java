package carlosrmendoza.com.amusingfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class SnappleFactsActivity extends Activity { //SnappleFactsActivity

    private FactBook FactBook = new FactBook(); //new instance of FactBook class (an object)
    private RandomColors randomColors = new RandomColors(); //new instance of RandomColors class (an object)

    @Override
    protected void onCreate(Bundle savedInstanceState) { //what is displayed on screen when initialized
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snapple_facts); //sets content to be displayed


        final TextView snappleFactTextView = (TextView) findViewById(R.id.snappleFactTextView); //TextView variable that displays facts
        final RelativeLayout snappleBackground = (RelativeLayout) findViewById(R.id.snappleBackground); //Background of facts variable
        final Button showNewFactButton = (Button) findViewById(R.id.showNewFactButton); //button variable
        final String factBookType = "snappleFactsType";

        String color = randomColors.getRandomColor(); //creates random color onCreate
        snappleBackground.setBackgroundColor(Color.parseColor(color)); //gives background random color onCreate

        showNewFactButton.setOnClickListener(new View.OnClickListener() { //makes button clickable
            @Override
            public void onClick(View view) { //method that happens when button is clicked
                String snappleFact = FactBook.getFacts(factBookType); //variable receives a fact from FactBook object
                snappleFactTextView.setText(snappleFact); //TextView receives new fact
                String color = randomColors.getRandomColor(); //variable receives new color from RandomColors object
                snappleBackground.setBackgroundColor(Color.parseColor(color)); //Background receives new color
                showNewFactButton.setTextColor(Color.parseColor(color)); //Button text receives new color
            }
        });
    }
}
