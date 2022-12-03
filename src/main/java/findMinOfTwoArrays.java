import java.lang.reflect.Array;
import java.util.Arrays;

public class findMinOfTwoArrays {
    public static double findMedian(int[] nums1, int[] nums2) {
        double result=0;

        int a=nums1.length;
        int b= nums2.length;
        int [] c= new int[a+b];

        System.arraycopy(nums1,0,c,0,a);
        System.arraycopy(nums2,0,c,a,b);


        Arrays.sort(c);

        int arrLength=c.length;
        int first=arrLength/2;

        if(arrLength%2==0){
            int second= first+1;
            result=first+second/2;
            ;


        }else if(arrLength%2!=0){
            result=first+1;


        }

        return result;

    }

    public static void main(String[] args) {
        int nums1[] = {1,2,3,4};
        int nums2[] = {5,6};
        System.out.println(findMedian(nums1,nums2));


    }



}


