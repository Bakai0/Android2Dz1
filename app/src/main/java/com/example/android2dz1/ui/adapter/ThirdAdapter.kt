package com.example.android2dz1.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android2dz1.databinding.ItemNamesBinding
import com.example.android2dz1.model.HomeModel

class ThirdAdapter(
    private val listText: ArrayList<HomeModel>
) : RecyclerView.Adapter<ThirdAdapter.ThirdViewHolder>() {

     inner class ThirdViewHolder(private var binding: ItemNamesBinding) :
         RecyclerView.ViewHolder(binding.root) {
         fun onBind(homeModel: HomeModel) {
             binding.txtName.text = homeModel.name
             Glide.with(binding.imageCat.context).load(homeModel.image).into(binding.imageCat)
         }
     }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThirdViewHolder {
        return  ThirdViewHolder(
            ItemNamesBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: ThirdViewHolder, position: Int) {
       holder.onBind(listText[position])
    }

    override fun getItemCount(): Int {
        return listText.size
    }
}