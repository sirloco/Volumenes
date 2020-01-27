package relar.santi
import kotlin.math.pow

class Cubo(private val lado: Int):Figura() {

    override fun volumen() = lado.toDouble().pow(3)

}