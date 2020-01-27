package relar.santi

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import kotlin.math.pow


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        radioGroup.setOnCheckedChangeListener { _, checkedId -> compruebaChekeo() }

        bcalcula.setOnClickListener {

            if (rbCubo.isChecked){



                try {

                    val rad = etlado.text.toString().toInt()

                    vcubo(rad)

                }catch (e:Exception){

                    Toast.makeText(this,"Campo Obligatorio",Toast.LENGTH_LONG).show()
                }



            }

            if (rbEsfera.isChecked){

                try {

                    val esf = radioInput.text.toString().toInt()

                    vesfera(esf)

                }catch (e:Exception){

                    Toast.makeText(this,"Campo Obligatorio",Toast.LENGTH_LONG).show()

                }
            }

            if (rbCono.isChecked){

                try {

                    val radio = radioInput.text.toString().toInt()

                    val altura = lCono.text.toString().toInt()

                    vcono(radio,altura)

                }catch (e:Exception){

                    Toast.makeText(this,"Campos Obligatorios Radio y altura",Toast.LENGTH_LONG).show()

                }
            }

        }

    }

    private fun compruebaChekeo() {
        if (rbCubo.isChecked) {
            etlado.setEnabled(true)
            etlado.requestFocus()
            radioInput.setText("")
            radioInput.setEnabled(false)
            lCono.setText("")
            lCono.setEnabled(false)
        }

        if (rbEsfera.isChecked) {
            radioInput.setEnabled(true)
            radioInput.requestFocus()
            etlado.setText("")
            etlado.setEnabled(false)
            lCono.setText("")
            lCono.setEnabled(false)
        }

        if (rbCono.isChecked) {
            lCono.setEnabled(true)
            lCono.requestFocus()
            etlado.setText("")
            etlado.setEnabled(false)
            radioInput.setText("")
            radioInput.setEnabled(true)

        }
    }

        @SuppressLint("SetTextI18n")
        private fun vcubo(l: Int) {
            val cubo = Cubo(l)

            tvResultado.text = "El volumen del cubo de lado $l es %.2f".format(cubo.volumen())
        }

        @SuppressLint("SetTextI18n")
        fun vcono(r: Int, a:Int) {

            val cono = Cono(r, a)

            tvResultado.text =
                "El volumen del Cono de radio $r y altura $a es %.2f".format(cono.volumen())

        }

        @SuppressLint("SetTextI18n")
        fun vesfera(r: Int) {
            val esfera = Esfera(r)

            tvResultado.text =
                "El volumen de la esfera de radio $r es %.2f".format(esfera.volumen())
        }


    }
