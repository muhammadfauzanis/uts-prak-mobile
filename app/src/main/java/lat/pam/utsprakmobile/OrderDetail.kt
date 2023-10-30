package lat.pam.utsprakmobile

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class OrderDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_detail)

        val buttonDone = findViewById<Button>(R.id.buttonDone)
        buttonDone.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {

                // Menampilkan pesan pop-up
                val alertDialogBuilder = AlertDialog.Builder(this@OrderDetail)
                alertDialogBuilder.setMessage("Terima kasih Pa Asep sudah memesan \n" +
                        "ditoko kami, pesanan Pepperoni Pizza \n" +
                        "anda dikirim menggunakan Fast Delivery  ")
                alertDialogBuilder.setPositiveButton("OK", null)
                alertDialogBuilder.create().show()
            }
        })
    }
}
