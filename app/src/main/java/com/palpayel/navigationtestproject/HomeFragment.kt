package com.palpayel.navigationtestproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.palpayel.navigationtestproject.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
private lateinit var binding:FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)

        binding.signUp.setOnClickListener{
            it.findNavController().navigate(R.id.action_homeFragment_to_nameFragment)
        }

        binding.terms.setOnClickListener{
            it.findNavController().navigate(R.id.action_homeFragment_to_termFragment)
        }



        return binding.root
    }


}