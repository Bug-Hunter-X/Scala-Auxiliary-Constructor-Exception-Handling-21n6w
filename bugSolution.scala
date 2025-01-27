```scala
class MyClass(val value: Int) {
  def this(str: String) = {
    try {
      this(str.toInt)
    } catch {
      case e: NumberFormatException => {
        println(s"Error converting '$str' to Int: ${e.getMessage}")
        this(0) // Or handle the error differently
      }
    }
  }
}

val myObj1 = new MyClass(10)
val myObj2 = new MyClass("20")
val myObj3 = new MyClass("abc") // Handles the exception

println(myObj1.value) // Output: 10
println(myObj2.value) // Output: 20
println(myObj3.value) // Output: 0 (or other default handling)
```