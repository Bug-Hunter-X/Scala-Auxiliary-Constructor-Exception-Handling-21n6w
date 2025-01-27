```scala
class MyClass(val value: Int) {
  def this(str: String) = this(str.toInt)
}

val myObj1 = new MyClass(10)
val myObj2 = new MyClass("20")

println(myObj1.value) // Output: 10
println(myObj2.value) // Output: 20
```