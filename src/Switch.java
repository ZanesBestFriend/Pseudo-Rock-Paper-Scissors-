import java.util.Scanner;
public class Switch {
    
    public static void main(String[] args){

        System.out.println("Enter langauge please.");

        Scanner in = new Scanner(System.in);
        int i = 10;
        String s = in.nextLine();

        switch(s){
            case "English":
                System.out.println("Hello!");
                break;
            case "French":
                System.out.println("Salut!");
                break;
            case "Spanish":
                System.out.println("¡Hola!");
                break;
            case "German":
                System.out.println("Hallo!");
                break;
                case "William":
                System.out.println("*William Noise set #1 part 1.1*");
                break; 
        }    

    }
}
