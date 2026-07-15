package com.kiptanuikevin.bingwapro

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = DatabaseHelper(this)
        val stats = db.getStats()

        findViewById<TextView>(R.id.smsCount).text = stats.first.toString()
        findViewById<TextView>(R.id.tokenCount).text = stats.second.toString()
        findViewById<TextView>(R.id.subscriberCount).text = stats.third.toString()
    }
}
