fun main(args: Array<String>) {
    helloWorld()
    println(sum(10,12))
   println( divisao(10f, 3.5f))
}

fun helloWorld() = println("Hello, world!");


fun sum (a:Int, b:Int) = (a+b)

fun divisao(a:Float, b:Float) = a/b
