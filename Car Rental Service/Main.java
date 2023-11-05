import java.util.Scanner; //import scanner

//import swing and JFrame
import javax.swing.JFrame;
import javax.swing.*; 

import java.io.BufferedWriter; //import bufferedwriter
import java.io.FileWriter; //import filewriter

import java.io.*; 

class Main { //start program
  
  public static int WhichVehicleFunction(int passengers, int bags, String Class){
    int chosenVehicle = 10; //declare final vehicle choice variable
    

    //methood to choose correct vehicle
    if (passengers <= 4 && bags <= 2 && Class.equals("budget")) { 
        chosenVehicle = 0;
    } else if (passengers <=2 && bags <= 2 && Class.equals("sport")){
      chosenVehicle = 8; 
    } else if (passengers <= 5 && bags <= 4) {
      if (Class.equals("budget")) {
        chosenVehicle = 1;
      } else if (Class.equals("intermediate")) {
        chosenVehicle = 2;
      } else if (Class.equals("luxury")){
        chosenVehicle = 3; 
      } else if (Class.equals("sport")){
        chosenVehicle = 7; 
      }
    } else if ((passengers <= 7) && (bags <= 5) && (!Class.equals("sport"))) {
        chosenVehicle = 4;
    } else if ((passengers<= 2) && (bags <= 10) && (!Class.equals("sport"))) {
        chosenVehicle = 5;
    } else if ((passengers <= 30) && (bags <= 20)) {//to find busses
        if ((Class.equals("budget")) || (Class.equals("intermediate"))) {
        chosenVehicle = 6; 
        } else {
        chosenVehicle = 9; 
        }
    }
    
    return chosenVehicle; //return vehicle choice 
  } // end WhichVehicleFunction
  public static double PromoCodeFunction(String code, double totalCost){
    String[] promoCodes = {"2023WOW", "RENT4LESS"}; //define promo codes array
    
    //2023WOW discount
      if (code.equals(promoCodes[0])) {
        totalCost = totalCost - 50; 
        System.out.println("$50 discount has been applied"); 
    //RENT4LESS discount
      } else if (code.equals(promoCodes[1])) {
        totalCost = totalCost - 140; 
        System.out.println("$140 discount has been applied");
      //print if promo code is invalid
      } else {
        System.out.println("That is an invalid promo code. "); 
      }
  
    return totalCost;//return cost - promo code discount
  }
  public static double VehicleCostFunction(int vehicle, int time){
    double[] vehicleCost = {68.52, 76.25, 76.29, 91.28, 85.95, 68.43, 768.22, 120.11, 1990.99, 1536.45, 0.0}; //define variables as their cost
    double totalCost = 0.0; 
    totalCost = vehicleCost[vehicle] * time; 
    return totalCost;//return final cost
  }
  public static void ShowImage(int num){ //function to display images
  
  if(num == 0){ // if num = 0 create and show spark image
    JFrame frame = new JFrame(); //create new frame  
    ImageIcon spark = new ImageIcon("Images/spark.jpg"); //define image
    frame.setSize(800, 800); //set frame size
    frame.setLayout(null);
    frame.setVisible(true); //make frame visible

    JButton button = new JButton(); //create new button
    button.setIcon(spark); //set button icon to image
    button.setBounds(0, 0, 600, 500); //set button size
    frame.add(button); //add button to frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close frame when x pressed
    
  } else if(num == 1){ // if num = 1 create and show jetta image
    JFrame frame = new JFrame(); //create new frame  
    ImageIcon spark = new ImageIcon("Images/jetta.jpg"); //define image
    frame.setSize(800, 800); //set frame size
    frame.setLayout(null);
    frame.setVisible(true); //make frame visible

    JButton button = new JButton(); //create new button
    button.setIcon(spark); //set button icon to image
    button.setBounds(0, 0, 600, 500); //set button size
    frame.add(button); //add button to frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close frame when x pressed
    
  } else if(num == 2) { //if num = 2 create and show camry image
    JFrame frame = new JFrame(); //create new frame  
    ImageIcon spark = new ImageIcon("Images/camry.jpg"); //define image
    frame.setSize(800, 800); //set frame size
    frame.setLayout(null);
    frame.setVisible(true); //make frame visible

    JButton button = new JButton(); //create new button
    button.setIcon(spark); //set button icon to image
    button.setBounds(0, 0, 600, 500); //set button size
    frame.add(button); //add button to frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close frame when x pressed
    
  } else if(num == 3) { // if num = 3 create and show bmw image
    JFrame frame = new JFrame(); //create new frame  
    ImageIcon spark = new ImageIcon("Images/bmw.jpg"); //define image
    frame.setSize(800, 800); //set frame size
    frame.setLayout(null);
    frame.setVisible(true); //make frame visible

    JButton button = new JButton(); //create new button
    button.setIcon(spark); //set button icon to image
    button.setBounds(0, 0, 600, 500); //set button size
    frame.add(button); //add button to frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close frame when x pressed
    
  } else if(num == 4){ // if num = 4 create and show caravan image
    JFrame frame = new JFrame(); //create new frame  
    ImageIcon spark = new ImageIcon("Images/caravan.jpg"); //define image
    frame.setSize(800, 800); //set frame size
    frame.setLayout(null);
    frame.setVisible(true); //make frame visible

    JButton button = new JButton(); //create new button
    button.setIcon(spark); //set button icon to image
    button.setBounds(0, 0, 600, 500); //set button size
    frame.add(button); //add button to frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close frame when x pressed
    
  } else if(num == 5) { //if num = 5 create and show Ford van image
    JFrame frame = new JFrame(); //create new frame  
    ImageIcon spark = new ImageIcon("Images/cargo.jpg"); //define image
    frame.setSize(800, 800); //set frame size
    frame.setLayout(null);
    frame.setVisible(true); //make frame visible

    JButton button = new JButton(); //create new button
    button.setIcon(spark); //set button icon to image
    button.setBounds(0, 0, 600, 500); //set button size
    frame.add(button); //add button to frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close frame when x pressed
    
  } else if(num == 6) { //if num = 6 create and show school bus image
    JFrame frame = new JFrame(); //create new frame  
    ImageIcon spark = new ImageIcon("Images/school.jpg"); //define image
    frame.setSize(800, 800); //set frame size
    frame.setLayout(null);
    frame.setVisible(true); //make frame visible

    JButton button = new JButton(); //create new button
    button.setIcon(spark); //set button icon to image
    button.setBounds(0, 0, 600, 500); //set button size
    frame.add(button); //add button to frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close frame when x pressed
    
  } else if(num == 7) { //if num = 7 create and show tesla image
    JFrame frame = new JFrame(); //create new frame  
    ImageIcon spark = new ImageIcon("Images/tesla.jpg"); //define image
    frame.setSize(800, 800); //set frame size
    frame.setLayout(null);
    frame.setVisible(true); //make frame visible

    JButton button = new JButton(); //create new button
    button.setIcon(spark); //set button icon to image
    button.setBounds(0, 0, 600, 500); //set button size
    frame.add(button); //add button to frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close frame when x pressed
    
  } else if (num == 8) { //if num = 8 create and show mclaren image
    JFrame frame = new JFrame(); //create new frame  
    ImageIcon spark = new ImageIcon("Images/mclaren.png"); //define image
    frame.setSize(800, 800); //set frame size
    frame.setLayout(null);
    frame.setVisible(true); //make frame visible

    JButton button = new JButton(); //create new button
    button.setIcon(spark); //set button icon to image
    button.setBounds(0, 0, 600, 500); //set button size
    frame.add(button); //add button to frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close frame when x pressed
    
  } else if(num == 9) { //if num = 9 create and show coach bus image
    JFrame frame = new JFrame(); //create new frame  
    ImageIcon spark = new ImageIcon("Images/coach.jpg"); //define image
    frame.setSize(800, 800); //set frame size
    frame.setLayout(null);
    frame.setVisible(true); //make frame visible

    JButton button = new JButton(); //create new button
    button.setIcon(spark); //set button icon to image
    button.setBounds(0, 0, 600, 500); //set button size
    frame.add(button); //add button to frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close frame when x pressed
    
  } else if(num == 10) { //if num = 10 create and show logo
    JFrame frame = new JFrame(); //create new frame  
    ImageIcon spark = new ImageIcon("Images/logo.png"); //define image
    frame.setSize(800, 800); //set frame size
    frame.setLayout(null);
    frame.setVisible(true); //make frame visible

    JButton button = new JButton(); //create new button
    button.setIcon(spark); //set button icon to image
    button.setBounds(0, 0, 600, 500); //set button size
    frame.add(button); //add button to frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close frame when x pressed
    
  }
  
  }
  public static void main(String[] args) { //start main program
  try{
    //initialize filewriter for document payment.txt
    File file = new File("payment.txt"); 
    FileWriter fileOut = new FileWriter("payment.txt"); 
    BufferedWriter buffer = new BufferedWriter(fileOut);

    //define scanner variables
    Scanner keyboard = new Scanner(System.in);
    Scanner scanner = new Scanner(file);
    String name = ""; //define name String
    String Class = ""; //define Class String
    int passengers = 0; //define passengers int
    int bags = -1; //define bags int
    int time = 0; //define time int
    String code = ""; //define code String
    String YN = ""; //define YN String
    int vehicleChoiceNumber = 0; //define v ehicleChoiceNumber int
    String credit = ""; // define credit number String
    int date = 0; //define the expiry date int
    int security = 0; //define the security code int
    
    String[] vehicles = {"Chevrolet Spark", "Volkswagon Jetta", "Toyota Camry", "BMW 3 Series", "Dodge Grand Caravan", "Ford Transit Cargo Van", "IC School Bus", "Tesla Model S Plaid", "Mclaren 720S", "Prevost Coach Bus", "Sorry, there are no vehicles that match your criteria"}; //define vehicles array



    ShowImage(10); //display logo image

    //introduce company and get user name
    System.out.print("Welcome to M&H Rentals! Today we are offering two discounts for the new year, use the promo code 2023WOW or RENT4LESS to get a discount at checkout. \nWhat is your name? "); 
    name = keyboard.nextLine();

    //get number of passengers
    while(passengers < 1 || passengers > 30){ //while loop to ensure passengers are not <1 or >30
      System.out.print("Hello " + name + ", how many people do you need to carry? (Enter a number from 1 - 30) ");
      passengers = Integer.parseInt(keyboard.nextLine());
    }//end while loop

    //get number of bags
    while(bags < 0 || bags > 20){ //while loop to ensure bags number is between -1 and 21
      
      System.out.print("How many bags would you like to carry? (Enter a number from 0-20) "); 
    bags = Integer.parseInt(keyboard.nextLine()); 
    }//end while loop

    //get class
    while( !Class.equals("budget") && !Class.equals("intermediate") && !Class.equals("luxury") && !Class.equals("sport")){ //while loop to ensure correct class is entered
    
    System.out.print("Would you like a budget, intermediate, luxury, or sport vehicle? ");//Asks what class you want your vehicle to be.
    Class = keyboard.nextLine();
    } //end while loop
    //thanks you for your responses and tells you what the best vehicle choice for you is
    vehicleChoiceNumber = WhichVehicleFunction(passengers, bags, Class); 
    
    System.out.println("Thank you for your responses, the best vehicle for you is: " + vehicles[vehicleChoiceNumber] + ". ");
    if(vehicleChoiceNumber > -1 && vehicleChoiceNumber < 10) { // if statement to end program if there is no vehicle matching criteria
    
    ShowImage(vehicleChoiceNumber); //display image of vehicle
    
   //while loop to insure that number is between 1 and 30
    while (time < 1 || time > 30) {
      System.out.print(name + ", how many days would you like to rent this vehicle for? (Enter a number from 1 - 30) "); //Asks how many days you would like to rent the vehicle for.
      time = Integer.parseInt(keyboard.nextLine()); 
    }
      
    ShowImage(10); //display logo image again 
    
    //Provides you with your total
      System.out.print("Your total cost is $");
      System.out.printf("%.2f" ,VehicleCostFunction(vehicleChoiceNumber, time)); //rounds to two decimal places
      
    //asks if you would like to apply a promo code  
    //while loop to insure they answer Yes or No
    while (!YN.equals("Yes") && !YN.equals("No")){
      System.out.print(", would you like to apply a promo code? (Yes or No) "); 
      YN = keyboard.nextLine(); 
    }
    
    //if you select yes it allows you to write the promo code
    if(YN.equals("Yes")) {
      System.out.print("Enter the promo code now: "); 
      code = keyboard.nextLine(); 
      //Once promo code has been supplied it applies it to your final cost and shows your final cost
      System.out.printf("%.2f", PromoCodeFunction(code, (VehicleCostFunction(vehicleChoiceNumber, time))));
      System.out.println(" is your total cost");
    }

    //while loop to ask if payment online or instore
    while (!YN.equals("online") && !YN.equals("in store")){
      System.out.print("Would you like to pay online or in store? ");
      YN = keyboard.nextLine();
    }
  //if you select online it gives you the option to enter your credit card ifo
  if(YN.equals("online")){
      //asks to enter a credit card number
      System.out.print("Please enter a valid credit card number: ");
    credit = keyboard.nextLine(); 
      buffer.write(credit); //write credit to payment.txt
      
    //asks for you to enter the expiry date of your credit card
      System.out.print("Please enter the expiry date (MMYY): "); 
      date = Integer.parseInt(keyboard.nextLine());
      buffer.write(date); //write date to payment.txt
      //Asks for user to enter the security code on credit card
      System.out.print("Please enter your security code: "); 
      security = Integer.parseInt(keyboard.nextLine());        
    buffer.write(security); 
    //prints that your payment has gone through and is sucessful
    if(buffer != null) { //close buffer if there is an input
      buffer.close(); 
    }
    System.out.println("Your payment has been sucessfully recieved. "); 
  }
  }//end if loop
    //thank user and end program
    System.out.println("Thank you for using M&H Rentals! We hope to see you again!"); 
    } catch (IOException exception) {}
  } 
}