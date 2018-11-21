package com.uapa.maikel.diplomado.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.uapa.maikel.diplomado.R
import com.uapa.maikel.diplomado.data.model.User
import kotlinx.android.synthetic.main.user_list_item.view.*

class UserItemAdapter(val postItems: List<User>, val context: Context) :
    RecyclerView.Adapter<UserItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.user_list_item,
                parent,
                false
            )
        )

    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder?.itemView.tv_user_name.text = "Nombre: " + postItems.get(position).name + " (" +
                postItems.get(position).userId +
                ")"
        holder?.itemView.tv_user_username.text = "Usuario:" + postItems.get(position).username
        holder?.itemView.tv_user_phone.text = "Celular:" + postItems.get(position).phone
        holder?.itemView.tv_user_website.text = "Web:" + postItems.get(position).website
        holder?.itemView.tv_user_email.text = "e-Mail:" + postItems.get(position).email
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}