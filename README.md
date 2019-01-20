# Double sum of squares benchmarks [![Build Status](https://travis-ci.com/igabaydulin/double-sum-of-squares-jmh.svg?branch=master)](https://travis-ci.com/igabaydulin/double-sum-of-squares-jmh) [![Version](https://img.shields.io/badge/version-0.1-color.svg)](https://github.com/igabaydulin/double-sum-of-squares-jmh/releases/tag/0.1)
Based on stackoverflow's question [Why is 2 * (i * i) faster than 2 * i * i in Java?](https://stackoverflow.com/questions/53452713/why-is-2-i-i-faster-than-2-i-i-in-java)

## Tests execution
```
./gradlew clean test
```

## Benchmarks execution
```
./gradlew clean jmh
```

## Requirements
- Java 11 (at least): As was mentioned in stackoverflow's discussion new JIT compiler (GraalVM) successfully optimizes
both cases, and to be able execute benchmarks with GraalVM enabled Java 11 must be used

## Configuration
To change JMH execution configuration edit build.gradle file:
```
jmh {
    warmupIterations = 4
    iterations = 10
    fork = 2
}
```

## Output
Example of JMH output (exact values may vary and depend on many factors):
```
Benchmark                                                    Mode  Cnt       Score      Error  Units
ExponentiationFirstCalculatorBenchmark.calculate            thrpt   20  234160.708 ±  409.324  ops/s
ExponentiationFirstCalculatorGraalBenchmark.calculate       thrpt   20  229230.161 ±  480.827  ops/s
MultiplicationByTwoFirstCalculatorBenchmark.calculate       thrpt   20  180449.424 ± 4215.153  ops/s
MultiplicationByTwoFirstCalculatorGraalBenchmark.calculate  thrpt   20  228732.913 ±  538.426  ops/s
```
