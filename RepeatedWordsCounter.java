import java.util.ArrayList;

public class RepeatedWordsCounter {
    public static String findRepeats(ArrayList<String> words){
        String answer="Input provided: ";
        answer+=words.toString()+"\n";
        for(int i=0;i<words.size();++i){
            answer+=words.get(i)+" ( at indexes ";
            int count=0;
            for(int j=0;j<words.size()-1;++j){
                if(words.get(i).equals(words.get(j))){
                    ++count;
                    answer+=j+" ";
                    words.set(j, words.get(i)+count);
                }
            }
            answer+="): "+count+"\n";
        }
        return answer;
    }
}