import com.sun.source.tree.VariableTree

fun main() {
    setUser(nUser = 50)
    val adminUser = getAdminUser()
    val users = (getUser())
    println("$users")
//    println("$adminUser")
//    println(adminUsers)
//    println()
//    println(getAdminUser())
//    println(getAdminUser())
}
val adminUsers: List<Int> = listOf(10,20,30)
val users: MutableList<Int> = adminUsers.toMutableList()
//val selectedTeams: List<String> =
fun setUser(nUser:Int){
    users.add(nUser)
}

fun getUser(): List<Int> {
//    return listOf(100,600,900)
    return users
}
fun getAdminUser(): List<Int> {
//    return listOf(100,600,900)
    return adminUsers
}
