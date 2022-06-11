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

class Q3 : Fragment() {

    private val sharedViewModel : QuizViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_q3, container, false)

        val btnQ3 = view.findViewById<Button>(R.id.btn_q3)
        btnQ3.setOnClickListener {

            val navController = findNavController()
            navController.navigate(R.id.action_q3_to_q4)

        }

        return view
    }
}