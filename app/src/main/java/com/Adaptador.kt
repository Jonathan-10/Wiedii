package com

import android.R

import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import android.widget.ImageView

import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_bebidas.view.*
import java.lang.String


/*class AdaptadorCustom(items: ArrayList<AdaptadorCustom>, var listener: ClickListener): RecyclerView.Adapter<AdaptadorCustom.ViewHolder>(){
     var items: ArrayList<AdaptadorCustom>? = null

   init {
       this.items = items
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdaptadorCustom.ViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_bebidas, parent, false)
        val viewHolder = RecyclerView.ViewHolder(vista, listener)

        return viewHolder
    }

    override fun getItemCount(): Int {
        return items?.count()!!
    }

    override fun onBindViewHolder(holder: AdaptadorCustom.ViewHolder, position: Int) {

        val item = items?.get(position)
        holder.foto?.setImageResource(item?.foto!!)
        holder.nombre?.text = item?.nombre
        holder.precio?.text = "$" + item?.precio.toString

        }
    class ViewHolder(vista:View, listener: ClickListener): RecyclerView.ViewHolder(vista), View.OnClickListener{

        var vista = vista
        var foto:ImageView? = null
        var nombre:TextView? = null
        var precio:TextView? = null

    init {
        foto = vista.findViewById(R.id.ivFoto)
        nombre = vista.findViewById(R.id.tvNombre)
        precio = vista.findViewById(R.id.tvPrecio)
        this.listener = listener
        vista.setOnclickListener(this)
    }
    override fun onClick(v: View?) {
        this.listener?.onClick(v!!, adapterPosition)
    }

    }
}

 */

