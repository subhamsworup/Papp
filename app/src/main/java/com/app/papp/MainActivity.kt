package com.app.papp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageButton1 = findViewById<ImageButton>(R.id.imageButton1)
        imageButton1.setOnClickListener {
            val url = "https://mail.google.com/mail/u/1/?view=cm&fs=1&to=subhamsworupmallick@gmail.com&tf=1"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val imageButton2 = findViewById<ImageButton>(R.id.imageButton2)
        imageButton2.setOnClickListener {
            val url ="https://github.com/subhamsworup"

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val imageButton5 = findViewById<ImageButton>(R.id.imageButton5)
        imageButton5.setOnClickListener {
            val url ="https://www.linkedin.com/in/subham-sworup-mallick"

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val imageButton3 = findViewById<ImageButton>(R.id.imageButton3)
        imageButton3.setOnClickListener {
            val url ="https://www.instagram.com/subham_sworup"

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }

}