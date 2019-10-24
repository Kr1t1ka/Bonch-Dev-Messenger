package bonch.dev.school.fragments

import androidx.fragment.app.DialogFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import bonch.dev.school.R

class PasswordFragment: DialogFragment() {

    private lateinit var buttonOK: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.passwors_fragment, container, false)
        buttonOK = view.findViewById(R.id.btnMaybe)
        return view
    }


}
