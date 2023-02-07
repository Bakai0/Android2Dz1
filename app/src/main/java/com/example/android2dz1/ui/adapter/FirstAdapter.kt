package com.example.android2dz1.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android2dz1.`interface`.OnClickItemListener
import com.example.android2dz1.databinding.ItemNamesBinding
import com.example.android2dz1.model.HomeModel
import com.example.android2dz1.ui.fragments.FirstFragment

class FirstAdapter(

    private val listText: ArrayList<HomeModel>,
    private val onClickItem: OnClickItemListener
) :
    RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {

    inner class FirstViewHolder(private var binding: ItemNamesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(homeModel: HomeModel) {
            binding.txtName.text = homeModel.name
            Glide.with(binding.imageCat.context).load(homeModel.image).into(binding.imageCat)
            itemView.setOnClickListener {
                onClickItem.onClickItemListener(homeModel)
                binding.txtName.text = homeModel.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        return FirstViewHolder(
            ItemNamesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.onBind(listText[position])
    }

    override fun getItemCount(): Int {
        return listText.size
    }
}
