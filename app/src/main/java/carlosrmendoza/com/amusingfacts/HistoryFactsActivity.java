package carlosrmendoza.com.amusingfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class HistoryFactsActivity extends Activity {

    private FactBook FactBook = new FactBook(); //new instance of FactBook class (an object)
    private RandomColors randomColors = new RandomColors(); //new instance of RandomColors class (an object)

    @Override
    protected void onCreate(Bundle savedInstanceState) { //what is displayed on screen when initialized
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_facts); //sets content to be displayed


        final TextView historyFactTextView = (TextView) findViewById(R.id.historyFactTextView); //TextView variable that displays facts
        final RelativeLayout historyBackground = (RelativeLayout) findViewById(R.id.historyBackground); //Background of facts variable
        final Button showNewFactButton = (Button) findViewById(R.id.showNewFactButton); //button variable
        final String factBookType = "historyFactsType";

        String color = randomColors.getRandomColor(); //creates random color onCreate
        historyBackground.setBackgroundColor(Color.parseColor(color)); //gives background random color onCreate

        showNewFactButton.setOnClickListener(new View.OnClickListener() { //makes button clickable
            @Override
            public void onClick(View view) { //method that happens when button is clicked
                String historyFact = FactBook.getFacts(factBookType); //variable receives a fact from FactBook object
                historyFactTextView.setText(historyFact); //TextView receives new fact
                String color = randomColors.getRandomColor(); //variable receives new color from RandomColors object
                historyBackground.setBackgroundColor(Color.parseColor(color)); //Background receives new color
                showNewFactButton.setTextColor(Color.parseColor(color)); //Button text receives new color
            }
        });
    }
}
