package ni.edu.uca.peliculas.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ni.edu.uca.peliculas.R
import ni.edu.uca.peliculas.databinding.ItemClasificacionBinding
import ni.edu.uca.peliculas.databinding.ItemGeneroBinding
import ni.edu.uca.peliculas.models.Clasificacion
import ni.edu.uca.peliculas.models.ClasificacionItem
import ni.edu.uca.peliculas.models.Genero
import ni.edu.uca.peliculas.models.GeneroItem

class GeneroAdapter(val compra:List<Genero>):RecyclerView.Adapter<GeneroAdapter.GeneroHolder>()  {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GeneroHolder {
        var view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list, null, false)
        return GeneroHolder(view)
    }

    override fun onBindViewHolder(holder: GeneroHolder, position: Int) {
        val current =compra[position]
        holder.tvTitulo.text = current.nombre
        holder.tvSubtitulo.text ="ID = ${ current.id_Genero.toString()}"
    }

    override fun getItemCount(): Int = compra.size

    class GeneroHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitulo: TextView = itemView.findViewById(R.id.item_title)
        val tvSubtitulo: TextView = itemView.findViewById(R.id.item_sub)

    }

}