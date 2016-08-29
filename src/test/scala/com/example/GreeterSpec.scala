package com.example

import org.scalatest._

class GreeterSpec extends FlatSpec with Matchers {
  "Greeter" should "return hey" in {
    Greeter.getGreeting should be ("Hey")
  }
}
