//RECURSIVE APPROACH
class Solution {
    int search(int arr[],int l,int r,int k)
    {
        int mid = (l+r)/2;
        int n = arr.length;
        if(l<=r)
        {
            if(arr[mid]==k) return mid;
            else if(arr[mid]<k) return search(arr,mid+1,r,k);
            else if(arr[mid]>k) return search(arr,l,mid-1,k);
        }
        
        return -1;
    }
    int binarysearch(int arr[], int n, int k) {
        // code here
        int l = 0;
        int r = n-1;
        return search(arr,l,r,k);
    }    
}
//Time complexity: O(log(N))
//Space complexity: O(1)
