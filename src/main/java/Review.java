public class Review {
    public static void main(String[] args) {
        System.out.println(back("samandar"));
        System.out.println(count("how can i hate you"));
        System.out.println(duplicate4("samandar"));
        System.out.println(countSame("Mississipi"));
    }

    public static String back(String str){
        String holder="";

        for(int i = str.length()-1;i>=0;i--){
            holder+=str.charAt(i);
        }
        return holder;
    }

    public static int count(String str){
        int num=0;

        for(int i =0; i<=str.length()-1;i++){
            if(str.substring(i).startsWith(" ")){
                num++;
            }
        }

return num+1;
    }
    public static String duplicate4(String str) {
        String holder = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            if (!holder.contains(""+str.charAt(i))) {
                holder += str.charAt(i);
            }
        }

        return holder;
    }

    public static String countSame(String str){

        String give="";

        for(int i = 0; i<=str.length()-1;i++){
            int num=0;
            if(!give.contains(""+ str.charAt(i))){
                for(int j = 0; j<=str.length()-1;j++){
                    if(str.charAt(j)==str.charAt(i)){
                        num++;
                    }
                }
                give+=num + "" + str.charAt(i);
            }
        }
        return give;
    }
}
