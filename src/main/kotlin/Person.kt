class Person(val firstName: String = "Salman", val lastName: String = "Ali") {

    var nickName: String? = null
//        set(value) {
//            field = value
//            println("Setting new nick name!")
//        }
//
//        get() {
//            println("getting value: $field")
//            return field
//        }

    fun printInfo() {
        val nick = nickName ?: "no nick name"
        println("$firstName $lastName ($nick)")
    }
}