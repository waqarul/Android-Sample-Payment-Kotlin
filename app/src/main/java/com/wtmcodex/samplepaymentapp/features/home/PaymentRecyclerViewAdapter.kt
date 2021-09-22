package com.wtmcodex.samplepaymentapp.features.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.wtmcodex.samplepaymentapp.R
import com.wtmcodex.samplepaymentapp.databinding.PaymentCardViewItemBinding
import com.wtmcodex.samplepaymentapp.features.home.PaymentRecyclerViewAdapter.PaymentViewHolder
import java.util.*

class PaymentRecyclerViewAdapter internal constructor(private val onItemClickedListener: OnItemClickedListener?) :
    RecyclerView.Adapter<PaymentViewHolder>() {
    private var viewItems: List<PaymentViewItem?>? = ArrayList()
    fun setViewItems(viewItems: List<PaymentViewItem?>?) {
        this.viewItems = viewItems
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return viewItems!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentViewHolder {
        return PaymentViewHolder(
            PaymentCardViewItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PaymentViewHolder, position: Int) {
        val viewItem = viewItems!![position]
        holder.bind(viewItem!!)
    }

    inner class PaymentViewHolder internal constructor(private val itemBinding: PaymentCardViewItemBinding) :
        RecyclerView.ViewHolder(
            itemBinding.root
        ) {
        fun bind(viewItem: PaymentViewItem) {
            itemBinding.container.setOnClickListener { onItemClickedListener?.onItemClicked(viewItem) }
            itemBinding.tvTitle.text = viewItem.title
            Glide.with(itemBinding.ivImage.context)
                .load(viewItem.logoUrl)
                .placeholder(R.drawable.placeholder)
                .into(itemBinding.ivImage)
        }
    }

    interface OnItemClickedListener {
        fun onItemClicked(item: PaymentViewItem)
    }
}