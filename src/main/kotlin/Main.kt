fun main() {
    val age = 24
    val layers = 3
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age,layers)
}
fun printCakeTop(age:Int){
    repeat(age+2){
        print("=")
    }
    println()
}
fun repeat(times: Int) {
}
fun printCakeCandles(age: Int){
    print("")
    repeat(age){
        print(",")
    }
    println()
    print("")
    repeat(age){
        print("|")
    }
    println()
}
fun printCakeBottom(age: Int, layers: Int){
    print("")
    repeat(layers) {
        repeat(age + 2){
            print("@")
        }
        println()
    }
    repeat(layers+2){
        print("@")
    }
        print(" Happy Birthday ")
    repeat(layers+2){
        print("@")
    }
    println()
    repeat(layers){
        repeat(age+2){
            print("@")
        }
        println()
}
}