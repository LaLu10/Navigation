package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigation.databinding.FragmentInitBinding
import com.example.navigation.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!
    private val args: SecondFragmentArgs by navArgs()
    val contador = args.cont
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnAtras2.setOnClickListener {
            view.findNavController().navigate(R.id.action_secondFragment_to_initFragment, null)}
        binding.btnNext.setOnClickListener {
            view.findNavController().navigate(R.id.action_secondFragment_to_thirdFragment, null)
            }
        binding.tvContRecogida2.text= contador.toString()
    }
}

