package com.example.perfil_investidor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
    }

    fun finishQuiz (view: View) {
        val name = intent.getStringExtra("name")
        val intent = Intent(this, ResultActivity::class.java).apply {
            putExtra("username", name)
        }
        startActivity(intent)
    }

}