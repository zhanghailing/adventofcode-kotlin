import java.io.File

open class DayThree (val fileName : String,val maxHeight:Int =0,val maxWidth:Int = 0){
  fun readFileAsLinesUsingReadLines(): List<String>{
    return File(fileName).readLines()
  }
  val map = HashMap<Int, Int?>()
  fun readAPlan(plan: String){
    var details = plan.split(' ')
    var position = details[2]
    var left = position.split(',')[0].toInt()
    var topString = position.split(',')[1];
    var top = topString.substring(0,topString.length-1).toInt()
    var dimension = details[3]
    var width = dimension.split('x')[0].toInt()
    var height = dimension.split('x')[1].toInt()
    for(horizontal in left until left+width){
      for (vertical in top until  top + height){
          var index = horizontal+vertical*1000
        if(map[index] !=null){
          map[index] = map[index]?.plus(1)
        }else{
          map[index] = 1
        }
      }
    }
  }


   fun checkNonOverLaps():String{
     var plans = readFileAsLinesUsingReadLines()
     for(plan in plans){
       var number = checkNonOverLap(plan)
       if(number != ""){
         return number
       }
     }
     return "did not find"
   }
  fun checkNonOverLap(plan: String):String{
    var details = plan.split(' ')
    var position = details[2]
    var left = position.split(',')[0].toInt()
    var topString = position.split(',')[1];
    var top = topString.substring(0,topString.length-1).toInt()
    var dimension = details[3]
    var width = dimension.split('x')[0].toInt()
    var height = dimension.split('x')[1].toInt()
    var isDistict = true
    for(horizontal in left until left+width){
      for (vertical in top until  top + height){
        var index = horizontal+vertical*1000
        if(map[index] !=1){
          return ""
        }
      }
    }
    return details[0]
  }
  fun readPlans(plans:List<String>) {
    for(plan in plans){
      readAPlan(plan)
    }
  }
  fun readPlans(){
    var plans = readFileAsLinesUsingReadLines()
    readPlans(plans)
  }
  fun checkOverlap():Int {
    var count = 0
    for (value in map.values) {
      if (value !=1 && value !=0) {
        count++
      }
    }
    return count
  }
}
