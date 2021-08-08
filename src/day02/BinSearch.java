package day02;

import java.util.Arrays;

public class BinSearch {


    public static void main(String[] args) {
        int arr[] = {1,3,6,8,66,88};
        int blu[] = {1,323,6,99,55,88};
        System.out.println(getNum(0,arr.length-1,arr,8));
        blu(blu);
        System.out.println(Arrays.toString(Arrays.stream(blu).toArray()));

        System.out.println(wh(arr,88));



    }
    public static void blu(int []arr){


        for (int x =0;x<arr.length;x++){

            for (int y = x+1;y<arr.length;y++){
                if(arr[x]>arr[y]){
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }

            }
        }
    }

    public static int getNum(int left,int right,int []arr,int element){


        int mid = (left+right)/2;
        int x = arr[mid];

        if(x==element) return element;
        if(left>right) return 0;
        if(element>x){
            left = mid+1;
        }else {
            right = mid-1;

        }
       return getNum(left,right,arr,element);

    }

    public static  int wh(int arr[],int key){

        int left = 0;
        int right = arr.length-1;

        while (left<=right){

            int mid = (right-left)/2 +left;

            if(arr[mid]==key){
                return arr[mid];
            }else if(arr[mid]>key){
                right = mid-1;
            }else {
                left = mid +1;

            }
        }

        return 0;
    }

    // 二分查找递归实现
    public static int binSearch(int srcArray[], int start, int end, int key) {
        int mid = (end - start) / 2 + start;
        if (srcArray[mid] == key) {
            return mid;
        }
        if (start >= end) {
            return -1;
        } else if (key > srcArray[mid]) {
            return binSearch(srcArray, mid + 1, end, key);
        } else if (key < srcArray[mid]) {
            return binSearch(srcArray, start, mid - 1, key);
        }
        return -1;
    }
}
