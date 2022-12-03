public class backwordsIntWithoutLoop {


    public static int backwords(int num){




        //num=12345
        //backwords num

        int holder = 0;

        while(num!=0){
            holder=holder*10 + num%10; //5
            num=num/10; //1234
        }
        return holder;
    }

    public static void main(String[] args) {
        System.out.println(backwords(1234567));
    }

}
