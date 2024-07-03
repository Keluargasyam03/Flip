package com.example.flip.bantuan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flip.R
import com.example.flip.databinding.FragmentBantuanBinding

class BantuanFragment : Fragment() {

    private var _binding: FragmentBantuanBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBantuanBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }
}