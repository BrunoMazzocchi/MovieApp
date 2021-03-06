package ni.edu.uca.peliculas.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="Pelicula")
data class Pelicula(
    @PrimaryKey(autoGenerate = true)
    val idPelicula: Int,
    @ColumnInfo(name = "idClasificacion")
    val idClasificacion: Int,
    @ColumnInfo(name = "duracion")
    val duracion: String,
    @ColumnInfo(name = "idNacionalidad")
    val id_Nacionalidad: Int,
    @ColumnInfo(name = "sinopsis")
    val sinopsis: String,
    @ColumnInfo(name = "tipoMetraje")
    val tipoMetraje: String,
    @ColumnInfo(name = "titulo")
    val titulo: String
)