package com.example.proyecto.view.fragments.categoria

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.R
import com.example.proyecto.entities.Categoria
import com.example.proyecto.entities.Producto
import com.example.proyecto.interfaces.ClickListener
//import com.example.proyecto.view.adapters.AdaptadorCategoria
import com.example.proyecto.view.adapters.AdaptadorCustom
import com.example.proyecto.viewmodels.CategoriaViewModel
import kotlinx.android.synthetic.main.fragmento_producto.*



/*
class CategoriaFragmento : Fragment() {

    var adapdator: AdaptadorCustom? = null

    private lateinit var categoriaViewModel: CategoriaViewModel
    private lateinit var adapterCategoria: AdaptadorCategoria


    private fun handlerCategoria(categorias: ArrayList<Categoria>) {
        categorias.let {
            if (it.isNullOrEmpty()){
                Toast.makeText(context!!,"No hay Bebidas", Toast.LENGTH_LONG).show()
            }else{
                adapdator?.items = it

            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        categoriaViewModel = ViewModelProviders.of(this).get(CategoriaViewModel(activity!!.application)::class.java)

        categoriaViewModel.categoriaLiveData().observe(this, Observer {
            handlerCategoria(it)
        })
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragmento_categoria, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var categorias = ArrayList<Categoria>()

        categorias.add(Categoria("Gaseosa",  R.drawable.gaseosa))
        categorias.add(Categoria("Jugos",  R.drawable.jugo))
        categorias.add(Categoria("Yogurts",  R.drawable.cremayogurt))

        initUi()
        categoriaViewModel.setCategoria(categorias)
    }

        private fun initUi() {

            adapterCategoria = AdaptadorCategoria( object : ClickListener {
                override fun OnClick(vista: View, index: Int) {
                    Toast.makeText(
                        context!!,
                        "clickeo un elemento",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            })

            recyclerLista.run {
                layoutManager = LinearLayoutManager(context!!, RecyclerView.VERTICAL, false)
                adapter = adapterCategoria
            }


var grid: GridView = this.findViewById(R.id.cgrid)
        val adaptadorgrid = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, categorias)
        grid.adapter = adaptadorgrid

        grid.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->  }

        val position = 0
        Toast.makeText(context, categorias.get(position), Toast.LENGTH_SHORT).show()



    }



}
*/


