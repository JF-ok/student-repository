package example.jf.intetntestapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var helloTextView: TextView
    lateinit var newTextButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloTextView = findViewById(R.id.hello_world_text_view)
        newTextButton = findViewById(R.id.new_text_button)
        newTextButtonClick()
    }

    private fun newTextButtonClick(){
        newTextButton.setOnClickListener{
            helloTextView.text = Random.nextInt().toString()
            Toast.makeText(this, Random.nextInt().toString(), Toast.LENGTH_SHORT).show()
        }
    }
}