package com.ankat;

// a = 5, b=7, c=4 [5+6+7+6+5+4 = 33]
// a = 2, b=9, c=5 [2+3+4+5+6+7+8+9+8+7+6+5 = 70]

interface Pyramid {
    int execute(int a, int b, int c);
}

public class PyramidExample1 {
    private static Pyramid p = (a, b, c) -> {
        int ans = 0;
        while (true) {
            if (a <= b) {
                ans += a;
                a++;
            } else if (b > c) {
                b--;
                ans += b;
            } else {
                break;
            }
        }
        return ans;
    };

    public static void main(String[] args) {
        System.out.println(p.execute(5, 7, 4));
        System.out.println(p.execute(2, 9, 5));


        int arr[] = {2,9,5};

        int finalSum = 0;

        for(int i=0; i< arr.length-1; i++){
            if(arr[i] < arr[i+1]){
                int sum1=arr[i];
                int count1=arr[i]+1;
                while(count1 < arr[i+1]){
                    sum1 = sum1 + count1;
                    count1++;
                }
                finalSum = finalSum + sum1;
            } else if (arr[i] > arr[i+1]) {
                int sum2 = arr[i];
                int count2 = arr[i]-1;
                while(count2 > arr[i+1]){
                    sum2 = sum2 + count2;
                    count2--;
                }
                finalSum = finalSum + sum2;
            }
            if((i+1)==arr.length-1){
                finalSum = finalSum + arr[i+1];
            }
        }
        System.out.println(finalSum);
    }
}
