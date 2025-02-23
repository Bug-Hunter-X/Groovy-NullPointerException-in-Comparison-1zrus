```groovy
def myMethod(a, b) {
  if (a == null && b == null) return null // Handle both nulls
  if (a == null) return b // If a is null, b is the larger (or only) value
  if (b == null) return a // If b is null, a is the larger (or only) value
  if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 2) // Output: 5
println myMethod(2, 5) // Output: 5
println myMethod(null, 5) // Output: 5
println myMethod(5, null) // Output: 5
println myMethod(null, null) // Output: null
```