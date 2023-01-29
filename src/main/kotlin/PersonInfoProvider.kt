interface PersonInfoProvider {
    val providerInfo: String
    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
}


interface SessionInfoProvider {
    fun getSessionId(): String
}


open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    protected open val sessionIdPrefix = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("hmm")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}


fun main() {
    val provider = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "New Info Provider"

        fun getSessionId() = "id"
    }
    provider.printInfo(Person())
    provider.getSessionId()
    checkType(provider)
}

fun checkType(infoProvider: PersonInfoProvider) {
    if (infoProvider !is SessionInfoProvider) {
        println(false)
    } else {
        println(true)
//        (infoProvider as SessionInfoProvider).getSessionId()
        infoProvider.getSessionId()
    }
}
