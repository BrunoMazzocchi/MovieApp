package ni.edu.uca.peliculas

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import ni.edu.uca.peliculas.dao.GeneroDao
import ni.edu.uca.peliculas.models.Genero


interface MainDataBaseProvider{
    fun generoDao() : GeneroDao
}

@Database(entities = [Genero::class,],
    version = 4
)
abstract class dbGenero: RoomDatabase(), MainDataBaseProvider {
    abstract override fun generoDao(): GeneroDao

    companion object{
        @Volatile
        private var INSTANCE: dbGenero? = null
        fun getInstace(context: Context): dbGenero {
            synchronized(this){
                var instance = INSTANCE
                if (instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        dbGenero::class.java,
                        "dbGenero"
                    ).fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}
