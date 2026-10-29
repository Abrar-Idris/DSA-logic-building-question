#include <iostream>
using namespace std;

void selectionSort(int arr[],int n){//1
    for(int i =0; i<n-1;i++){

        int smallestIndex = i;

        for(int j =i+1;j<n; j++){//n*n =  n^2
            if(arr[j]<arr[smallestIndex]){
                smallestIndex = j;
            }

        }
        swap(arr[i],arr[smallestIndex]);
    }
}

void displayArray(int arr[],int n){
    for(int i =0; i<n; i++){
        cout<<arr[i]<<" ";
    }
    cout<< endl;
}


int main(){
    int n = 5;
    int arr[] = {4,1,5,2,3};
    selectionSort(arr,n);
    displayArray(arr,n);
    return 0;
}
