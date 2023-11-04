//Number Game to Guess Machine Produced Number 
import java.util.Scanner;
public class Number_Game1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //flag to Play Game until we want
        boolean flag=true;
        //Flag will be true until we don't want to play Game
        while(flag){
            //c to count Score
            int c=0;
            //Per-defined number of Attempts to play game ie 5 times
            System.out.println("You have 5 chances to Win the Game");
            //Loop to take User Input 5 times and Comapare it with Randomly produced Number
            for(int i=1;i<=5;i++){
                System.out.println("Enter the Number");
                //Taking User Input of a Number to Match with Random Number
                int n=sc.nextInt();
                //Using Math.random and Math.floor to produce a Random Number between 1 to 100
                int r=(int)Math.floor(Math.random()*100)+1;
                //Comapring User given Number with randomly produced Number
                if(n==r){
                    //If the two Number matches then Game Won and Score is counted 
                    System.out.println("Game Won");
                    c++;
                }
                else{
                    //If Number do not match display user input number and randomly produced number
                    System.out.println("The Number you entered is "+n+" but the Number is "+r);
                }
            }
            //Displaying Score of the Game
            System.out.println("Your Total Score is "+c+" out of 5");
            //Giving option to User to Play again or Leave
            //Input "Yes" to Play Again and "No" to Exit
            System.out.println("Wanna Play Again\n Yes or No");
            //User decides to play or not
            String st=sc.next();
            //If User decides to Play again the While Loop continues otherwise Loop ends
            if(st.equals("Yes")){
                //If User decides to Play again then flag remains true and while Loop continues
                flag=true;
            }
            else{
                //If User decides to End game then flag becomes false and while Loop End
                flag=false;
            }
        }
        sc.close();
    }
}
