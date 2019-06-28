package ar.com.matias.greenday

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_band.*


class FragmentBand : Fragment() {

    private var name: TextView? = null
    private var lastName: TextView? = null
    private var members: ImageView? = null
    private var discography: ImageView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_band, container, false)

        name = nameTextView
        lastName = lastNameTextView
        members = membersImageView
        discography = discographyImageView

        if (arguments != null) {
            name?.setText(arguments?.getString("name"))
            lastName?.setText(" " + arguments?.getString("lastname"))
        }

        members?.setOnClickListener({

        })

        discography?.setOnClickListener({

        })

        return view
    }

}