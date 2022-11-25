package com.Math;

public class find_uniq2 {
    public static void main(String[] args) {
        //In the array the no is appearing three times except 1 find that unique element.
        int[] arr={2,2,3,2,7,7,8,7,8,8};
        String ans = Integer.toString(findUniq(arr));
        System.out.println(Integer.parseInt(ans));

    }

    static int findUniq(int[] arr) {
        int sum=0,ans;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i]&8;
        }
        sum%=3;
        ans=sum;
        sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i]&4;
        }
        sum%=3;
        ans*=10;
        ans+=sum;
        sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i]&2;
        }
        sum%=3;
        ans*=10;
        ans+=sum;
        sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i]&1;
        }
        sum%=3;
        ans*=10;
        ans+=sum;

        return ans;
    }
}
