```groovy
def myMethod(a = 0, b = 0) {
  return a + b
}

println myMethod(null, 5) //Output: 5
println myMethod(5, null) //Output: 5
println myMethod(null, null) //Output: 0
println myMethod(5, 5) //Output: 10

//Alternative solution with explicit null checks:
def myMethod2(a, b) {
  a = a ?: 0 //Elvis operator: if a is null, use 0
  b = b ?: 0
  return a + b
}
println myMethod2(null, 5) //Output: 5
println myMethod2(5, null) //Output: 5
println myMethod2(null, null) //Output: 0
println myMethod2(5, 5) //Output: 10
```