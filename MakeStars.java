import java.util.*;
public class MakeStars{
  public static void main( String[]args ){
      //use the standard input (terminal input)
      //as the string that you read from
      Scanner n = new Scanner( System.in );
      //use hasNextLine()/nextLine() to loop over
      //all of the data

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()
      while (n.hasNextLine()){
        Scanner l = new Scanner(n.nextLine());
      while(l.hasNext()){
        String s = l.next();
        String temp = "";
        for(int i = 0; i < s.length(); i ++){
          temp += "*";
        }
        System.out.print(temp + " ");
      }
      System.out.println();
    }
  }
}
