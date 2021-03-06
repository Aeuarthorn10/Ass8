package com.id6130205356.ass8

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.emp_item_layout.view.*

class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val tvName: TextView = view.tv_name
    val tvGender: TextView = view.tv_gender
    val tvEmail: TextView = view.tv_email
    val tvSalary: TextView = view.tv_salary
}