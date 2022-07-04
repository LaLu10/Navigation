package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.navigation.databinding.FragmentInitBinding


class InitFragment : Fragment() {
    private var _binding: FragmentInitBinding? = null
    private val binding get() = _binding!!
    private var cont=0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInitBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnFrag1.setOnClickListener{
            val datos= bundleOf("Contador" to cont.toString())
            view.findNavController().navigate(R.id.action_initFragment_to_firstFragment,datos)}
        binding.btnFrag2.setOnClickListener {

            val action= InitFragmentDirections.actionInitFragmentToSecondFragment()
            view.findNavController().navigate(action) }
        binding.tvContInit.setOnClickListener {
            cont++
            binding.tvContInit.setText(cont.toString())
        }
    }
}