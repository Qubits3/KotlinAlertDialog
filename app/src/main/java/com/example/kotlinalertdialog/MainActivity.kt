package com.example.kotlinalertdialog

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_LONG).show()
    }

    fun save(view: View) {

        val alert = AlertDialog.Builder(this)
        alert.setTitle("Save")
        alert.setMessage("Are you sure?")
        alert.setNegativeButton("No", null)
        alert.setPositiveButton("Yes") { dialog, which ->
            Toast.makeText(this@MainActivity, "Saved", Toast.LENGTH_LONG).show()
        }
        alert.show()

    }
}
