// Copy → O(n+m)
// Sorting → O((n+m) log(n+m))

// Time - O((n+m) log(n+m))
// Space - O(n+m)


import java.util.Arrays;

public class BruteForce{

    public static int[] merge(int nums1[], int m, int nums2[], int n) {
         int newArr[] = new int[m + n];
         for(int i=0; i<nums1.length; i++){
            newArr[i] = nums1[i];
         }

         for(int j=0; j<nums2.length; j++){
            newArr[nums2.length+j] = nums2[j];
         }

         Arrays.sort(newArr);

         return newArr;
    }
       

    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int n = 3;
        int m = 3;
        int res[] = merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(res));
    }
}