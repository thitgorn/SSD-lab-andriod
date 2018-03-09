package com.example.thitiwat.app103

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class InputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)
    }

    fun saveButtonClicked(view: View) {
        val data = Intent()
        data.putExtra("TASK_NAME", "I AM HAPPY")
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
    fun cancelButtonClicked(view: View){
        setResult(Activity.RESULT_CANCELED)
        finish()
    }
}