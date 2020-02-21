package com.example.proyecto.view.fragments.producto

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.SearchView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.R
import com.example.proyecto.entities.Producto
import com.example.proyecto.interfaces.ClickListener
import com.example.proyecto.view.adapters.AdaptadorCustom
import kotlinx.android.synthetic.main.fragmento_producto.*
import kotlinx.android.synthetic.main.item_confirmacion_compra.*
import kotlinx.android.synthetic.main.toolbar.*
import java.util.Locale.filter


/*class ProductoFragmento : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragmento_producto, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bebidas = ArrayList<Producto>()

        bebidas.add(Producto("Gaseosa", 100, R.drawable.gaseosa))
        bebidas.add(Producto("Jugo", 200, R.drawable.jugo))
        bebidas.add(Producto("Yogurt", 300, R.drawable.cremayogurt))

        initUi(bebidas)
    }


    private fun initUi(productos: ArrayList<Producto>) {

        adapdator = AdaptadorCustom(productos, object : ClickListener {
            override fun OnClick(vista: View, index: Int) {
                Toast.makeText(
                    context!!,
                    productos.get(index).nombre,
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

        recyclerLista.run {
            layoutManager = LinearLayoutManager(context!!, RecyclerView.VERTICAL, false)
            adapter = adapdator
        }
        mBuscar.setOnMenuItemClickListener(object : SearchView.OnQueryTextListener{
            @RequiresApi(Build.VERSION_CODES.O)
            override fun onQueryTextChange(newText: String?): Boolean {
                val filteredModelList = filter(adapdator.getData(), newText)
                if (filteredModelList.isEmpty() ) {
                    recyclerLista.visibility = GONE
                    tNoEncontrado.text = "No se encontro."
                    notificacion.visibility = VISIBLE

                } else {
                    notificacion.visibility = GONE
                    recyclerLista.visibility = VISIBLE
                }
                adapdator!!.items?(filteredModelList)
                recyclerLista.scrollToPosition(0)
                return true
                }

            override fun onQueryTextSubmit(query: String?): Boolean {
                return false

            }
        })
   /}


    }*/





