package lat.pam.utsprakmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val menuItem1 = findViewById<LinearLayout>(R.id.menu1)

        menuItem1.setOnClickListener {
            // Navigasi ke halaman detail menu pertama
            val intent = Intent(applicationContext, DetailMenuActivity::class.java)
            // Jika perlu, Anda dapat menyertakan data tambahan ke intent di sini
            startActivity(intent)
        }
    }
}