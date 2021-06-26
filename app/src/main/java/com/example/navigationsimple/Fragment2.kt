package com.example.navigationsimple

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationsimple.databinding.Fragment2Binding

class Fragment2 : Fragment(R.layout.fragment_2) {
    private lateinit var fragment2Binding: Fragment2Binding
    private val args: Fragment2Args by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val topInputFromDeepLink = args.topInput


        fragment2Binding = Fragment2Binding.bind(view)
        fragment2Binding.apply {
            editTextTop.setText(topInputFromDeepLink)
            btnGoToFragment3.setOnClickListener {
                val inputTop = editTextTop.text.toString()
                val inputBottom = editTextBottom.text.toString()
                val action = Fragment2Directions.actionFragment2ToFragment3(
                    topInput = inputTop,
                    bottomInput = inputBottom,
                )
                findNavController().navigate(action)
            }
        }


    }
}