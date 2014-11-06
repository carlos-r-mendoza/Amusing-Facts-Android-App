package carlosrmendoza.com.amusingfacts;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Carlos on 11/4/14.
 */
public class RandomNoRepeat { //creates random numbers array without any repeats

    public int[] getRandNumArray(int size) { //getter method for random numbers array

        int[] randNumArray = new int[size]; //gives randNumArray it's size based on size of facts array

        ArrayList<Integer> list = new ArrayList<Integer>(size); //creates new array sized same as facts array
        for(int i = 1; i <= size; i++) { //populates new array
            list.add(i); //adds values to array, starting at [0]=1
        }

        Random rand = new Random(); //creates an instance of Random.java class (an object)
        int counter = 0; //randNumArray size counter
        int randNum; //takes value of random number

        while(list.size() > 0) { //populates randNumArray with random numbers
            randNum = rand.nextInt(list.size()); //random number
            randNumArray[counter] = list.get(randNum); //random number added to randNumArray
            counter++; //randNumArray counter
            list.remove(randNum); //takes random number from list so it is not repeated
        }
        return randNumArray; //final randNumArray with no repeating random numbers
    }
}

