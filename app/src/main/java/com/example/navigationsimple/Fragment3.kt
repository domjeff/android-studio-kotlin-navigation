package com.example.navigationsimple

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationsimple.databinding.Fragment3Binding
import com.example.navigationsimple.databinding.FragmentHomeBinding

class Fragment3 : Fragment(R.layout.fragment_3) {
    private val args: Fragment3Args by navArgs()

    private lateinit var fragment3Binding: Fragment3Binding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragment3Binding = Fragment3Binding.bind(view)

        fragment3Binding.apply {
            tvFromFragment2Top.text = args.topInput
            tvFromFragment2Bottom.text = args.bottomInput
            btnBack.setOnClickListener {
                val action = Fragment3Directions.actionFragment3ToHomeFragment()
                findNavController().navigate(action)
            }
        }


    }
}