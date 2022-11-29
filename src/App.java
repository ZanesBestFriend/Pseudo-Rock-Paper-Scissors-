//importations

import java.util.Scanner;
import java.util.Random;

public class App {
    //method for player 2

    static Random rand = new Random();
    public static String playerTwo(){
        if(rand.nextInt(3) == 0){
            return "rock";
        }
        else if(rand.nextInt(3) == 1){
            return "paper";
        }
        else{
            return "scissors";
        }
    }

    public static void main(String[] args) throws Exception {

        //TODO: Choose rock, paper scissors

        Scanner in = new Scanner(System.in);

        //setting the variables

        String playerChoice;
        
        //prompting the user
        
        System.out.println(Colors.ANSI_GREEN + "Choose rock, paper or scissors." + Colors.ANSI_RESET);
        playerChoice = in.nextLine();

        //TODO: Store the choices

        if(playerChoice.equals("rock") || playerChoice.equals("paper")|| playerChoice.equals("scissors")){

            //TODO: Count down, reveal choices
            
            //Countdown

            Thread.sleep(1000);
            System.out.println("Rock!");
            Thread.sleep(1000);
            System.out.println("Paper!");
            Thread.sleep(1000);
            System.out.println("Scissors!");
            
            //TODO: Ideniify the winner

            //Wins
            if(playerChoice.equals("rock") && playerTwo() == "scissors"){
                System.out.println(Colors.ANSI_CYAN + "You chose rock..." + Colors.ANSI_PURPLE + "\nPlayer 2 chose scissors" + Colors.ANSI_BLUE + "\nYou win!" + Colors.ANSI_RESET);
            }
            else if(playerChoice.equals("paper") && playerTwo() == "rock"){
                System.out.println(Colors.ANSI_CYAN + "You chose paper... " + Colors.ANSI_PURPLE + "\nPlayer 2 chose rock " + Colors.ANSI_BLUE + "\nYou win!" + Colors.ANSI_RESET);
            }
            else if(playerChoice.equals("scissors") && playerTwo() == "paper"){
                System.out.println(Colors.ANSI_CYAN + "You chose scissors... " + Colors.ANSI_PURPLE + "\nPlayer 2 chose paper" + Colors.ANSI_BLUE + " \nYou win!" + Colors.ANSI_RESET);
            }

            //Losses
            else if(playerChoice.equals("rock") && playerTwo() == "paper"){
                System.out.println(Colors.ANSI_CYAN + "You chose rock..." + Colors.ANSI_PURPLE + " \nPlayer 2 chose paper" + Colors.ANSI_RED + " \nYou lose!" + Colors.ANSI_RESET);
            }
            else if(playerChoice.equals("paper") && playerTwo() == "scissors"){
                System.out.println(Colors.ANSI_CYAN + "You chose paper..." + Colors.ANSI_PURPLE + " \nPlayer 2 chose scissors" + Colors.ANSI_RED + " \nYou lose!" + Colors.ANSI_RESET);
            }
            else if(playerChoice.equals("scissors") && playerTwo() == "rock"){
                System.out.println(Colors.ANSI_CYAN + "You chose scissors..." + Colors.ANSI_PURPLE + " \nPlayer 2 chose rock" + Colors.ANSI_RED + " \nYou lose!" + Colors.ANSI_RESET);
            }
            
            
            //Draws
            else if(playerChoice.equals("rock") && playerTwo() == "rock"){
                System.out.println(Colors.ANSI_CYAN + "You chose rock..." + Colors.ANSI_PURPLE + " \nPlayer 2 chose rock" + Colors.ANSI_YELLOW + " \nIt's a draw!" + Colors.ANSI_RESET);
            }
            else if(playerChoice.equals("paper") && playerTwo() == "paper"){
                System.out.println(Colors.ANSI_CYAN + "You chose paper..." + Colors.ANSI_PURPLE + " \nPlayer 2 chose paper" + Colors.ANSI_YELLOW + " \nIt's a draw!" + Colors.ANSI_RESET);
            }
            else if(playerChoice.equals("scissors") && playerTwo() == "scissors"){
                System.out.println(Colors.ANSI_CYAN + "You chose scissors..." + Colors.ANSI_PURPLE + " \nPlayer 2 chose scissors" + Colors.ANSI_YELLOW + " \nIt's a draw!" + Colors.ANSI_RESET);
            }
            else{
                System.out.println(Colors.ANSI_PURPLE + " Secret ending!" + Colors.ANSI_RESET);
            }
        }   
        else{
        System.out.println(Colors.ANSI_RED + "Please input a suitable answer." + Colors.ANSI_RESET);
        }
        in.close();
    }
}
