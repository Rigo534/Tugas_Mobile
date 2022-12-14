package com.d121201042.aplication_task.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.d121201042.aplication_task.databinding.FragmentDetailBinding
import com.d121201042.aplication_task.viewmodel.TaskViewModel

class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding?= null
    private val binding get() = _binding!!
    private lateinit var taskViewModel: TaskViewModel
    private val args by navArgs<DetailFragmentArgs>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentDetailBinding.inflate(inflater,container,false)
        val view = binding.root

        taskViewModel = ViewModelProvider(this)[TaskViewModel::class.java]

        binding.judulTugas.text = args.currentTask.judul
        binding.isiTugas.text = args.currentTask.isi
        binding.kategoriTugas.text = args.currentTask.kategori
        return view
    }
}