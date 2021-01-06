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
      String t = s.toLowerCase();
      String[] vowels = new String[]{"a","e","i","o","u"};
      String[] diagraphs = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
      String stuff = "";
      if(s.length()>1){
        stuff = t.substring(0,2);
      }
      else{
        stuff = t.substring(0,1);
      }
  
      for(int i = 0; i < diagraphs.length; i++){
        if(stuff.equals(diagraphs[i])){
          return t.substring(2,t.length()) + stuff + "ay";
        }
      }
      return pigLatinSimple(t);
    }

}
