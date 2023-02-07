package com.example.android2dz1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android2dz1.`interface`.OnClickItemListener
import com.example.android2dz1.databinding.FragmentFirstBinding
import com.example.android2dz1.model.HomeModel
import com.example.android2dz1.repozirory.FirstRepozitory
import com.example.android2dz1.ui.adapter.FirstAdapter


class FirstFragment : Fragment(),OnClickItemListener {

    private lateinit var binding: FragmentFirstBinding
    private val textList = ArrayList<HomeModel>()
    private val adapter = FirstAdapter(textList,this)
    private val repozitory = FirstRepozitory()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        binding.rvCats.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        textList.addAll(repozitory.getListOfCat())
        binding.rvCats.adapter = adapter

    }
    override fun onClickItemListener(model: HomeModel) {
        val text = model.name
        val image = model.image
        findNavController().navigate(
            FirstFragmentDirections.actionFirstFragmentToDetailFragment().setText(text)
                .setPhoto(image))
    }
}

