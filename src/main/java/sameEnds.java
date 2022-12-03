import java.util.ArrayList;
import java.util.Arrays;

public class sameEnds {
    /*
    Given a string, return the longest substring that appears at both the beginning
    and end of the string without overlapping. For example, sameEnds("abXab") is "ab".


sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
     */
    public static String same(String string) {

        String result="";
        for(int i=0;i<string.length()/2+1;i++){
            if(string.substring(0,i).equals(string.substring(string.length()-i)))
                result=string.substring(0,i);
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println(same("javaajava"));

        String[] friends={"sam","alex","java","500k"};
        System.out.println(friends.toString());

        ArrayList<String> friendsList = new ArrayList<>(Arrays.asList("Java","sadullaev","john"));

        System.out.println(friends[1]);
        System.out.println(friendsList.get(1));

        System.out.println(friends.length);
        System.out.println(friendsList.size());

        friendsList.add(0,"papi");
        System.out.println(friendsList);

        friendsList.remove(0);
        System.out.println(friendsList);
/*
array vs arraylist

array:size is fixed,cant grow or shrink
*to get length we have to do object name and .length
*to get certain element we have to do add the index in brackets[] ex: friends[1] returns me "alex"
*accepts all object and primitive datatypes

ArrayList:
*only object datatype which are wrapper datatype ex:Character, Integer,String
*to get length use .size
*to get certain element use .get(index) ex: friendsList.get(2)  returns me "john"
*to add another element use .add(index,value) insert where you want to add(index) and the value ex:friendsList.add(0,"papi");
* to remove an element use .remove(index) insert the element index ex:friendsList.remove(0);

 */


    }
}
