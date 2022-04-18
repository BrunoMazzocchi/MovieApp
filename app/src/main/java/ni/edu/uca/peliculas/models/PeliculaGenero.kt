package ni.edu.uca.peliculas.models

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Junction
import androidx.room.Relation

data class PeliculaGenero(
    @Embedded val pelicula: Pelicula,
    @Relation(
        parentColumn = "idPelicula",
        entityColumn = "idIdioma",
        associateBy = Junction(PG::class)
    )
    val genero:List<Genero>
)
