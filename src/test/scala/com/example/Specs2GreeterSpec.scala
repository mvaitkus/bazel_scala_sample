package com.example

import org.specs2.mutable._

class Specs2GreeterSpec extends SpecificationWithJUnit {
  "Greeter should return hey" in {
    Greeter.getGreeting mustEqual "Hey"
  }
}
