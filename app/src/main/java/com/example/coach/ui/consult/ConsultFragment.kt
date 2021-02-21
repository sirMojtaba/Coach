package com.example.coach.ui.consult

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.coach.R

class ConsultFragment : Fragment() {

    private lateinit var consultViewModel: ConsultViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        consultViewModel =
                ViewModelProvider(this).get(ConsultViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_consult, container, false)
        consultViewModel.text.observe(viewLifecycleOwner, Observer {
        })
        return root
    }
}