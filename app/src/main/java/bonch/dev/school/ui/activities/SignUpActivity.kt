package bonch.dev.school.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import bonch.dev.school.R

class SignUpActivity : AppCompatActivity() {

    private lateinit var completeSignUpButton :Button

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.sign_up_activity)

        completeSignUpButton = findViewById(R.id.complete_sign_up_button)

        completeSignUpButton.setOnClickListener {
            val intent = Intent(this@SignUpActivity, MainAppActivity::class.java)
            startActivity(intent)
        }
    }
}
