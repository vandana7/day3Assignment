object FibSeries
{
def fib(index:Int,prev:Int,next:Int):Int=
{
  if(index==0)   
    return 0 
 
  
  print(s"${prev+next},") 
  fib(index-1,next,prev+next	) 
   prev+next 
}
def main(args: Array[String]) = {
  val input=args(0).toInt
  print("0,1,");
  val output=fib(input-2,0,1)
}  
}


