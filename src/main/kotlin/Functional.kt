fun main() {
    val list = listOf("Kotlin", "Java", "Python", "JavaScript", "C", "C++", null)
    val map = list
        .filterNotNull()
        .associateWith { it.length }

    val language = list.filterNotNull().find { it.startsWith("Hmm") }.orEmpty()
    println(language)
}