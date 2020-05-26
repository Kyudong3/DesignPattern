package proxy.Image

class RealImage(private val fileName: String) : Image {
    init {
        loadImageFromDisk()
    }

    private fun loadImageFromDisk() {
        println("Loading  :  $fileName")
    }

    override fun displayImage() {
        println("Displaying  :  $fileName")
    }
}