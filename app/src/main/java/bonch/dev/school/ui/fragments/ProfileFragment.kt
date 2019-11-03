package bonch.dev.school.ui.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import bonch.dev.school.R

class ProfileFragment : Fragment() {

    lateinit var changePasswordButton: Button
    lateinit var passwordFragment: PasswordFragment



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.profile_fragment, container, false)
        changePasswordButton = view.findViewById(R.id.change_password_button)
        passwordFragment = PasswordFragment()
        changePasswordButton.setOnClickListener {
            fragmentManager?.let { it1 ->
                passwordFragment.show(
                    it1,
                    "passwordFragment"
                )
            }
        }

        return view
    }

}
