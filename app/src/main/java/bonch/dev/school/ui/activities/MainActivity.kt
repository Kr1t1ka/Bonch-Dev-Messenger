package bonch.dev.school.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import bonch.dev.school.R
import bonch.dev.school.ui.fragments.ChatFragmenst
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    val fm = supportFragmentManager
    lateinit var fragmentContainer: FrameLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val host: NavHostFragment=fm.findFragmentById(R.id.navFragment) as NavHostFragment? ?:return
        val navController = host.navController

        val sideBar = findViewById<NavigationView>(R.id.nav_view)
        sideBar?.setupWithNavController(navController)


    }
}
