package com.example.proyecto.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.proyecto.entities.Categoria

class CategoriaViewModel(application: Application): AndroidViewModel(application) {

    private val categoriaLiveData: MutableLiveData<ArrayList<Categoria>> = MutableLiveData()

    fun categoriaLiveData() = categoriaLiveData

    fun setCategoria(categoria: ArrayList<Categoria>){
        categoriaLiveData.postValue(categoria)
    }
}