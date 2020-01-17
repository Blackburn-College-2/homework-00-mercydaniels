
package hw00;
import java.util.Scanner;
/**
 *
 * @author mercy daniels
 */
public class Hw00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String crab = "crab";
        String egg = "egg";
        String ham = "ham";
        Scanner input = new Scanner(System.in);
        String[] foodChoice = {crab, egg, ham};
        
       double secret = (int)(Math.random()*2)+1;
        System.out.println(foodChoice[(int)secret]);
        System.out.println("Please guess the secret food its either crab egg or ham");
        
        String answer = input.nextLine();
        
        if (answer.equals(foodChoice[(int)secret])){
            System.out.println("Yay!!!!! You did it!!!");
        }else {
            System.out.println("Try again");
            String answer1 = input.nextLine();
            if (answer.equals(answer1)){
                System.out.println("NO!!!!!! You already guessed that. You lost!");
            } else if (answer1.equals(foodChoice[(int)secret])){
                System.out.println("yeehaw buckaroo you got it");
            } else {
                   System.out.println("Try again");
                   String answer2 = input.nextLine();
                   if (answer2.equals(answer1)){
                       System.out.println("no!! you lose");
                   }else if(answer2.equals(answer)){
                       System.out.println("nO");
                   } else if(answer2.equals(foodChoice[(int)secret])){
                       System.out.println("correct!!");
                   } else {
                       System.out.println("wrong you lose");
                   }
          
            }
        }
    }
    
}
