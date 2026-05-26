package com.example.pratica9_pdm

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pratica9_pdm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lista = listOf(
            Lugar("paris", R.drawable.paris, "cidade luz", "paris e a capital da franca, famosa pela torre eiffel e museus", 
                listOf(PontoTuristico("torre eiffel"), PontoTuristico("museu do louvre"))),
            Lugar("toquio", R.drawable.toquio, "cidade moderna", "toquio e a capital do japao, mistura tecnologia com tradicao", 
                listOf(PontoTuristico("templo senso-ji"), PontoTuristico("shibuya crossing"))),
            Lugar("rio de janeiro", R.drawable.rio, "cidade maravilhosa", "famosa por suas praias e o cristo redentor", 
                listOf(PontoTuristico("cristo redentor"), PontoTuristico("pao de acucar"))),
            Lugar("nova york", R.drawable.ny, "a grande maca", "cidade que nunca dorme, com muitos predios e luzes", 
                listOf(PontoTuristico("estatua da liberdade"), PontoTuristico("times square"))),
            Lugar("roma", R.drawable.roma, "cidade eterna", "cheia de historia e monumentos antigos", 
                listOf(PontoTuristico("coliseu"), PontoTuristico("fontana di trevi"))),
            Lugar("londres", R.drawable.londres, "terra da rainha", "cidade historica com neblina e cabines telefonicas", 
                listOf(PontoTuristico("big ben"), PontoTuristico("london eye"))),
            Lugar("barcelona", R.drawable.barcelona, "arte e praia", "famosa pela arquitetura de gaudi", 
                listOf(PontoTuristico("sagrada familia"), PontoTuristico("parque guell"))),
            Lugar("lisboa", R.drawable.lisboa, "cidade das sete colinas", "conhecida pelos bondinhos e pasteis de belem", 
                listOf(PontoTuristico("torre de belem"), PontoTuristico("mosteiro dos jeronimos"))),
            Lugar("amsterda", R.drawable.amsterda, "cidade dos canais", "famosa pelas bicicletas e canais", 
                listOf(PontoTuristico("casa de anne frank"), PontoTuristico("museu van gogh"))),
            Lugar("dubai", R.drawable.dubai, "luxo no deserto", "conhecida pelos predios gigantes e shoppings",
                listOf(PontoTuristico("burj khalifa"), PontoTuristico("palm jumeirah")))
        )

        binding.contentMain.rvLugares.layoutManager = LinearLayoutManager(this)
        binding.contentMain.rvLugares.adapter = LugarAdapter(lista) { lugar ->
            val intent = Intent(this, DetalheActivity::class.java)
            intent.putExtra("lugar", lugar)
            startActivity(intent)
        }
    }
}
