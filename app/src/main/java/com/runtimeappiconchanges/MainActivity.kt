package com.runtimeappiconchanges

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.runtimeappiconchanges.Utils.Companion.changeIcon

class MainActivity : AppCompatActivity() {
    lateinit var btnChangeToFemaleICon:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)

        btnChangeToFemaleICon = findViewById(R.id.btnChangeToFemaleICon)

        btnChangeToFemaleICon.setOnClickListener {

//            Here we have enabled the SecondActivityAlias (Which is our custom Entry Point) so App Icon will be Changed
            changeIcon(
                enabled = "com.runtimeappiconchanges.SecondActivityAlias",
                disabled = "com.runtimeappiconchanges.MainActivity"
            )
        }
    }


}