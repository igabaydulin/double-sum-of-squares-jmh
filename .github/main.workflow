workflow "Main" {
  on = "push"
  resolves = ["jmh", "test"]
}

action "test" {
  uses = "docker://openjdk:11"
  runs = "./gradlew clean test --stacktrace"
}

action "jmh" {
  uses = "docker://openjdk:11"
  runs = "./gradlew clean jmh"
}
