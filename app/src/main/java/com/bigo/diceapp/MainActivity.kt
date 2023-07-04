package com.bigo.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.bigo.diceapp.databinding.ActivityMainBinding
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {
    private var isAnimating= false
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

////        val imagemdoDado: ImageView = findViewById(R.id.imagem)
//        val botao: Button = findViewById(R.id.botao)
        val chipGroup: ChipGroup = findViewById(R.id.chip_group)

        binding.imagem.setImageResource(R.drawable.d4_1)

        chipGroup.setOnCheckedChangeListener { _, _ ->
            when (chipGroup.checkedChipId) {
                R.id.d4 ->mudaImagem(R.drawable.d4_1, binding.imagem) /*imagemdoDado.setImageResource(R.drawable.d4_1)*/
                R.id.d6 -> mudaImagem(R.drawable.d6_1, binding.imagem)
                R.id.d8 -> mudaImagem(R.drawable.d8_1, binding.imagem)
                R.id.d10 -> mudaImagem(R.drawable.d10_1, binding.imagem)
                R.id.d12 -> mudaImagem(R.drawable.d12_1, binding.imagem)
                R.id.d20 -> mudaImagem(R.drawable.d20_1, binding.imagem)

            }

        }
     binding.botao.setOnClickListener {
            jogarDado( binding.imagem, chipGroup)
        }
    }

    private fun jogarDado(imagemdoDado: ImageView, chipGroup: ChipGroup) {
        val faceSorteada: Int
        val textodaTela: TextView = findViewById(R.id.texto)
        when (chipGroup.checkedChipId) {
            R.id.d4 -> {
                faceSorteada = (1..4).random()
                textodaTela.text = resources.getString(R.string.face_sorteada, faceSorteada.toString())
                imagemdoDado.contentDescription =
                    "Seu dado caiu na face ${faceSorteada.toString()}."
                when (faceSorteada) {
                    1 -> imagemdoDado.setImageResource(R.drawable.d4_1)
                    2 -> imagemdoDado.setImageResource(R.drawable.d4_2)
                    3 -> imagemdoDado.setImageResource(R.drawable.d4_3)
                    4 -> imagemdoDado.setImageResource(R.drawable.d4_4)
                }
            }

            R.id.d6 -> {
                faceSorteada = (1..6).random()
                textodaTela.text = resources.getString(R.string.face_sorteada, faceSorteada.toString())
                imagemdoDado.contentDescription = resources.getString(R.string.legendadado, faceSorteada.toString())
                when (faceSorteada) {
                    1 -> imagemdoDado.setImageResource(R.drawable.d6_1)
                    2 -> imagemdoDado.setImageResource(R.drawable.d6_2)
                    3 -> imagemdoDado.setImageResource(R.drawable.d6_3)
                    4 -> imagemdoDado.setImageResource(R.drawable.d6_4)
                    5 -> imagemdoDado.setImageResource(R.drawable.d6_5)
                    6 -> imagemdoDado.setImageResource(R.drawable.d6_6)
                }

            }

            R.id.d8 -> {
                faceSorteada = (1..8).random()
                textodaTela.text = resources.getString(R.string.face_sorteada, faceSorteada.toString())
                imagemdoDado.contentDescription = resources.getString(R.string.legendadado, faceSorteada.toString())
                when (faceSorteada) {
                    1 -> imagemdoDado.setImageResource(R.drawable.d8_1)
                    2 -> imagemdoDado.setImageResource(R.drawable.d8_2)
                    3 -> imagemdoDado.setImageResource(R.drawable.d8_3)
                    4 -> imagemdoDado.setImageResource(R.drawable.d8_4)
                    5 -> imagemdoDado.setImageResource(R.drawable.d8_5)
                    6 -> imagemdoDado.setImageResource(R.drawable.d8_6)
                    7 -> imagemdoDado.setImageResource(R.drawable.d8_7)
                    8 -> imagemdoDado.setImageResource(R.drawable.d8_8)
                }
            }
            R.id.d10 -> {
                faceSorteada = (1..8).random()
                textodaTela.text = resources.getString(R.string.face_sorteada, faceSorteada.toString())
                imagemdoDado.contentDescription = resources.getString(R.string.legendadado, faceSorteada.toString())
                when (faceSorteada) {
                    1 -> imagemdoDado.setImageResource(R.drawable.d10_1)
                    2 -> imagemdoDado.setImageResource(R.drawable.d10_2)
                    3 -> imagemdoDado.setImageResource(R.drawable.d10_3)
                    4 -> imagemdoDado.setImageResource(R.drawable.d10_4)
                    5 -> imagemdoDado.setImageResource(R.drawable.d10_5)
                    6 -> imagemdoDado.setImageResource(R.drawable.d10_6)
                    7 -> imagemdoDado.setImageResource(R.drawable.d10_7)
                    8 -> imagemdoDado.setImageResource(R.drawable.d10_8)
                    9 -> imagemdoDado.setImageResource(R.drawable.d10_9)
                    10 -> imagemdoDado.setImageResource(R.drawable.d10_10)}
            }
            R.id.d12 -> {
                faceSorteada = (1..8).random()
                textodaTela.text = resources.getString(R.string.face_sorteada, faceSorteada.toString())
                imagemdoDado.contentDescription = resources.getString(R.string.legendadado, faceSorteada.toString())
                when (faceSorteada) {
                    1 -> imagemdoDado.setImageResource(R.drawable.d12_1)
                    2 -> imagemdoDado.setImageResource(R.drawable.d12_2)
                    3 -> imagemdoDado.setImageResource(R.drawable.d12_3)
                    4 -> imagemdoDado.setImageResource(R.drawable.d12_4)
                    5 -> imagemdoDado.setImageResource(R.drawable.d12_5)
                    6 -> imagemdoDado.setImageResource(R.drawable.d12_6)
                    7 -> imagemdoDado.setImageResource(R.drawable.d12_7)
                    8 -> imagemdoDado.setImageResource(R.drawable.d12_8)
                    9 -> imagemdoDado.setImageResource(R.drawable.d12_9)
                    10-> imagemdoDado.setImageResource(R.drawable.d12_10)
                    11-> imagemdoDado.setImageResource(R.drawable.d12_11)
                    12-> imagemdoDado.setImageResource(R.drawable.d12_12)
                }
            }
            R.id.d20 -> {
                faceSorteada = (1..8).random()
                textodaTela.text = resources.getString(R.string.face_sorteada, faceSorteada.toString())
                imagemdoDado.contentDescription = resources.getString(R.string.legendadado, faceSorteada.toString())
                when (faceSorteada) {
                    1 -> imagemdoDado.setImageResource(R.drawable.d20_1)
                    2 -> imagemdoDado.setImageResource(R.drawable.d20_2)
                    3 -> imagemdoDado.setImageResource(R.drawable.d20_3)
                    4 -> imagemdoDado.setImageResource(R.drawable.d20_4)
                    5 -> imagemdoDado.setImageResource(R.drawable.d20_5)
                    6 -> imagemdoDado.setImageResource(R.drawable.d20_6)
                    7 -> imagemdoDado.setImageResource(R.drawable.d20_7)
                    8 -> imagemdoDado.setImageResource(R.drawable.d20_8)
                    9 -> imagemdoDado.setImageResource(R.drawable.d20_9)
                    10-> imagemdoDado.setImageResource(R.drawable.d20_10)
                    11-> imagemdoDado.setImageResource(R.drawable.d20_11)
                    12-> imagemdoDado.setImageResource(R.drawable.d20_12)
                    13 -> imagemdoDado.setImageResource(R.drawable.d20_13)
                    14 -> imagemdoDado.setImageResource(R.drawable.d20_14)
                    15 -> imagemdoDado.setImageResource(R.drawable.d20_15)
                    16 -> imagemdoDado.setImageResource(R.drawable.d20_16)
                    17 -> imagemdoDado.setImageResource(R.drawable.d20_17)
                    18 -> imagemdoDado.setImageResource(R.drawable.d20_18)
                    19 -> imagemdoDado.setImageResource(R.drawable.d20_19)
                    20 -> imagemdoDado.setImageResource(R.drawable.d20_20)
                  }
            }
        }
    }
        private fun mudaImagem(iDResoursesImagem:Int, imagemdoDado: ImageView){
            if(!isAnimating){
                isAnimating = true
                imagemdoDado.animate().apply {
                    duration = 500
//                    rotationYBy(360f)
//                    alpha(0f)
                    scaleX(0f)
                    scaleY(0f)
                }.withEndAction{
                    imagemdoDado.animate().apply{
//    alpha(1f)
                        scaleX(1f)
                        scaleY(1f)
                    }
                    imagemdoDado.setImageResource(iDResoursesImagem)
                    isAnimating=false
                }.start()
            }
        }
    }
