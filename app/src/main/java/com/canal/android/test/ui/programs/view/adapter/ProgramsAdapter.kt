package com.canal.android.test.ui.programs.view.adapter

import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.canal.android.test.domain.model.NavigateTo
import com.canal.android.test.ui.programs.model.ProgramUi
import com.canal.android.test.ui.programs.view.ProgramView

class ProgramsAdapter(private val onClickListener: OnClickListener) :
    ListAdapter<ProgramUi, ProgramsAdapter.ViewHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ProgramView(
                parent.context
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val programUi = getItem(position)
        (holder.itemView as ProgramView).setData(
            title = programUi.title,
            subtitle = programUi.subtitle,
            urlImage = programUi.urlImage,
            urlLogoChannel = programUi.urlLogoChannel
        )
        holder.itemView.setOnClickListener {
            when (val navigate = programUi.navigateTo) {
                is NavigateTo.DetailPage -> onClickListener.onClick(navigate.urlPage)
                is NavigateTo.QuickTime -> {
                    //TODO: add quickTime navigation
                }
            }
        }
    }

    class ViewHolder(view: ProgramView) : RecyclerView.ViewHolder(view)

    class OnClickListener(val clickListener: (url: String) -> Unit) {
        fun onClick(url: String) = clickListener(url)
    }

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<ProgramUi>() {
            override fun areItemsTheSame(
                oldItem: ProgramUi,
                newItem: ProgramUi
            ): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: ProgramUi,
                newItem: ProgramUi
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}