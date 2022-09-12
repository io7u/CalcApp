package jp.techacademy.chiharu.akiba.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent = Intent(this,SecondActivity::class.java)
        try {
            intent.putExtra("A", editText1.text.toString().toDouble())
            intent.putExtra("B", editText2.text.toString().toDouble())
            if (v.id == R.id.button1) {
                intent.putExtra("sisokuenzan", "+")
            } else if (v.id == R.id.button2) {
                intent.putExtra("sisokuenzan", "-")
            } else if (v.id == R.id.button3) {
                intent.putExtra("sisokuenzan", "*")
            } else if (v.id == R.id.button4) {
                intent.putExtra("sisokuenzan", "/")
            }
            startActivity(intent)
        } catch (e:Exception) {
            chuui.text = "何か数値を入力してください"
        }
    }
}