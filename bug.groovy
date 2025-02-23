```groovy
def myMethod(a, b) {
  if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 2) // Expected output: 5
println myMethod(2, 5) // Expected output: 5
println myMethod(null, 5) // Unexpected behavior: NullPointerException
```