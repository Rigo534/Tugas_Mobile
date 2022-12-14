package com.d121201042.aplication_task.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.d121201042.aplication_task.R
import com.d121201042.aplication_task.databinding.FragmentHistoryBinding


class HistoryFragment : Fragment() {
    private var _binding: FragmentHistoryBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container:ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentHistoryBinding.inflate(inflater,container,false)
        val view = binding.root

        return view
    }
}