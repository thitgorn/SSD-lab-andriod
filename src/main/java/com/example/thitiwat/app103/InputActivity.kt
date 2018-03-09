package com.example.thitiwat.app103

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_input.*

class InputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)
    }

    fun saveButtonClicked(view: View) {
        val data = Intent()
        val taskName = inputTaskEditText.text.toString();
        if(taskName != "") {
            data.putExtra("TASK_NAME", taskName)
            setResult(Activity.RESULT_OK, data)
        }
        else {
            setResult(Activity.RESULT_CANCELED)
        }
        finish()
    }
    fun cancelButtonClicked(view: View){
        setResult(Activity.RESULT_CANCELED)
        finish()
    }
}