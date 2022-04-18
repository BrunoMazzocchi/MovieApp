package ni.edu.uca.peliculas.models

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class IdiomaPelicula(
    @Embedded val idioma: Idioma,
    @Relation(
        parentColumn = "idIdioma",
        entityColumn = "idPelicula",
        associateBy = Junction(PI::class)
    )
    val peliculas:List<Pelicula>
)
