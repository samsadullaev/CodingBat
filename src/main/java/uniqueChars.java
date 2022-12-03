public class uniqueChars {

    /*
    find unique in string

    "aaabbbcc"- abc
     */

    public static String uniqueChars(String str){

        String holder = "";

        for(int i=0;i<=str.length()-1;i++){
            //char var=str.charAt(i);
            if(!holder.contains(""+str.charAt(i))){
                holder+=str.charAt(i);
            }
        }
        return holder;
    }

    public static void main(String[] args) {
        System.out.println("uniqueChars(\"aaabbbcc\") = " + uniqueChars("aaabbbcc"));
    }
}
