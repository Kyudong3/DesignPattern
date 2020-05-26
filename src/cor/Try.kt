package cor

import java.io.IOException

fun main() {
    try {
        println("start")
    } catch (e: IOException) {

    } catch (e: ArrayIndexOutOfBoundsException) {

    } catch (e: ConcurrentModificationException) {

    } catch (e: NullPointerException) {

    } finally {
        println("finish")
    }
}