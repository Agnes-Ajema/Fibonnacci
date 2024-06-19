package com.example.fibonnacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class SequenceNumbers (var nums:List<Int>):RecyclerView.Adapter<AllFibonnacciHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllFibonnacciHolder {
     val itemView = LayoutInflater.from(parent.context).inflate(R.layout.sequence,parent,false)

        return AllFibonnacciHolder(itemView)
    }

    override fun onBindViewHolder(holder: AllFibonnacciHolder, position: Int) {
        holder.rvNumbers.text = nums[position].toString()

    }

    override fun getItemCount(): Int {
        return nums.size

    }
}
class AllFibonnacciHolder(itemView: View):ViewHolder(itemView){
    var rvNumbers =itemView.findViewById<TextView>(R.id.rvNumbers)

}