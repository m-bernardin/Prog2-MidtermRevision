import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please select an operation\n1. Compare\n2. Find properties of entered numbers\n3. Count repeated words\n4. quit\n> ");
        boolean running=true;
        switch(input.nextInt()){
            case 1:
                ArrayList<String> words=new ArrayList<>();
                while(running){
                    System.out.println("**running status "+running);
                    System.out.print("Would you like to enter a word? (Y/n)\n> ");
                    input.nextLine();
                    if(input.next().equals("n")){
                        running=false;
                    }
                    else{
                        System.out.print("Please enter a word\n> ");
                        words.add(input.next());
                    }
                }
                if(!words.isEmpty()){
                if(words.size()==1)System.out.println("Word reversed: "+Compare.compare(words.get(0)));
                else if(words.size()==2)System.out.println("Words are the same: "+Compare.compare(words.get(0), words.get(1)));
                else System.out.println("Uncommon letters between all words: "+Compare.compare(words));
                System.out.println("Goodbye :)");
                }
                else System.out.println("Goodbye :)");
                break;
            case 2:
                ArrayList<Integer> nums=new ArrayList<>();
                while(running){
                    System.out.println("**running status "+running);
                    System.out.print("Would you like to enter a number? (Y/n)\n> ");
                    input.nextLine();
                    if(input.next().equals("n")){
                        running=false;
                    }
                    else{
                        System.out.print("Please enter a number\n> ");
                        nums.add(input.nextInt());
                    }
                }
                if(!nums.isEmpty())System.out.println(Numbers.getResults(nums));
                else System.out.println("No input provided...");
                System.out.println("Goodbye :)");
                break;
        }
    }
}