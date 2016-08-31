package com.example

import org.specs2.mutable._

class Specs2GreeterSpec extends Specification {
  "Greeter should return hey" in {
    Greeter.getGreeting mustEqual "Hey"
  }
}
