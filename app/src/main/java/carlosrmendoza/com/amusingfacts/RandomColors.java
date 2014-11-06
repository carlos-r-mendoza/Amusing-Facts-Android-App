package carlosrmendoza.com.amusingfacts;

import java.util.Random;

/**
 * Created by Carlos on 11/4/14.
 */
public class RandomColors { //RandomColors class; produces random colors

    public String[] randColors = { //array of colors
            "#3079ab",
            "#c25975",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#677a91",
            "#f093b0",
            "#b7c0c7",
            "#33b5e5",
            "#aa66cc",
            "#99cc00",
            "#ffbb33",
            "#ff4444",
            "#999999",
                                                 };

    Random randomBackgroundColor = new Random(); //creates new Random instance (object)
    int previousRandomColor; //keeps track of previous color

    public String getRandomColor() { //get method for random color

        String color; //declares String for color variable

        int newRandomColor = randomBackgroundColor.nextInt(randColors.length); //creates int random number and assigns it to newRandomColor variable

        while (newRandomColor == previousRandomColor) { //while previous and current color are the same, produce new int random value
            newRandomColor = randomBackgroundColor.nextInt(randColors.length);

        }

        previousRandomColor = newRandomColor; //puts current newRandomColor int value to previousRandomColor variable
        color = randColors[newRandomColor]; //receives random color
        return color; //returns random color
    }
}

