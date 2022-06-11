package com.example.perfil_investidor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.perfil_investidor.model.QuizViewModel

class Q8 : Fragment() {

    private val sharedViewModel : QuizViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_q8, container, false)

        val btnQ8 = view.findViewById<Button>(R.id.btn_q8)
        btnQ8.setOnClickListener {

            val navController = findNavController()
            navController.navigate(R.id.action_q8_to_q9)

        }

        return view
    }
}