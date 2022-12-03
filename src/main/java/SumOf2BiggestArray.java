import java.util.Arrays;

public class SumOf2BiggestArray {
    public static Integer arr(int[] arr){
        if (arr.length == 0){
            return 0;
        }else if(arr.length == 1){
            return arr[0];
        }else if(arr.length == 2){
            return arr[0] + arr[1];
        }else {
            int max = arr[0];
            int secondMax = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max){
                    max = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > secondMax && arr[i] != max){
                    secondMax = arr[i];
                }
            }
            return max + secondMax;
        }
    }

    private static int twoSum(int[] arr) {
        int sum = 0;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = Math.abs(arr[i]);
        }
        Arrays.sort(newArr);
        newArr = Arrays.stream(newArr).distinct().toArray();
        return newArr[newArr.length - 2] + newArr[newArr.length - 1];
    }

    public static void main(String[] args) {
        int [] name = {1,2,3,4,5,6,7,8,9};
        System.out.println("arr(name) = " + arr(name));
        System.out.println(twoSum(name));
    }

}
