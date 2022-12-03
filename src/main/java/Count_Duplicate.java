import java.util.Scanner;

//Example:
//        ```
//        countLetters("aaabbcccc");
//
//        output:
//        3a2b4c
//        

public class Count_Duplicate {
    public static void main(String[] args) {
        System.out.println(countLetters("java"));
    }

    public static String countLetters(String str) {
        String letters = "";

        for (int i = 0; i < str.length(); i++) {
            int holder = 0;
            if (!letters.contains("" + str.charAt(i))) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {


                        holder++;
                    }
                }
                letters += holder + "" + str.charAt(i);
            }

        }
        return  letters;
    }




    /*public static String countLetters(String str){

    String result ="";

    for(int i = 0; i < str.length(); i++){
          int check =0;

      if (!result.contains(""+str.charAt(i))) {

      for(int j = 0; j < str.length(); j++ ){

        if (str.charAt(i)==str.charAt(j)) {
        check++;
             }
          }
        result+= check+""+str.charAt(i);
      }
    }
    return result;
  }
    */


}
