package bonch.dev.school.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import bonch.dev.school.R

class SignUpActivity : AppCompatActivity() {

    private lateinit var completeSignUpButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        completeSignUpButton = findViewById(R.id.complete_sign_up_button)
        completeSignUpButton.setOnClickListener {
            startActivity(Intent(this, MainActivity().javaClass))
            finish()

        }
    }
}
