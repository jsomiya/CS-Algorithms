package main

import "fmt"
import "math/rand"

func bubblesort(arr [20]int) [20]int{

 for i:=0; i<len(arr); i++{
  for j:=0; j<len(arr)-1;j++{
    if arr[j]>arr[j+1] {
    value:=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=value;
    }
  }
 }
 return arr
}

func main(){
 var arr [20] int
 for i:=0 ; i<len(arr); i++ {
	 arr[i]=rand.Intn(1000);
 }

 fmt.Println(arr);
 
 fmt.Println("------------")
 arr=bubblesort(arr);
 fmt.Println(arr)
}
