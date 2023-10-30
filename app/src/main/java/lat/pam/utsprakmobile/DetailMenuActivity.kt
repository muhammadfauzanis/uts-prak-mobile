package lat.pam.utsprakmobile

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button

class DetailMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_menu)

        val orderButton: Button = findViewById(R.id.orderButton)
        val backButton: Button = findViewById(R.id.backButton)

        orderButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                // Navigasi ke halaman order detail
                val intent = Intent(applicationContext, OrderDetail::class.java)
                // Jika perlu, tambahkan data tambahan ke intent
                // intent.putExtra("menuName", menuName)
                startActivity(intent)
            }
        })

        backButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                finish()
            }
        })
    }
}
