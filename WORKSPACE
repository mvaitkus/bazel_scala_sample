local_repository(
    name = "specs2_bazel",
    path = "../specs2_bazel"
)
local_repository(
    name = "io_bazel_rules_scala",
    path = "../rules_scala"
)
load("@io_bazel_rules_scala//specs2:specs2.bzl", "specs2")
specs2()
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()
