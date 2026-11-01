#include <iostream>
#include <vector>
using namespace std;

int partition(vector<int> &arr,int st, int end){
    int pivot = arr[end];
    int index = st-1;

    for(int j=st;j<end;j++){
        if(arr[j]<=pivot){
            index++;
            swap(arr[j],arr[index]);
        }
    }
    
    index++;
    swap(arr[end],arr[index]);

    return index;
}

void quickSort(vector<int> &arr,int st, int end){
    if(st<end){
        int pivotIndex = partition(arr,st,end);
        quickSort(arr,st,pivotIndex-1);
        quickSort(arr,pivotIndex+1,end);
    }
}

int main(){
    vector<int> arr ={35,67,3,4,23,57,100};

    quickSort(arr,0,6);

      for (int val : arr) {
        cout << val << " ";
    }

    return 0;
}