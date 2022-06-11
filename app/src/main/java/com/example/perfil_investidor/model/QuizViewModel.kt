package com.example.perfil_investidor.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuizViewModel : ViewModel() {

    private val _score = MutableLiveData<Int>(0)
    val score : LiveData<Int> = _score

//    fun setScore(sumPoints: Int) {
//        _score.value = sumPoints
//    }

}