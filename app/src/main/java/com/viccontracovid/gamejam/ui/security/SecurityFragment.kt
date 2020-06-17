package com.viccontracovid.gamejam.ui.security

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.viccontracovid.gamejam.R

class SecurityFragment : Fragment() {

    private lateinit var securityViewModel: SecurityViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        securityViewModel =
                ViewModelProviders.of(this).get(SecurityViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_security, container, false)

        securityViewModel.text.observe(this, Observer {

        })

        return root
    }
}