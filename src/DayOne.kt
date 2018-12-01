import java.io.File

open class DayOne (val fileName : String){
  fun readFileAsLinesUsingReadLines(): List<String>{
    return File(fileName).readLines()
  }
  fun parseNumber(numberString:String):Int{
    if(numberString.contains('-')){
      return numberString.trimMargin("-").toInt() * -1
    }
    return numberString.trimMargin("+").toInt()
  }
  open fun getFinalFrequency(): Int{
    var total = 0
    var lines = readFileAsLinesUsingReadLines()
    for (line in lines){
      var currentNumber = parseNumber(line);
      total+=currentNumber
    }
    return total
  }

  open fun getFirstRepeatedFrequency(): Int{
    var lines = readFileAsLinesUsingReadLines()
    var total = 0
    var appearedTotals : MutableList<Int> = mutableListOf(0)
    var foundSecondFrequency = false
    while(!foundSecondFrequency){

      for (line in lines){
        var currentNumber = parseNumber(line);
        total+=currentNumber
        if(appearedTotals.contains(total)){
          return total
        }
        appearedTotals.add(total)
      }
    }
    return 0
  }
}
