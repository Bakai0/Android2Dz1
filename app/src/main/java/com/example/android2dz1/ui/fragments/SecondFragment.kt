package com.example.android2dz1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android2dz1.databinding.FragmentSecondBinding
import com.example.android2dz1.model.HomeModel
import com.example.android2dz1.repozirory.SecondRepozitory
import com.example.android2dz1.ui.adapter.SecondAdapter


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private val textList = ArrayList<HomeModel>()
    private val adapter = SecondAdapter(textList)
    private val repo = SecondRepozitory()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentSecondBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        binding.rvCinema.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        textList.addAll(repo.getListOfCinema())
        binding.rvCinema.adapter = adapter
    }
}
