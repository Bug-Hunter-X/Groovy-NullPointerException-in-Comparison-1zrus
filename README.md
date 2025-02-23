# Groovy NullPointerException in Comparison

This repository demonstrates a common error in Groovy related to implicit type conversion and null values during comparison operations.  The `myMethod` function attempts to compare two values and return the larger one. However, if one of the arguments is null, a `NullPointerException` is thrown because Groovy doesn't handle null values gracefully in this comparison context without explicit null checks.

The `bug.groovy` file contains the buggy code, while `bugSolution.groovy` provides a corrected version demonstrating a proper solution.

## How to Reproduce

1. Clone this repository.
2. Run `bug.groovy` using Groovy. Observe the `NullPointerException`.
3. Run `bugSolution.groovy`.  See how the null check prevents the exception and produces expected results.

## Solution

The solution involves adding explicit null checks before the comparison to handle cases where either `a` or `b` might be null.