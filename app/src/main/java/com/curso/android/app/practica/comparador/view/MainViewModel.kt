package com.curso.android.app.practica.comparador.view



import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.curso.android.app.practica.comparador.model.Comparador
import kotlinx.coroutines.launch


class MainViewModel: ViewModel() {


    val comparador: LiveData<Comparador> get() = _comparador

    private var _comparador = MutableLiveData(Comparador("Resultado"))



    fun comparateTexts(texto1:String,texto2:String) {
        var comparation:String
        if(texto1 == texto2){
            comparation = "Los textos son iguales!"
        } else {
            comparation = "Los textos son diferentes"
        }

        viewModelScope.launch {
            _comparador.value = Comparador(comparation)
        }

    }

}