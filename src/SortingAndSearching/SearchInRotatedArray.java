/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAndSearching;

/**
 *
 * @author v-akdesh
 */
public class SearchInRotatedArray {
    public static void main(String[] args)
    {
        int[] arr = { 89, 71, 71, 68, 1,2, 3, 10, 15, 23, 29};
        int start = 0;
        int end = arr.length - 1;
        int index = getIndex(arr, 68, start, end);
        System.out.println(index);
    }
    public static int getIndex(int[] arr, int num, int start, int end)
    {
        if(end < start)
        {
            return -1;
        }
        int mid = (start + end)/2;
        if(arr[mid] == num)
        {
            return mid;
        }
        if(arr[start] < arr[mid])//array at left is sorted
        {
            if(num >= arr[start] && num < arr[mid])
            {
                return getIndex(arr, num, start, mid-1);
            }
            else
            {
                return getIndex(arr, num, mid+1, end);
            }
        }
        else if(arr[start] > arr[mid])//right array is sorted
        {
            if(num > arr[mid] && num <= arr[end])
            {
                return getIndex(arr, num, mid+1, end);
            }
            else
            {
                return getIndex(arr, num,start, mid-1);
            }
        }
        else if(arr[start] == arr[mid])
        {
            if(arr[mid] != arr[end])
            {
                return getIndex(arr, num, mid+1, end);
            }
            else
            {
                int result = getIndex(arr, num, start, mid-1);
                if(result == -1)
                {
                    return getIndex(arr, num, mid+1, end);
                }
                else
                {
                return result;
                }
            }
        }
        return -1;
    }
    
}
