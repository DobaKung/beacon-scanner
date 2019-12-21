package com.zartre.app.beacondemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val EXTRA_BEACON = "beacon_uuid"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendUuid(view: View) {
        val inpUuid = findViewById<EditText>(R.id.inp_uuid)
        val uuidStr = inpUuid.text.toString()
        val intent = Intent(this, ScannerActivity::class.java).apply {
            putExtra(EXTRA_BEACON, uuidStr)
        }
        startActivity(intent)
    }

}
