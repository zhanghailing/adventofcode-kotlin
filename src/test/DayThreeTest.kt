package test
import DayThree
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*


internal class DayThreeTest {


  @Test
  fun checkOnePlan() {
    var plan ="#123 @ 3,2: 5x4"
    var expected = 0
    var dayThree = DayThree("")
    dayThree.readPlans(mutableListOf(plan))
    var actual =dayThree.checkOverlap()
    assertEquals(expected, actual)
  }

  @Test
  fun checkNonOverLaps() {
    var plan ="#123 @ 3,2: 5x4"
    var expected = "#3"
    var dayThree = DayThree("")
    dayThree.readPlans(mutableListOf(plan))
    var actual =dayThree.checkOverlap()
    assertEquals(expected, actual)
  }

}
