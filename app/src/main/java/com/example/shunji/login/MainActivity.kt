package com.example.shunji.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fag : String = "1122"
        val Pass : String = "0308"

        button.setOnClickListener {

            if(editText.text.toString() == fag && editText4.text.toString() == Pass) {
                    val intent = Intent(this, Welcom::class.java)
                    intent.putExtra(EXTRA_TEXTDATA, editText.text.toString())
                    startActivity(intent)
                }else {
                val intent = Intent(this, NoUser::class.java)
                startActivity(intent)
                }
    }
    }
    companion object {
            const val EXTRA_TEXTDATA = "com.usaco_pg.intentsample.TEXTDATA"
    }
}


