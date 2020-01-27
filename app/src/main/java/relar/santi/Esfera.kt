package relar.santi
import kotlin.math.*

    class Esfera(private val radio: Int) : Figura() {

        override fun volumen(): Double {
            return 4 * PI * radio.toDouble().pow(3) / 3

        }
    }
