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

    public static String pigLatinBest(String s){
        String t = s.toLowerCase();
        String[] alphabets = new String[]{"a","b","c","d","e","f","g","h","i",
      "j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] numbers = new String[]{"0","1","2","3","4","6","7","8","9"};
        boolean punc = false;
        boolean LLetter = false;
        boolean LNumber = false;
        boolean FLetter= true;
        int count = 0;
        for(int i = 0; i < alphabets.length;i++){
          if((t.substring(s.length()-1).equals(alphabets[i]))){
            FLetter=false;
          }
        }
        if (FLetter){
          return t;
        }
        for(int i = 0; i < alphabets.length;i++){
          if((t.substring(s.length()-1).equals(alphabets[i]))){
            LLetter = true;
          }
        }

        for(int i = 0; i < numbers.length; i ++){
          if(((t.substring(s.length()-1).equals(numbers[i])))){
            LNumber = true;
          }
        }
        //if not is letter and not is number then is punc
        if(LLetter==false && LNumber==false){
          punc = true;
        }
        if(punc){
          return pigLatin(t.substring(0,t.length()-1)) + t.substring(t.length()-1);
        }
        return pigLatin(t);
      }
}
