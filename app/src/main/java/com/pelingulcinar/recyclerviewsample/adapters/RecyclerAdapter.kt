package com.pelingulcinar.recyclerviewsample.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pelingulcinar.recyclerviewsample.R
import com.pelingulcinar.recyclerviewsample.data.UserDTO

class RecyclerAdapter (val UserList : ArrayList<UserDTO>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent?.context).inflate(R.layout.items_recyclerview, parent, false)

        return ViewHolder(v)

    }

    override fun getItemCount(): Int {

        return UserList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val userName = holder.itemView.findViewById<TextView>(R.id.txt_UserName)
        val imgLink = holder.itemView.findViewById<ImageView>(R.id.img_user)
        val description = holder.itemView.findViewById<TextView>(R.id.txt_Description)
        val post = holder.itemView.findViewById<ImageView>(R.id.img_post)

        userName.text = UserList[position].userName
        description.text = UserList[position].description
        Glide.with(holder.itemView)
                .load(UserList[position].imgLink)
                .into(imgLink)

        Glide.with(holder.itemView)
                .load(UserList[position].imgPost)
                .into(post)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val userName = view.findViewById<TextView>(R.id.txt_UserName)
        val imgLink = view.findViewById<ImageView>(R.id.img_user)
        val description = view.findViewById<TextView>(R.id.txt_Description)
        val imgPost = view.findViewById<ImageView>(R.id.img_post)

    }



}