//Question no-1


object ListAdd {
def main(args: Array[String]) = {
   val list1=List(10,20,30)    //initialization of 1st list.
   val list2=List(1,2,3)       // initialization of 2nd list.
  
    val list3 = for{

       index <- 0 to list1.length-1	
 
       temp=list1(index) + list2(index)  //fetch value at index and calculate the sum
   
       }yield temp
  print(list3)  //print new list
   
}
}
