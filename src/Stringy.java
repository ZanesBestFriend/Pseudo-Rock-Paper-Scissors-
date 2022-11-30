import java.util.Scanner;

public class Stringy {
    
    public static void main(String[] args){

        String s = "Ur moom";

        System.out.println(s);
        System.out.println(Colors.ANSI_BLUE + s.contains("U") + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + s.concat("U") + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + s.length() + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + s.charAt(1) + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + s.indexOf(s) + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + s.lastIndexOf(s) + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + s.replace("r", " have a tasty morsel of").toUpperCase() + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + s.substring(3,6) + Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + s.substring(s.indexOf("m"), s.indexOf("m") + 3) + Colors.ANSI_RESET);


    }

}
