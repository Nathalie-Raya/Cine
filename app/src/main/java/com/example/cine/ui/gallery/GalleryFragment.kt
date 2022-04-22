package com.example.cine.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.cine.databinding.FragmentGalleryBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.cine.R

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    val estrenoss = listOf(
        Estrenos(TituloPelicula = "El estudiante",
                 DescripcionPelicula = "El estudiante gira en torno a la vida de Chano un jubilado " +
                         "que decide matricularse en la universidad.",
                 FechaPelicula = "14/08/2009",
                 UrlImagenPelicula = "",
                 UrlCortoPelicula = ""),
        Estrenos(TituloPelicula = "La terminal",
                 DescripcionPelicula = "La película está basada en un refugiado iraní que vivió en el " +
                         "Aeropuerto de París-Charles de Gaulle entre 1988 y 2006.",
                 FechaPelicula = "24/09/2004",
                 UrlImagenPelicula = "",
                 UrlCortoPelicula = ""),
        Estrenos(TituloPelicula = "Pasante De Moda",
                DescripcionPelicula = "Jubilado viudo de 70 años, ve una oferta de trabajo para 'becarios " +
                        "en una empresa que opera en internet, no duda en presentarse.",
                FechaPelicula = "25/09/2015",
                UrlImagenPelicula = "",
                UrlCortoPelicula = ""),
        Estrenos(TituloPelicula = "El estudiante",
                DescripcionPelicula = "El estudiante gira en torno a la vida de Chano un jubilado " +
                        "que decide matricularse en la universidad.",
                FechaPelicula = "14/08/2009",
                UrlImagenPelicula = "",
                UrlCortoPelicula = ""),
        Estrenos(TituloPelicula = "El estudiante",
                DescripcionPelicula = "El estudiante gira en torno a la vida de Chano un jubilado " +
                        "que decide matricularse en la universidad.",
                FechaPelicula = "14/08/2009",
                UrlImagenPelicula = "",
                UrlCortoPelicula = ""),
        Estrenos(TituloPelicula = "El estudiante",
                DescripcionPelicula = "El estudiante gira en torno a la vida de Chano un jubilado " +
                        "que decide matricularse en la universidad.",
                FechaPelicula = "14/08/2009",
                UrlImagenPelicula = "",
                UrlCortoPelicula = "")
    )
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)
       // ViewModelProvider(this).get(EstrenoAdapter::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root
/*
        val textView: TextView = binding.rvEstrenos
        galleryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}