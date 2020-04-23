package com.canal.android.test.ui.programs.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.cardview.widget.CardView
import com.bumptech.glide.Glide
import com.canal.android.test.R
import kotlinx.android.synthetic.main.layout_program.view.*

class ProgramView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {

    init {
        View.inflate(context, R.layout.layout_program, this)
        layoutParams = LayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParams.WRAP_CONTENT
        )
    }

    fun setData(
        title: String,
        subtitle: String,
        urlImage: String,
        urlLogoChannel: String?
    ) {
        program_title.text = title

        program_subtitle.text = subtitle

        Glide.with(this)
            .load(urlImage)
            .centerCrop()
            .into(program_image)

        urlLogoChannel?.let { url ->
            Glide.with(this)
                .load(url)
                .fitCenter()
                .into(program_channel_image)
        }
    }
}