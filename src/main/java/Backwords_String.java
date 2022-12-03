public class Backwords_String {

    public static String backwords(String anything){
        String holder ="";

        for(int i= anything.length()-1; i>=0; i--){
            holder+=anything.charAt(i);
        }
        return holder;
    }

    public static void main(String[] args) {
        System.out.println("backwords(\"samandar\") = " + backwords("samandar"));
        System.out.println("");
    }

}
