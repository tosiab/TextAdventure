import java.util.*;

public class TextAdventure 
{
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;
  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 600, 600);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Bob", 100, 0);
  }

  public void play()
  {
    String input;
    // start of adventure. You can change this if you like
    console.setImage("bb2.png");

    // ask the user for their name.
    System.out.println("What is your name?\n");
    input = inScanner.nextLine();

    // Change ourHero's name
    ourHero.changeName(input);
    // ADD CODE HERE
    
    // describe the starting situation. Feel free to change this
    System.out.println("You wake up to find yourself in the sky on the battlebus. \n With a pickaxe in hand, and a glider on your back, you look to the map ahead. \nWhere we dropping? \n1. tilted towers: a blooming city, filled with loot and many enemies.\n2. pleasant park: calm suburbs... that is until everyone drops.\n3. shifty shafts: an old mine, filled with lots of goodies.\n4. loot lake: a beautiful large lake, with a waterfront property in the center.\n: ");

    // get user input and go to the appropriate zone based on their input
    System.out.println("What will you choose? (write the number)\n");
    input = inScanner.nextLine();
    // ADD CODE HERE
    if(input.equals("1")){
      enterZone1();
    }
    else if(input.equals("2")){
      enterZone2();
    }
    else if(input.equals("3")){
      enterZone3();
    }
    else if(input.equals("4")){
      enterZone4();
    }
    else{
      System.out.println("You failed to choose a location.");
      gameEndLose();
    }

  }

  private void enterZone1()
  {
    // change image
    console.setImage("tilted.jpg");
    // ADD CODE HERE
    System.out.print("You land on top of a building. You descend down the stairs and find a chest. Inside you find a");
    int rarity = (int)(Math.random()*6)+1;
    int wc;
    if(rarity == 1){
      System.out.println(" Common gun.");
      wc = 1;
    }
    if(rarity == 2){
      System.out.println("n Uncommon gun.");
      wc = 2;
    }
    if(rarity == 3){
      System.out.println(" Rare gun.");
      wc = 3;
    }
    if(rarity == 4){
      System.out.println("n Epic gun.");
      wc = 5;
    }
    if(rarity == 5){
      System.out.println(" Legendary gun.");
      wc = 6;
    }
    System.out.println("The storm begins closing and you have to move. Where will you go?\n1. dusty divot\n2. salty springs\n");
    String input = inScanner.nextLine();
    if(input.equals("1")){
      enterZone5();
    }
    else if(input.equals("2")){
      enterZone6();
    }
    else{
      System.out.println("You failed to move and died in the storm.");
      gameEndLose();
    }

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE

  }

  private void enterZone2()
  {
    // change image
    // ADD CODE HERE
    console.setImage("ppark.png");
    System.out.println("You arrive in the field. While observing your surroundings you begin to be shot at.");
    int wc = (int)(Math.random()*6)+1;
    System.out.println(wc);
    if(wc>2){
      System.out.println("You shoot back at the other player and eliminate them.");
      System.out.println("Would you like to stay, or leave?\n1. Stay in Pleasant Park\n2. Go to dusty divot\n");
      String input = inScanner.nextLine();
      if(input.equals("1")){
        int storm = (int)(Math.random()*2)+1;
        if(storm == 1){
          System.out.println("You survive the final storm circle. There is one player left. Would you like to fight them or hide?\n1. fight\n2. hide\n");
          input = inScanner.nextLine();
          if(input.equals("1")){
            gameEndVic();
            System.out.println("You fight the remaining player and eliminate them!");
          }
          else{
            gameEndLose();
            System.out.println("You hid and the other player found and eliminated you.");
          }
          
        }
        else if(input.equals("2")){
          enterZone5();
        }
        else{
          System.out.println("You did nothing and died.");
          gameEndLose();
        }
      }
    }
    else{
        System.out.println("You have two options.\n1. run away\n2. fight back\n");
        String input = inScanner.nextLine();
        if(input.equals("1")){
          System.out.println("Where would you like to go?\n1. dusty divot\n2. salty springs\n");
          input = inScanner.nextLine();
          if(input.equals("1")){
            enterZone5();
          }
          else if(input.equals("2")){
            enterZone6();
          }
        else if(input.equals("2")){
          System.out.println("The other player has a better gun and eliminates you. You lose, game over");
        }
        }
    }
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE 

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone3()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone4()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone5()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone6()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void gameEndVic()
  {
    console.setImage("vict.jpg");
    System.out.println("Congratulations, you won!");

    inScanner.close();
  }
  private void gameEndLose()
  {
    // ADD CODE HERE
    console.setImage("lose.png");
    System.out.println("You lost. Now going back to lobby.");
    inScanner.close();
  }
}