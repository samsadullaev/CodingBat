public class extraEnd {
    //return last 2 in a word 3 time
    public static String  extraEnd(String str) {
        String holder=str.substring(str.length()-2, str.length());

        return holder + holder + holder;

    }

    public static void main(String[] args) {
        System.out.println(extraEnd("love"));
    }
}
