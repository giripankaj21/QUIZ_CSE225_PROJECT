package com.example.quizcse225.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.quizcse225.Domain.QuestionModel
import com.example.quizcse225.R
import com.example.quizcse225.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        binding.apply {
            singlebtn.setOnClickListener{
                val intent=Intent(this@MainActivity,QuestionActivity::class.java)
                intent.putParcelableArrayListExtra("List",ArrayList(questionList()))
                startActivity(intent)
            }
            bottomMenu.setItemSelected(R.id.bottomMenu)
            bottomMenu.setOnItemSelectedListener{
                if (it== R.id.Board){
                    startActivity(Intent(this@MainActivity,LeaderActivity::class.java))
                }
            }
        }

    }
    private fun questionList():MutableList<QuestionModel>{
        val question:MutableList<QuestionModel> = mutableListOf()
        question.add(
            QuestionModel(
                1,
                "What programming language is primarily used in Android Studio for app development?",
                "Java",
                "Python",
                "C++",
                "Swift",
                "a",
                5,
                "q_1",
                null
            )
        )

        question.add(
            QuestionModel(
                2,
                "Which file is used to define the user interface of an Android app in Android Studio?",
                ".xml",
                ".java",
                ".gradle",
                ".apk",
                "b",
                5,
                "q_2",
                null
            )
        )

        question.add(
            QuestionModel(
                3,
                "What is the purpose of the AndroidManifest.xml file in an Android project?",
                "To declare the components of the app such as activities, services, and permissions",
                "To define the layout of the user interface",
                "To manage dependencies",
                "To define the logic of the app",
                "c",
                5,
                "q_3",
                null
            )
        )

        question.add(
            QuestionModel(
                4,
                "Which of the following is NOT a valid component in an Android app?",
                "Module",
                "Activity",
                "Fragment",
                "Service",
                "c",
                5,
                "q_4",
                null
            )
        )

        question.add(
            QuestionModel(
                5,
                "Which tool is used for debugging Android apps in Android Studio?",
                "Logcat",
                "Android Debug Bridge (ADB)",
                "Java Debugger (JDB)",
                "Android Monitor",
                "c",
                5,
                "q_5",
                null
            )
        )
        return question
    }
}