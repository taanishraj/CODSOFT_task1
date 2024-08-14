import java.util.Scanner;
//funtion class
public class numberguess2{
    //main function for guessing a number
    public static void main(String[] args) {
        //initialize variables
        int answer,guess,i,n=7,count=7;
        //code for input values
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("WELCOME TO NUMBER GUESSING GAME ");
            System.out.println("YOU WILL HAVE 7 CHANCES TO GUESS THE NUMBER CORRECTLY!");
            //random number generator
            int randnum = 1+(int)(100 * Math.random());
            for(i=0;i<n;i++){
                //count the number of chances left
                count--;
                System.out.println("GUESS ANY NUMBER BETWEEN 1-100");
                guess=sc.nextInt();
                //conditional if the guess is correct
                if(guess==randnum){
                    System.out.println("**CONGRATULATIONS**\n YOU HAVE GUESSED IT RIGHT");
                    break;
                    //conditional if guess is less than the number
                }else if(guess<randnum){
                    System.out.println("the number is higher than "+guess);
                    System.out.println("you have "+count+" chances left");
                } 
                //statement if the guess is higher than the number
                else{
                    System.out.println("the number is lower than "+guess);
                    System.out.println("you have "+count+" chances left");
                }
            }
            //conditional if the given chances are exhausted
            if(i==n){
                System.out.println("YOU HAVE EXHAUSTED YOUR 7 CHANCES");
                System.out.println("THE CORRECT NUMBER WAS\t"+randnum);     
                }
            System.out.println("DO YOU WANT TO PLAY AGAIN");
            System.out.println("YES=1/NO=0");
            answer=sc.nextInt();
            //switch case if the user wants to play the game again
            switch(answer){
            case 1 -> main(args);
            case 0 -> System.exit(0);
            }//end switch
        }//end try

    }//end main
}//end class

