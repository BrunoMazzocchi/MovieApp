package ni.edu.uca.peliculas.dao

import androidx.room.*
import ni.edu.uca.peliculas.models.Genero


@Dao
interface GeneroDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGenero(usuario: Genero)

    @Query("Select * from Genero")
    suspend fun getAllGenero(): List<Genero>

    @Query("SELECT * FROM Genero where id_Genero= :id")
    suspend fun getByIdGenero(id: Int): Genero

    @Update
    fun updateGenero(usuario: Genero)

    @Delete
    fun deleteGenero(usuario: Genero)

}