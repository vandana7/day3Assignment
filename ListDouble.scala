// Question no 4

object ListDouble {
def main(args: Array[String]) = {
   val list1=List(10,20,30)    //initializing a list
   
   for(index <- 0 to list1.length-1)	
 {
   val temp=list1(index)*2;  //fetch value at index
   println(s"$temp")
 }
   
}
}
