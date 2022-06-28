package com.palpayel.navigationtestproject

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.palpayel.navigationtestproject.databinding.FragmentNameBinding


class NameFragment : Fragment() {

private lateinit var binding:FragmentNameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_name, container, false)

       binding.submitBtn.setOnClickListener {
           if(binding.editName.text.toString()!=""){

               var bundle:Bundle= bundleOf("input_text" to binding.editName.text.toString())

            it.findNavController().navigate(R.id.action_nameFragment_to_emailFragment,bundle)
           }else{
             Toast.makeText(activity,"User Name cannot be empty",Toast.LENGTH_LONG).show()
           }
       }


        return binding.root
    }


}