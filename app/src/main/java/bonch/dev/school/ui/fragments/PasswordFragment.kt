package bonch.dev.school.ui.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment

import bonch.dev.school.R

class PasswordFragment : DialogFragment() {

    lateinit var changePasswordButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.password_fragment, null)
        changePasswordButton = view.findViewById(R.id.change_password_button)
        changePasswordButton.setOnClickListener { dismiss() }

        return view
    }


}
