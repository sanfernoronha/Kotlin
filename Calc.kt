import java.util.*
fun main(args: Array<String>){
    val reader = Scanner(System.`in`)
    var a : Int
    var b: Int
    println("Enter value for a")
    a=reader.nextInt()
    println("Enter value for b")
    b= reader.nextInt()
    println("Enter the operator either +,-,*,/")
    val operator= readLine()
    val result =when(operator){
        "+"->a+b
        "-"->a-b
        "*"->a*b
        "/"->a/b
        else-> "$operator is invalid"
    }
    println("Result is $result")

}