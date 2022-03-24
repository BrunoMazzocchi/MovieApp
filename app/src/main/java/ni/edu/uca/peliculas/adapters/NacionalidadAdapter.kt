package ni.edu.uca.peliculas.adapters

import ni.edu.uca.peliculas.databinding.ItemNacionalidadBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ni.edu.uca.peliculas.models.*

class NacionalidadAdapter(val nacionalidadLista: List<NacionalidadItem>): RecyclerView.Adapter
<NacionalidadAdapter.NacionalidadHolder>() {
    inner class NacionalidadHolder(val binding: ItemNacionalidadBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(nacionalidad: NacionalidadItem){
            with(binding){
                TxtNombre.text = nacionalidad.nombre
                TxtId.text = nacionalidad.idNacionalidad.toString()
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): NacionalidadHolder {
        val binding = ItemNacionalidadBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return NacionalidadHolder(binding)
    }

    override fun onBindViewHolder(holder: NacionalidadHolder, position: Int) {
        holder.bind(nacionalidadLista[position])
    }

    override fun getItemCount(): Int = nacionalidadLista.size
}
