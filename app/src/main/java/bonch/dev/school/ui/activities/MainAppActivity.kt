package bonch.dev.school.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bonch.dev.school.R
import bonch.dev.school.fragments.PasswordFragment
import bonch.dev.school.ui.fragments.ChatFragmenst
import bonch.dev.school.ui.fragments.ProfileFragment

class MainAppActivity : AppCompatActivity() {

    val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app)
        attachFragment()
    }

    fun attachFragment() {
        fragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, ChatFragmenst())
            .commit()
    }

    fun setDialogFragment(){
        fragmentManager
            .beginTransaction()
            .replace(R.id.dialog_fragment, PasswordFragment())
            .addToBackStack("second_fragment")
            .commit()
    }

    fun replaceFragment(){
        fragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, ProfileFragment())
            .addToBackStack("second_fragment")
            .commit()
    }
}


