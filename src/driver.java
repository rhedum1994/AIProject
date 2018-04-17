package src;

import java.util.ArrayList;
import java.io.*;

public class driver {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));



    public static void main(String args[]) throws IOException {
        //Gameboard setup
        //Make characters
        Character Jill = new Character("red", "brown:", "female", "green", "Jill");
        Character Sean = new Character("red", "green", "male", "green", "Sean");
        Character Becky = new Character("brown", "brown", "female", "blue", "Becky");
        Character Tom = new Character("brown", "green", "male", "blue", "Tom");
        Character Caroline = new Character("blonde", "blue", "female", "blue", "Caroline");
        Character Curtis = new Character("brown", "blue", "male", "red", "Curtis");
        Character Steph = new Character("brown", "brown", "female", "red", "Steph");

        //Add characters to ArrayList
        Roster people = new Roster();
        people.addChar(Jill);
        people.addChar(Sean);
        people.addChar(Becky);
        people.addChar(Tom);
        people.addChar(Caroline);
        people.addChar(Curtis);
        people.addChar(Steph);

        //create gameplay loop
        boolean noWinner = true;

        //create turn loop
        boolean turn = true;


        //Create Menu and character names
        System.out.println("Welcome to Guess Who!");
        System.out.println("You will be assigned a random character from the list of created characters");
        System.out.println("You can either guess who the computer has, or ask a question");
        System.out.println("Once you have either made a guess or asked a question, you turn ends and the computer will go");
        System.out.println("Your goal is to guess who the computer has before it guesses your character first!");
        System.out.println("Good Luck!");
        while(noWinner) {
            printMenu();
            while(turn) {


                String s = in.readLine().trim();
                int i = Integer.parseInt(s);
                System.out.print(i);
                System.out.println("");

                switch (i) {
            //Ask question
                    case 1:

                        break;
            //Guess computer's character
                    case 2:

                        break;
            //See list of playable characters
                    case 3:

                        break;
            //see ALL characters' attributes
                    case 4:

                        break;
            //See User's character and their attributes
                    case 5:

                        break;
            //Quit game
                    case 6:

                        break;

                }
            }
        }
    }

    public static void printMenu(){
        System.out.println("Your game options are:");
        System.out.println("1. Ask Question (ends turn)");
        System.out.println("2. Guess Computer's character");
        System.out.println("3. See List of playable characters in game");
        System.out.println("4. See ALL Characters' attributes");
        System.out.println("5. See MY character and their attributes");
        System.out.println("6. Quit Game");

    }


    //option 3
    // returns toString of all playable characters
    public static String displayCharacters(Roster temp){
        return temp.toString();
    }

    //option 4
    // returns a String concactinated of all attributes
    //use system.out.print when calling method
    public static String displayAttributes(Roster temp) {

        return temp.getAttributes();
    }

    //option 5
    //returns a String of Player's character name with attributes
    //use system.out.print when calling method
    public static String displayMyAtttributes(Roster temp) {
        return temp.getMyCharacter();
    }




}