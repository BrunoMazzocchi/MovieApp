package ni.edu.uca.peliculas.models

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class GeneroPeliculas(
    @Embedded val genero: Genero,
    @Relation(
        parentColumn = "idGenero",
        entityColumn = "idPelicula",
        associateBy = Junction(PG::class)
    )
    val peliculas:List<Pelicula>
)
