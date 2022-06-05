package com.example.perfil_investidor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Q6 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_q6, container, false)

        val btnQ6 = view.findViewById<Button>(R.id.btn_q6)
        btnQ6.setOnClickListener {

            val navController = findNavController()
            navController.navigate(R.id.action_q6_to_q7)

        }

        return view
    }
}