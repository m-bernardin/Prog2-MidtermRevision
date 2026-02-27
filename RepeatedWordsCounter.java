import java.util.ArrayList;

public class RepeatedWordsCounter {
    public static String findRepeats(ArrayList<String> words){
        String answer="Input provided: ";
        answer+=words.toString()+"\nResults found:\n";
        ArrayList<String> foundWords=new ArrayList<>();
        for(int i=0;i<words.size();++i){
            if(!inList(foundWords,words.get(i))){
                answer+=words.get(i)+" ( at indexes ";
                foundWords.add(words.get(i));
                int count=0;
                for(int j=0;j<words.size();++j){
                    if(words.get(i).trim().toLowerCase().equals(words.get(j).trim().toLowerCase())){
                        ++count;
                        answer+=j+" ";
                    }
                }
                answer+="): "+count+"\n";
            }
        }
        return answer;
    }
    private static boolean inList(ArrayList<String> list,String toFind){
        boolean inList=false;
        for(String compare:list){
            if(compare.trim().toLowerCase().equals(toFind.trim().toLowerCase())){
                inList=true;
                break;
            }
        }
        return inList;
    }
}