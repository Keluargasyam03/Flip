package com.example.flip.transfer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flip.databinding.FragmentTransferBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class TransferBottomSheetFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentTransferBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTransferBinding.inflate(inflater, container, false)
        return binding.root
    }

}