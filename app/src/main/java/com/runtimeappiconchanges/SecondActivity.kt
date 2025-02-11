package com.runtimeappiconchanges

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.runtimeappiconchanges.Utils.Companion.changeIcon

class SecondActivity : AppCompatActivity() {
    lateinit var btnChangeToMaleICon: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnChangeToMaleICon = findViewById(R.id.btnChangeToMaleICon)

        btnChangeToMaleICon.setOnClickListener {
//            Here we have enabled the MainActivity (Which is our Default Entry Point) so App Icon will be default Icon
            changeIcon(
                enabled =  "com.runtimeappiconchanges.MainActivity",
                disabled = "com.runtimeappiconchanges.SecondActivityAlias"
            )
        }
    }
}