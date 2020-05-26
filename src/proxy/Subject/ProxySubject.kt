package proxy.Subject

class ProxySubject : Subject {
    private var subject: Subject? = null
    private lateinit var name: String

    override fun setName(name: String) {
        println("Proxy가 대신해서 setName()을 처리할 수 있어요.")
        subject?.setName(name = name)
        this.name = name
    }

    override fun showName() {
        println("Proxy가 대신해서 showName()을 처리할 수 있어요.")
        println("my name is $name")
    }

    override fun complicatedWork() {
        subject = RealSubject()
        subject?.complicatedWork()
    }
}