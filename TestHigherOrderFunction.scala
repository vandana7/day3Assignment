//Question no-3

object testHigherOrderFunction {
def rectArea(length:Int,breadth:Int):Int =length*breadth  //calculate area of rectangle
def parallgmArea(side1:Int,side2:Int):Int = (side1*side2)/2  //calculate area of parallelogram
def rhombusArea(base:Int,height:Int):Int =base*height  // calculate area of rhombus
def calArea(input1:Int,input2:Int,f:(Int,Int)=>Int):Int = f(input1,input2)
def area(shape:String,input1:Int,input2:Int,f1:(Int,Int)=>Int):String=
{

// matching case as per our requirement
  shape match{
 case "rectangle" =>  val rectAreaResult=calArea(input1,input2,rectArea)
  "Rectangle Area is : "+rectAreaResult
 case "parallgm" => val parallgmAreaResult=calArea(input1,input2,parallgmArea)
  "Paralleogram Area is : "+parallgmAreaResult
 case "rhombus" => val rhombusAreaResult=calArea(input1,input2,rhombusArea)
  "Rhombus Area is : "+rhombusAreaResult

  case _ => "Not Defined"
 }
}

def main(args: Array[String]) = {
  
 // calculation of area of any function
  val output=area("rectangle",10,20,rectArea)
  println(s"$output");
  
}
}
