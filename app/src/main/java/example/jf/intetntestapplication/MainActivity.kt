package example.jf.intetntestapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.security.Key
import kotlin.random.Random

const val TAG = "MainActivity"
const val KEY = "random text"

class MainActivity : AppCompatActivity() {

    lateinit var randomTextView: TextView
    lateinit var randomButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomTextView = findViewById(R.id.random_text_view)
        randomButton = findViewById(R.id.randomButton)

        if(savedInstanceState != null){
            randomTextView.text = savedInstanceState.getString(KEY)
        }
        newRandomText()
    }


    private fun newRandomText(){
        randomButton.setOnClickListener{
            randomTextView.text = Random.nextInt(100).toString()
            Toast.makeText(this, "Клик!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onSaveInstanceState(outState: Bundle){
        super.onSaveInstanceState(outState)

        outState.putString(KEY, randomTextView.text.toString())
    }
}