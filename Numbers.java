// Write a program to create an ArrayList of integers inputted by user (as long as he wants to enter the numbers). 
//For each entered number, the program finds out whether it is even or odd, prime or not-prime, and perfect or not-perfect.
//Based on these findings for each value, create another ArrayList of strings that keeps the corresponding results separately.
//At last, print all results according to what you’ve saved in these 2 ArrayLists.
import java.util.ArrayList;
public class Numbers {
    public static String getResults(ArrayList<Integer> nums){
        String perfectNums="Perfect numbers: ";
        String imperfectNums="Imperfect numbers: ";
        String primeNums="Prime numbers: ";
        String unprimeNums="Non prime numbers: ";
        String evenNums="Even numbers: ";
        String oddNums="Odd numbers: ";
        String answer="Numbers inputed: ";
        for(Integer num:nums){
            if(num%2==0)evenNums+=num+" ";
            else oddNums+=num+" ";
            if(checkPrime(num))primeNums+=num+" ";
            else unprimeNums+=num+" ";
            if(checkPerfect(num))perfectNums+=num+" ";
            else imperfectNums+=num+" ";
            answer+=num+" ";
        }
        ArrayList<String> results=new ArrayList<>();
        results.add(perfectNums);
        results.add(imperfectNums);
        results.add(primeNums);
        results.add(unprimeNums);
        results.add(evenNums);
        results.add(oddNums);
        answer+="\nResults:\n";
        for(String result:results){
            answer+=result;
        }
        return answer;
    }
    public static boolean checkPrime(int num){
        boolean prime=true;
        for(int p=2;p<num&&prime==true;++p){
            if(num%p==0){
                prime=false;
                break;
            }
        }
        return prime;
    }
    public static boolean checkPerfect(int num){
        int sum=0;
        for(int divider=1;divider<num;++divider){
            if(num%divider==0)sum+=divider;
        }
        if(sum==num)return true;
        return false;
    }
}