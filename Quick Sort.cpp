#include <bits/stdc++.h> 

int partition(vector<int>&arr,int low, int high){
    int pivot=arr[high];
    int i=low-1;

    for(int j=low;j<high;j++){
        if(arr[j]<pivot){
            i++;
            swap(arr[i],arr[j]);
        }
    }
    swap(arr[i+1],arr[high]);
    return i+1;
}

void quickSort(vector<int>&arr,int low,int high){
    if(low<high){
        int pi=partition(arr, low, high);

        quickSort(arr, low, pi-1);
        quickSort(arr, pi+1, high);
    }
}


vector<int> quickSort(vector<int> arr)
{
    // Write your code here.
    quickSort(arr, 0, arr.size()-1);
    return arr;
}
