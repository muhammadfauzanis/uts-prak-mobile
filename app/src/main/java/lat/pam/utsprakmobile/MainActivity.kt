package lat.pam.utsprakmobile

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submit = findViewById<Button>(R.id.submitButton)
        submit?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                // Navigasi ke halaman detail store
                val intent = Intent(applicationContext, DetailStoreActivity::class.java)

                startActivity(intent);
            }
        })
    }
}
