package proxy.Image

class ProxyImage(private val fileName: String) : Image {
    private var image: Image? = null

    override fun displayImage() {
        if (image == null) {
            image = RealImage(fileName)
        }
        image!!.displayImage()
    }
}