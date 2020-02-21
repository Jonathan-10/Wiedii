package com.example.proyecto.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.interfaces.ClickListener
import com.example.proyecto.entities.Producto
import com.example.proyecto.R
import kotlin.collections.ArrayList

class AdaptadorCustom( var listener: ClickListener): RecyclerView.Adapter<AdaptadorCustom.ViewHolder>(){

     var items: ArrayList<Producto>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_bebidas, parent, false)
        val viewHolder =
            ViewHolder(vista, listener)

        return viewHolder
    }

    override fun getItemCount(): Int {
        return items?.count()!!
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = items?.get(position)
        holder.nombre?.text = item?.nombre
        holder.precio?.text = "$" + item?.precio.toString()
        holder.foto?.setImageResource(item?.foto!!)

        }

   /* fun getData(): MutableList<Locale.LanguageRange>? {
        return null

    }*/


    class ViewHolder(vista: View, listener: ClickListener): RecyclerView.ViewHolder(vista), View.OnClickListener{

        var vista = vista
        var foto: ImageView? = null
        var nombre:TextView? = null
        var precio: TextView? = null
        var listener: ClickListener? = null

    init {
        nombre = vista.findViewById(R.id.tvNombre)
        precio = vista.findViewById(R.id.tvPrecio)
        foto = vista.findViewById(R.id.ivFoto)
        this.listener = listener
        vista.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        this.listener?.OnClick(v!!, adapterPosition)
    }

    }
}

