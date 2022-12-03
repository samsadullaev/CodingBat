public class makeOutWord {
//    Given an "out" string length 4, such as "<<>>", and a word, return a new string
//    where the word is in the middle of the out string, e.g. "<<word>>".
//    Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
//
//
//    makeOutWord("<<>>", "Yay") → "<<Yay>>"
//    makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
//    makeOutWord("[[]]", "word") → "[[word]]"
    public static String makeOutWord(String out, String word) {
        String holder=out.substring(0,2);
        for(int i = 0; i<=word.length()-1;i++){
            holder+=word.charAt(i);
        }
        return holder + out.substring(2,4);
    }

    public static void main(String[] args) {
        System.out.println(makeOutWord("java", "samandar"));
    }

}
