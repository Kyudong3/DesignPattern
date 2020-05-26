package proxy.Subject

class RealSubject : Subject {
    private lateinit var name: String

    override fun setName(name: String) {
        this.name = name
    }

    override fun showName() {
        println("my name is $name")
    }

    override fun complicatedWork() {
        println("Proxy가 처리 못하는 작업을 수행합니다.")
    }
}

