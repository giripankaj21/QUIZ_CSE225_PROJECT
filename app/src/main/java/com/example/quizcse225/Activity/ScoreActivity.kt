package com.example.quizcse225.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.quizcse225.R
import com.example.quizcse225.databinding.ActivityQuestionBinding
import com.example.quizcse225.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {
    var score:Int=0
    lateinit var binding: ActivityScoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        score=intent.getIntExtra("Score",0)



        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        binding.apply {
            scoreTxt.text=score.toString()
            backBtn.setOnClickListener{
                startActivity(
                    Intent(
                        this@ScoreActivity,
                        MainActivity::class.java
                    )
                )
                finish()
            }
        }
    }
}