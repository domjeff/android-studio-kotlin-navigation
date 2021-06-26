package com.example.navigationsimple

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationsimple.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var fragmentHomeBinding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentHomeBinding = FragmentHomeBinding.bind(view)

        fragmentHomeBinding.apply {
            btnLogin.setOnClickListener {
                val action = HomeFragmentDirections.actionHomeFragmentToFragment2()
                findNavController().navigate(action)
            }
        }
    }
}