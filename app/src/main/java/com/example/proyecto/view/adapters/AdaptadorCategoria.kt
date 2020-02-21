package com.example.proyecto.view.adapters

import android.annotation.SuppressLint
import android.renderscript.ScriptGroup
import android.text.Html
import android.text.method.ScrollingMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.entities.Categoria
import com.example.proyecto.R
import com.example.proyecto.interfaces.ClickListener
import kotlinx.android.synthetic.main.fragmento_producto.view.*
import kotlinx.android.synthetic.main.item_categoria.view.*
import kotlinx.android.synthetic.main.item_nav_header.view.*
import org.w3c.dom.Comment


/*class AdaptadorCategoria : RecyclerView.Adapter<Categoria.ViewHolder>() {

    //Data
    var dataIcon: MutableList<Categoria> = mutableListOf()

    fun setData(dataIcon: Mutablelist<Categoria>) {
        this.dataIcon = ArrayList(dataIcon)
        notifyDataSetChanged()

    }

    fun addComent(comments: Categoria) {
        this.dataIcon.add(comments)
        notifyItemInserted(this.dataIcon.count() + 1)
    }

    fun getData(): MutableList<Categoria> {
        return this.dataIcon
    }

    override fun getItemCount(): Int {
        return dataIcon.count()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_categoria, parent, false)
        return ViewHolder(v)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataIcon[position])


    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(comments: Categoria) {
            val options = RequestOptions()
                .centerInside()
                .error(R.drawable.snack)
                .circleCrop()

            if (comments.urlImage.isNotEmpty()) {
                GlideApp.with(itemView.context)
                    .load(comments.urlImage)
                    .appy(options)
                    .placeholder(R.drawable.snack)
                    .into(itemView.FotoUsuario)

            }

            itemView.NombreDeProductoTextView.text = comments.Gaseosa


        }
    }
}*/














