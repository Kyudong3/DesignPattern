package proxy

import proxy.Image.ProxyImage
import proxy.Subject.ProxySubject

fun main() {
    /* Image Proxy */
    val image1 = ProxyImage("100MB_IMAGE_1")
    val image2 = ProxyImage("200MB_IMAGE_2")
    val image3 = ProxyImage("300MB_IMAGE_3")

    image1.displayImage()
    image2.displayImage()
    image3.displayImage()
    println()
    image1.displayImage()
    image1.displayImage()
    image1.displayImage()
    image1.displayImage()
    image1.displayImage()


    /* Subject Proxy */
    val subjectProxy = ProxySubject()

    subjectProxy.setName("앵커리어")
    println("=======================")

    subjectProxy.showName()
    println("=======================")

    subjectProxy.complicatedWork()
}