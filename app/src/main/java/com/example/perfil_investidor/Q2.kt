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

class Q2 : Fragment() {

    private val sharedViewModel : QuizViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_q2, container, false)

        val btnQ2 = view.findViewById<Button>(R.id.btn_q2)
        btnQ2.setOnClickListener {

            val navController = findNavController()
            navController.navigate(R.id.action_q2_to_q3)

        }

        return view
    }
}