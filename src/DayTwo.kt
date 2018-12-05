import java.io.File

open class DayTwo (val fileName : String) {
  fun readFileAsLinesUsingReadLines(): List<String> {
    return File(fileName).readLines()
  }
  open fun getChecksum(): Int{
    var appearTwice = 0
    var appearThreeTimes = 0
    var lines = readFileAsLinesUsingReadLines()
    for (line in lines){
       appearTwice += isOneCharAppearingTwice(line);
       appearThreeTimes += isOneCharAppearingThreeTimes(line);
    }
    return appearTwice * appearThreeTimes
  }
  open fun isOneCharAppearingTwice(chars:String):Int{
    val length = chars.length
    for( char in chars){
      var lengthRest = chars.split(char).joinToString("").length
      var lengthRepeated = length - lengthRest
      if(lengthRepeated == 2){
        return 1
      }
    }
    return 0
  }
  open fun isOneCharAppearingThreeTimes(chars:String):Int{
    val length = chars.length
    for( char in chars){
          var lengthRest = chars.split(char).joinToString("").length
          var lengthRepeated = length - lengthRest
          if(lengthRepeated == 3){
            return 1
      }
    }
    return 0
  }

  open fun getCommonOfTwoStrings(a:String,b:String):String{

    //if (a.length > b.length) return getCommonOfTwoStrings(b, a)
    var res = ""
    for (i in 0 until a.length) {
        if (a[i] === b[i]){
          res += a[i]
        }
    }
    return res
  }


  open fun getCommonOfTwoStrings():String{
    var longestCommon = ""
    var lines = readFileAsLinesUsingReadLines()
    for(x in 0 until lines.size){
      for(y in x+1 until lines.size){
        var thisCommon = getCommonOfTwoStrings(lines[x],lines[y])
        if(thisCommon.length>longestCommon.length){
          longestCommon = thisCommon
        }
      }
    }
    return longestCommon
  }
}
