//Using Overloading concept, WAP to create a class “Compare” having several methods with the same name. 
//Create a driver class and ask the user to input words as long as he wants. If he inputs 1 word: calling 
//Compare class method, reverse the word and return and show it; if he inputs 2 words: calling Compare class 
//method find out if the words are same or not. If not, return and show all uncommon letters between them.

import java.util.ArrayList;

public class Compare{
    public static String compare(String word1){
        char[] wordArray=word1.toCharArray();
        for(int i=0;i<wordArray.length/2;++i){
            char temp=wordArray[wordArray.length-i-1];
            wordArray[wordArray.length-i-1]=wordArray[i];
            wordArray[i]=temp;
        }
        String answer="";
        for(int i=0;i<wordArray.length;++i){
            answer+=wordArray[i];
        }
        return answer;
    }
    public static boolean compare(String word1,String word2){
        if(word1.equals(word2))return true;
        else return false;
    }
    public static String compare(ArrayList<String> words){
        ArrayList<Character> letters=new ArrayList<>();
        letters.add('a');
        for(String word:words){

        }
    }
}