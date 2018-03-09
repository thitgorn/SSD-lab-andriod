package com.example.thitiwat.app103

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val INPUT_REQUEST_CODE = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onActivityResult(requestCode : Int , resultCode: Int , data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == INPUT_REQUEST_CODE) {
            if (resultCode != Activity.RESULT_CANCELED) {
                if(data != null) {
                    mainTextView.text = data.getStringExtra("TASK_NAME")
                }

            } else {
                mainTextView.text = "CANCELED !!"
            }
        }
    }

    fun newButtonClick(view: View) {
        val intent = Intent(this, InputActivity::class.java)
        startActivityForResult(intent, INPUT_REQUEST_CODE)
    }
}
