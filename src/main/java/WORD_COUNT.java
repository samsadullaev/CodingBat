public class WORD_COUNT {
    /*
    ### Finish the method called `wordCount()` that will take a `String` `words` argument and return an `int` for the number of words in the given `words` variable. The words are seperated by a space. The `wordCount()` method is already called in the main method with an argument.

#### This is a `return` method with a `String` parameter

Main topics: methods, Scanner, String, loops

Example:
```
  wordCount("one two three")

output:
  3
```
Example:
```
  wordCount("foo bar")

output:
  2
```

     */
    public static void main(String[] args) {
        System.out.println("count(\"I love java to the point I will stay up\") = " + count("I love java to the point I will stay up"));
        System.out.println(backwords1("I love java"));
        System.out.println(duplicate("output"));
    }

    public static int count(String str){

        int holder = 0;

        for(int i = 0; i<=str.length()-1;i++){

            if(str.charAt(i)==' '){
               holder++;

            }

        }
        return holder+1;
    }

    public static String backwords1(String str){

        String holder=" ";

        for(int i = str.length()-1; i>=0; i--){
            holder += str.charAt(i);

        }
        return holder;
    }
    public static String duplicate(String str){

            //TODO: write your code

        String output= "";
        for(int i =0; i<str.length();i++){

            if(!output.contains(""+str.charAt(i))){//need "" bc contains doesn't accept char

                output+=str.charAt(i);

            }

        }


        return output;

    }
    }



