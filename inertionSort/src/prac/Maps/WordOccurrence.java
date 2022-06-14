package prac.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class WordOccurrence {
    public static  void main(String[]args){
        Map<String,Integer> hashMap = new HashMap<>();
        String Sentence="Alison is a girl and Brian is a boy";
        String [] words = Sentence.split(" ");
        for(String word:words){
            Integer i = hashMap.get(word);
            if(i==null){
                hashMap.put(word,1);
            }else{
                hashMap.put(word,i+1);
            }
        }
        //different approach
        Map<String,Integer> secondhasMap = new HashMap();
        String s = "My cat is a very calm cat";
        String [] wordsArr = s.split(" ");
        for(String word:wordsArr){
            if(hashMap.containsKey(word)){
                secondhasMap.put(word,hashMap.get(word)+1);
            }else{
                secondhasMap.put(word,1);
            }
        }
        System.out.println(hashMap);
        System.out.println(secondhasMap);
        System.out.println(Arrays.toString(words));

    }
}
