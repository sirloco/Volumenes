package relar.santi
import kotlin.math.*

class Cono(private val radio: Int, private val altura: Int) : Figura() {

    override fun volumen(): Double {

        return (PI * radio.toDouble().pow(2) * altura) / 3
    }
}