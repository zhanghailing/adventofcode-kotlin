fun main(args: Array<String>) {
  var oneDay = DayOne("C:\\Users\\Hailing\\Desktop\\kotlin_12_01\\input\\day1\\input.txt")
  var total = oneDay.getFinalFrequency()
  var firstRepeat = oneDay.getFirstRepeatedFrequency()
  println("final frequency is: $total")
  println("first repeated frequency is: $firstRepeat")
}
