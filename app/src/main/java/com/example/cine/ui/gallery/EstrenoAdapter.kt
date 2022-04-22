package com.example.cine.ui.gallery


import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cine.R
import android.view.View.generateViewId
import androidx.core.view.marginTop
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.view.allViews
import java.util.List;


//class EstrenoAdapter (val estrenos:List<Estrenos>):RecyclerView.Adapter<EstrenoAdapter.EstrenoHolder>(){
class EstrenoAdapter:RecyclerView.Adapter<EstrenoAdapter.EstrenoHolder>(){
    val estrenos:List<Estrenos> = TODO()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EstrenoHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        //return EstrenoHolder(layoutInflater.inflate(R.layout.item_estreno))
        return EstrenoHolder(layoutInflater.inflate(R.layout.item_estreno,parent, false))

    }
    override fun getItemCount(): Int {
        return estrenos.size
    }

    override fun onBindViewHolder(holder: EstrenoHolder, position: Int) {
        holder.render(estrenos[position])
    }

    class EstrenoHolder(val view:View):RecyclerView.ViewHolder(view){
        fun render(estrenos : Estrenos){
            print("esto es lo que trae "+estrenos.TituloPelicula)
//no pude acceder a los elementos como el tvTitulo,tvDescripcion y demas
            
                    }
    }
}