package programmerzamannow.belajarandroiddasar

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import programmerzamannow.belajarandroiddasar.ui.theme.BelajarAndroidDasarTheme

class MainActivity : ComponentActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var sayHelloButton: Button
    private lateinit var sayHelloTextView: TextView

    private fun initComponents(){
        nameEditText = findViewById(R.id.nameEditText)
        sayHelloButton = findViewById(R.id.sayHelloButton)
        sayHelloTextView = findViewById(R.id.sayHelloTextView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hellow_world)

        initComponents()

        sayHelloTextView.text = resources.getText(R.string.app_name)

//        sayHelloTextView.text = "Hi"

        sayHelloButton.setOnClickListener {

            Log.d("PZN", "This is debug log")
            Log.i("PZN", "This is info log")
            Log.w("PZN", "This is warn log")
            Log.e("PZN", "This is error log")

            val name = nameEditText.text.toString()
            sayHelloTextView.text = resources.getString(R.string.sayHelloTextView, name)

            resources.getStringArray(R.array.names).forEach {
                Log.i("PZN", it)
            }
        }
    }
}

// get component by id
// R.id.nameEditText

//origin code

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    BelajarAndroidDasarTheme {
//        Greeting("Android")
//    }
//}