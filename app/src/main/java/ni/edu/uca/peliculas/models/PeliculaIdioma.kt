package ni.edu.uca.peliculas.models

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class PeliculaIdioma(
    @Embedded val pelicula: Pelicula,
    @Relation(
        parentColumn = "idPelicula",
        entityColumn = "idIdioma",
        associateBy = Junction(PI::class)
    )
    val idioma:List<Idioma>
)
