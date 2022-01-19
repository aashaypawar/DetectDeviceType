package org.geeksforgeeks.detectdevicetype

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyManager
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring and Initializing the TextView from the layout file
        val mTextView = findViewById<TextView>(R.id.text_view_1)

        // Instance of TelephonyManager
        val mManager = applicationContext.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager

        // Checking type of device
        if (Objects.requireNonNull(mManager).phoneType == TelephonyManager.PHONE_TYPE_NONE) {
            // Tablet
            mTextView.text = "This is a Tablet"
        } else {
            // Mobile Phone
            mTextView.text = "This is a Mobile Phone"
        }
    }
}