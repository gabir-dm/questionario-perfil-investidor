package com.example.perfil_investidor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Q5 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_q5, container, false)

        val btnQ5 = view.findViewById<Button>(R.id.btn_q5)
        btnQ5.setOnClickListener {

            val navController = findNavController()
            navController.navigate(R.id.action_q5_to_q6)

        }

        return view
    }
}