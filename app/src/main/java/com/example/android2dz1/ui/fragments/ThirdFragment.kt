package com.example.android2dz1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android2dz1.R
import com.example.android2dz1.databinding.FragmentThirdBinding
import com.example.android2dz1.model.HomeModel
import com.example.android2dz1.repozirory.ThirdRepozitory
import com.example.android2dz1.ui.adapter.ThirdAdapter

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding
    private val textList = ArrayList<HomeModel>()
    private val adapter = ThirdAdapter(textList)
    private val repo = ThirdRepozitory()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentThirdBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        binding.rvLanguage.layoutManager =
            LinearLayoutManager(context,RecyclerView.VERTICAL,false)
        textList.addAll(repo.getListOfProgrammingLanguage())
        binding.rvLanguage.adapter = adapter
    }
}