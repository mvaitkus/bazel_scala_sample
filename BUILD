load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test", "scala_specs2_test", "scala_specs2_junit_test")

scala_library(
  name = "greeter",
  srcs = ["src/main/scala/com/example/Greeter.scala"],
)

scala_test(
  name = "greeter_test",
  srcs = ["src/test/scala/com/example/GreeterSpec.scala"],
  deps = [":greeter"],
)

scala_specs2_test(
  name = "greeter_specs2",
  srcs = ["src/test/scala/com/example/Specs2GreeterSpec.scala","src/test/scala/com/example/OneEqualsOneSpec.scala"],
  deps = [":greeter"],
)

scala_specs2_junit_test(
  name = "greeter_specs2_junit",
  srcs = ["src/test/scala/com/example/Specs2GreeterWithJUnitSpec.scala","src/test/scala/com/example/OneEqualsOneWithJUnitSpec.scala"],
  deps = [":greeter"],
)
