import javax.print.attribute.SetOfIntegerSyntax

fun main(){
val adminSet = getAdminSet()
    println("$adminSet")
}

val adminSetUser: Set<Int> = setOf(10,20,30,40,50,60,40,30,20)
val adminMutableSet: MutableSet<Int> = mutableSetOf(10,20,30,30,40,40,50,60)
fun getAdminSet(): Set<Int> {
    return adminSetUser
}
fun setMutableSet(nMutableSet:Int) {
    nMutableSet.add(nMutableSet)

}