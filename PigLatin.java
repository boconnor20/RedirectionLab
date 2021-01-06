import java.util.*;
public class PigLatin{
  public static void main(String[] args) {

  }

    public static String pigLatinSimple(String s){
    String t = s.toLowerCase();
    String[] vowels = new String[]{"a","e","i","o","u"};

    for(int i = 0; i < vowels.length; i++){
      if(t.substring(0,1).equals(vowels[i])){
        return t + "hay";
      }
    }

    return t.substring(1,t.length()) + t.substring(0,1) + "ay";
  }
  public static String pigLatin(String s){
    
  }
}
