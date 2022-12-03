public class Duplicate {
    public static String duplicate(String str){

        //TODO: write your code
//i love java
        String output= "";
        for(int i =0; i<str.length();i++){

                if(!output.contains(""+str.charAt(i))){//need "" bc contains doesn't accept char

                output+=str.charAt(i);

            }

        }
//how to not remove spaces

        return output;

    }


    public static void main(String[] args) {
        System.out.println(duplicate("samandar"));
        System.out.println(duplicate1("java"));
        System.out.println(countChar("java"));
    }


    public static String duplicate1(String str){
        String output="";
        for(int i = 0; i<=str.length()-1;i++ ){
            if(!output.contains(""+str.charAt(i))){
                 output+=str.charAt(i);
            }
        }
        return output;
    }

    //ex: ("series")
    //return 2s2e1i1r


public static String countChar(String str){
        String holder = "";

        for(int i=0; i<=str.length()-1;i++){
            int num=0;
            if(!holder.contains(str.substring(i))){
               for(int j = 0; j<=str.length()-1;j++){
                   if(str.charAt(i)==str.charAt(j)){
                       num++;
                   }
               }
                holder+=num + "" + str.charAt(i);

            }
        }
        return holder;

}

}
