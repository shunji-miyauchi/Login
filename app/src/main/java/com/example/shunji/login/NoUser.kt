package com.example.shunji.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_no_user.*
import android.content.Intent
import kotlinx.android.synthetic.main.activity_no_user.*

class NoUser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_user)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "NoUser"


        textView.text = "そのようなユーザーは登録されていません．"
    }

override fun onOptionsItemSelected(item:MenuItem?): Boolean {
    when (item?.itemId){
        android.R.id.home -> finish()
        else -> return super.onOptionsItemSelected(item)
    }
    return true
}

}
