package com.canal.android.test.ui.programs.view.adapter

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.canal.android.test.R

class ProgramsDecorator(context: Context) : RecyclerView.ItemDecoration() {

    private val marginVertical = context.resources.getDimensionPixelSize(R.dimen.half_unit)

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.top = marginVertical
        outRect.bottom = marginVertical
    }
}