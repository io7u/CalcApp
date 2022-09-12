package jp.techacademy.chiharu.akiba.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        if (intent.getStringExtra("sisokuenzan") == "+") {
            val a1 = intent.getDoubleExtra("A", 0.0)
            val a2 = intent.getDoubleExtra("B", 0.0)

            textView.text = "${a1 + a2}"
        }
        if (intent.getStringExtra("sisokuenzan") == "-") {
            val a1 = intent.getDoubleExtra("A", 0.0)
            val a2 = intent.getDoubleExtra("B", 0.0)

            textView.text = "${a1 - a2}"
        }
        if (intent.getStringExtra("sisokuenzan") == "*"){
            val a1 = intent.getDoubleExtra("A", 0.0)
            val a2 = intent.getDoubleExtra("B", 0.0)

            textView.text = "${a1 * a2}"
        }
        if (intent.getStringExtra("sisokuenzan") == "/"){
            val a1 = intent.getDoubleExtra("A", 0.0)
            val a2 = intent.getDoubleExtra("B", 0.0)

            textView.text = "${a1 / a2}"
        }
    }
}