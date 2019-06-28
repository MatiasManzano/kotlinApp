package ar.com.matias.greenday

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.fragment_login.*

class FragmentLogin : Fragment() {

    private var name: EditText? = null
    private var lastName: EditText? = null
    private var login: Button? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        name = view.findViewById(R.id.nameEditText)
        lastName = view.findViewById(R.id.lastNameEditText)
        login = view.findViewById(R.id.loginButton)

        login?.setOnClickListener {
            var bandFragment = FragmentBand()
            var bundle = Bundle()
            bundle.putString("name", name.toString())
            bundle.putString("lastName", lastName.toString())

            bandFragment.arguments = bundle

            MainActivity().cambiarFragment(bandFragment)

        }

        return view
    }

}