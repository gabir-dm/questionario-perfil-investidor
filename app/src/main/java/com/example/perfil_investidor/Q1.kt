package com.example.perfil_investidor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Q1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_q1, container, false)

        val btnQ1 = view.findViewById<Button>(R.id.btn_q1)
        btnQ1.setOnClickListener {

            val navController = findNavController()
            navController.navigate(R.id.action_q1_to_q2)

        }

        return view
    }
}