package com.pabelpm.punkapibeer.presentation.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pabelpm.punkapibeer.databinding.BeerRowBinding
import com.pabelpm.punkapibeer.presentation.model.BeerViewRow
import com.pabelpm.punkapibeer.presentation.utils.setSafeOnClickListener

class BeersAdapter : ListAdapter<BeerViewRow, RecyclerView.ViewHolder>(BeerCallback()) {

    private var onBeerClickListenerAdapter: OnBeerClickListenerAdapter? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BeerViewHolder(
            parent.context,
            BeerRowBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val Beer = getItem(position)
        (holder as BeerViewHolder).bind(Beer)
        holder.setOnClickListenerRow(object : BeerViewHolder.OnItemClickListenerAdapter {
            override fun onClickRow() {
                onBeerClickListenerAdapter?.onClickBeer(Beer)
            }
        })
    }

    class BeerViewHolder(
        private val context: Context,
        private val binding: BeerRowBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        private var onItemClickListenerAdapter: OnItemClickListenerAdapter? = null


        fun bind(item: BeerViewRow) {
            binding.containerConstraintLayout.setSafeOnClickListener {
                onItemClickListenerAdapter?.onClickRow()
            }
            binding.apply {
                beerRowNameTextView.text = item.name
                beerRowDescriptionTextView.text = item.description
                Glide.with(context).load(item.imageUrl).centerCrop()
                    .into(beerRowImageView)
            }
        }

        fun setOnClickListenerRow(onItemClickListenerAdapter: OnItemClickListenerAdapter) {
            this.onItemClickListenerAdapter = onItemClickListenerAdapter
        }

        interface OnItemClickListenerAdapter {
            fun onClickRow()
        }
    }

    fun setOnClickListenerBeer(onBeerClickListenerAdapter: OnBeerClickListenerAdapter) {
        this.onBeerClickListenerAdapter = onBeerClickListenerAdapter
    }

    interface OnBeerClickListenerAdapter {
        fun onClickBeer(beerRow: BeerViewRow) {

        }
    }

    fun update(items: List<BeerViewRow>) {
        submitList(items)
        notifyDataSetChanged()
    }

}

private class BeerCallback : DiffUtil.ItemCallback<BeerViewRow>() {

    override fun areItemsTheSame(
        oldItem: BeerViewRow,
        newItem: BeerViewRow
    ): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(
        oldItem: BeerViewRow,
        newItem: BeerViewRow
    ): Boolean {
        return oldItem == newItem
    }
}