package test
import DayTwo
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*


internal class DayTwoTest {

  @Test
  fun getTwice1() {
    var chars ="abcdef"
    var expected = 0
    var dayTwo = DayTwo("")
    var actual = dayTwo.isOneCharAppearingTwice(chars)
    assertEquals(expected, actual)
  }

  @Test
  fun getThree1() {
    var chars ="abcdef"
    var expected = 0
    var dayTwo = DayTwo("")
    var actual = dayTwo.isOneCharAppearingThreeTimes(chars)
    assertEquals(expected, actual)
  }

  @Test
  fun getTwice2() {
    var chars ="bababc"
    var expected = 1
    var dayTwo = DayTwo("")
    var actual = dayTwo.isOneCharAppearingTwice(chars)
    assertEquals(expected, actual)
  }

  @Test
  fun getThree2() {
    var chars ="bababc"
    var expected = 1
    var dayTwo = DayTwo("")
    var actual = dayTwo.isOneCharAppearingThreeTimes(chars)
    assertEquals(expected, actual)
  }
  @Test
  fun getTwice3() {
    var chars ="abcccd"
    var expected = 0
    var dayTwo = DayTwo("")
    var actual = dayTwo.isOneCharAppearingTwice(chars)
    assertEquals(expected, actual)
  }

  @Test
  fun getThree3() {
    var chars ="abcccd"
    var expected = 1
    var dayTwo = DayTwo("")
    var actual = dayTwo.isOneCharAppearingThreeTimes(chars)
    assertEquals(expected, actual)
  }

  @Test
  fun getTwice4() {
    var chars ="aabcdd"
    var expected = 1
    var dayTwo = DayTwo("")
    var actual = dayTwo.isOneCharAppearingTwice(chars)
    assertEquals(expected, actual)
  }

  @Test
  fun getThree4() {
    var chars ="aabcdd"
    var expected = 0
    var dayTwo = DayTwo("")
    var actual = dayTwo.isOneCharAppearingThreeTimes(chars)
    assertEquals(expected, actual)
  }

  @Test
  fun compareTwoStrings() {
    var a ="fghij"
    var b = "fguij"
    var expected = "fgij"
    var dayTwo = DayTwo("")
    var actual = dayTwo.getCommonOfTwoStrings(a,b)
    assertEquals(expected, actual)
  }

  @Test
  fun findBoxes() {
    var expected = "fgij"
    var dayTwo = DayTwo("C:\\Users\\Hailing\\Desktop\\kotlin_12_02\\input\\day2\\test2.txt")
    var actual = dayTwo.getCommonOfTwoStrings()
    assertEquals(expected, actual)
  }

}
