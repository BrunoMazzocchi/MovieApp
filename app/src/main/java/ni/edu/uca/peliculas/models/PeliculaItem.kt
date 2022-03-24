package ni.edu.uca.peliculas.models

data class PeliculaItem (
    val idPelicula: Int,
    val titulo: String,
    val tipoMetraje: String,
    val nacionalidad: Int,
    val clasificacion: Int,
    val duracion: String,
    val sinopsis: String
        )