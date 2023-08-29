//package com.string.String2;
//
//import java.util.Scanner;
//
//public class SubSet
//{
//    //To find all the subsets of a string
//    static void subString(char str[], int n)
//    {
//        // To select starting point
//        for (int t = 1; t <= n; t++)
//        {
//            // To select ending point
//            for (int i = 0; i <= n - t; i++)
//            {
//                //  Print characters from selected
//                // starting to end point.
//                int j = i + t - 1;
//                for (int k = i; k <= j; k++)
//                {
//                    System.out.print(str[k]);
//                }
//                System.out.println();
//            }
//        }
//    }
//    // Driver program to test above function
//    public static void main(String[] args)
//    {
//        //Take input from the user
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the string is ");
//        String str1=sc.nextLine();
//        char str[] = str1.toCharArray();
//        System.out.println("All the substrings of the above string are: ");
//        subString(str, str.length);
//    }
//}
//

package com.string.String2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet
{
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(subset(arr));

    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add((new ArrayList<>()));

        for (int num : arr){
            int n =outer.size();
            for (int i =0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    static List<List<Integer>> subsetDuplicate(int[] arr) {
        //when you find a duplicate element, only add it in the newly created subset of previous step
        //Because of above point duplicate have to be together ---- to bring together we have to sort the array
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and previous element is same, s = e + 1
            if (i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}