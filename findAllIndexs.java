package Recursion;

import java.util.ArrayList;

public class findAllIndexs {

    // static ArrayList<Integer> list = new ArrayList<>();
    // public static void search(int arr[],int key,int index){
    //   if(index == arr.length){
    //     return;
    //   }
    //   if(arr[index] == key){
    //   list.add(index);
    //   } 
    //   search(arr, key, index+1);
    // } 

      public static ArrayList<Integer> search(int arr[],int key,int index, ArrayList<Integer> list){
      if(index == arr.length){
        return list;
      }
      if(arr[index] == key){
      list.add(index);
      } 
     return search(arr, key, index+1,list);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,4};
        System.out.println(search(arr, 4, 0, new ArrayList<Integer>()));
    }
}
