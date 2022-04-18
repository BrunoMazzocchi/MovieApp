package ni.edu.uca.peliculas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ni.edu.uca.peliculas.dao.GeneroDao
import ni.edu.uca.peliculas.databinding.FragmentAgregarGeneroBinding
import ni.edu.uca.peliculas.models.Genero

class AgregarGeneroFragment : Fragment() {

    private lateinit var binding:FragmentAgregarGeneroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentAgregarGeneroBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)
        val db: dbGenero = dbGenero.getInstace(this.requireContext().applicationContext)
        val dao: GeneroDao = db.generoDao()

        with(binding){
            btnNuevo.setOnClickListener {

                val id = Genero(0,generoNombre.text.toString(), true)

                CoroutineScope(Dispatchers.Main).launch {
                    dao.insertGenero(id)
                }
                navController.navigate(R.id.action_agregarGeneroFragment_to_generoFragment)

            }
        }
    }

}