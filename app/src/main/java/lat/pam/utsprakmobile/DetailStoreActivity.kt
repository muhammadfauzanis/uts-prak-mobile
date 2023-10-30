package lat.pam.utsprakmobile

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button

class DetailStoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_store)

        val seeMenuButton: Button = findViewById(R.id.seeMenuButton)
        seeMenuButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                // Navigasi ke halaman menu
                val intent = Intent(applicationContext, MenuActivity::class.java)
                startActivity(intent)
            }
        })
    }
}
