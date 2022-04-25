package com.leetcode;
import java.util.*;

public class CodechefLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int count=0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    count++;
                }
                else{
                    continue;
                }
            }
            if(count==1 || count==0){
                System.out.println("YES");
            }
            else if(count>1){
                System.out.println("NO");
            }
            }
    }
}
