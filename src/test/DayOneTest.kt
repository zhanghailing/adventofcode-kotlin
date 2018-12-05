package test
import DayOne
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*

internal class DayOneTest {

  @Test
  fun getFinalFrequencyTest1() {
    var fileName ="C:\\Users\\Hailing\\Desktop\\kotlin_12_02\\input\\day1\\test1.txt"
    var expected = 0
    testGetFinalFrequency(fileName, expected)
  }
  @Test
  fun getFinalFrequencyTest2() {
    var fileName ="C:\\Users\\Hailing\\Desktop\\kotlin_12_02\\input\\day1\\test2.txt"
    var expected =4
    testGetFinalFrequency(fileName, expected)
  }
  @Test
  fun getFinalFrequencyTest3() {
    var fileName ="C:\\Users\\Hailing\\Desktop\\kotlin_12_02\\input\\day1\\test3.txt"
    var expected =4
    testGetFinalFrequency(fileName, expected)
  }
  @Test
  fun getFinalFrequencyTest4() {
    var fileName ="C:\\Users\\Hailing\\Desktop\\kotlin_12_02\\input\\day1\\test4.txt"
    var expected =1
    testGetFinalFrequency(fileName, expected)
  }

  private fun testGetFinalFrequency(fileName: String, expected: Int) {
    var dayOne = DayOne(fileName)
    var actual = dayOne.getFinalFrequency()
    assertEquals(expected, actual)
  }

  @Test
  fun getFirstRepeatedFrequencyTest1() {
    var fileName ="C:\\Users\\Hailing\\Desktop\\kotlin_12_02\\input\\day1\\test1.txt"
    var expected =0
    testGetFirstRep(fileName, expected)
  }
  @Test
  fun getFirstRepeatedFrequencyTest2() {
    var fileName ="C:\\Users\\Hailing\\Desktop\\kotlin_12_02\\input\\day1\\test2.txt"
    var expected =10
    testGetFirstRep(fileName, expected)
  }
  @Test
  fun getFirstRepeatedFrequencyTest3() {
    var fileName ="C:\\Users\\Hailing\\Desktop\\kotlin_12_02\\input\\day1\\test3.txt"
    var expected =5
    testGetFirstRep(fileName, expected)
  }
  @Test
  fun getFirstRepeatedFrequencyTest4() {
    var fileName ="C:\\Users\\Hailing\\Desktop\\kotlin_12_02\\input\\day1\\test4.txt"
    var expected =14
    testGetFirstRep(fileName, expected)
  }

  private fun testGetFirstRep(fileName: String, expected: Int) {
    var dayOne = DayOne(fileName)
    var actual = dayOne.getFirstRepeatedFrequency()
    assertEquals(expected, actual)
  }
}
