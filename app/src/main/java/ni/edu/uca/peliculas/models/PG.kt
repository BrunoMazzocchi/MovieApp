package ni.edu.uca.peliculas.models

import androidx.room.Entity

@Entity(primaryKeys = ["idGenero","idPelicula"])
data class PG(
    val idGenero:Int,
    val idPelicula:Int
)
