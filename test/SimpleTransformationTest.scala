package test

import apps.SimpleTransformationOps
import org.scalatest.{FunSuite, Matchers}

class SimpleTransformationTest extends FunSuite with Matchers {
  test(" TDD Example") {
    val toTransform = Array(
      "Message;;Pedro;;000034;;Madrid;;12.345",
      "Message;;Lucas;;0023576;;Caracas;;0.1234",
      "Message;;María;;000004;;Londres;;444.333",
      "Message;;Luis;;001034;;Madrid;;12.555"
    )

    val actual = toTransform.map(SimpleTransformationOps.mainTransformation)

    val expected = Array(
      (34, "Madrid", 12.345),
      (23576, "Caracas", 0.1234),
      (4, "Londres", 444.333),
      (1034, "Madrid", 12.555)
    )

    actual shouldEqual expected
  }
}