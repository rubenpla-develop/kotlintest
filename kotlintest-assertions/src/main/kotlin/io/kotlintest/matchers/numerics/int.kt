package io.kotlintest.matchers.numerics

import io.kotlintest.Matcher
import io.kotlintest.Result
import io.kotlintest.matchers.between
import io.kotlintest.matchers.gt
import io.kotlintest.matchers.gte
import io.kotlintest.matchers.lt
import io.kotlintest.matchers.lte
import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.shouldNot
import io.kotlintest.shouldNotBe

fun Int.shouldBePositive() = this shouldBe positive()
fun positive() = object : Matcher<Int> {
  override fun test(value: Int) = Result(value > 0, "$value should be > 0", "$value should not be > 0")
}

fun Int.shouldBeNegative() = this shouldBe negative()
fun negative() = object : Matcher<Int> {
  override fun test(value: Int) = Result(value < 0, "$value should be < 0", "$value should not be < 0")
}

fun Int.shouldBeEven() = this should beEven()
fun Int.shouldNotBeEven() = this shouldNot beEven()
fun beEven() = object : Matcher<Int> {
  override fun test(value: Int): Result =
      Result(value % 2 == 0, "$value should be even", "$value should be odd")
}

fun Int.shouldBeOdd() = this should beOdd()
fun Int.shouldNotBeOdd() = this shouldNot beOdd()
fun beOdd() = object : Matcher<Int> {
  override fun test(value: Int): Result =
      Result(value % 2 == 1, "$value should be odd", "$value should be even")
}

fun Int.shouldBeBetween(a: Int, b: Int) = this shouldBe between(a, b)
fun Int.shouldNotBeBetween(a: Int, b: Int) = this shouldNot between(a, b)

fun Int.shouldBeLessThan(x: Int) = this shouldBe lt(x)
fun Int.shouldNotBeLessThan(x: Int) = this shouldNotBe lt(x)

fun Int.shouldBeLessThanOrEqual(x: Int) = this shouldBe lte(x)
fun Int.shouldNotBeLessThanOrEqual(x: Int) = this shouldNotBe lte(x)

fun Int.shouldBeGreaterThan(x: Int) = this shouldBe gt(x)
fun Int.shouldNotBeGreaterThan(x: Int) = this shouldNotBe gt(x)

fun Int.shouldBeGreaterThanOrEqual(x: Int) = this shouldBe gte(x)
fun Int.shouldNotBeGreaterThanOrEqual(x: Int) = this shouldNotBe gte(x)
