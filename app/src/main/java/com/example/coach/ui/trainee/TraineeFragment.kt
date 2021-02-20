package com.example.coach.ui.trainee

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.coach.R

class TraineeFragment : Fragment() {

    private lateinit var traineeViewModel: TraineeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        traineeViewModel =
                ViewModelProvider(this).get(TraineeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_trainee, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        traineeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}