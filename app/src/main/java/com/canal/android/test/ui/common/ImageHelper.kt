package com.canal.android.test.ui.common

object ImageHelper {

    private const val PLACEHOLDER_RESOLUTION = "{resolutionXY}"

    fun setImageResolution(url: String?, width: Int, height: Int): String? {
        return url?.replace(PLACEHOLDER_RESOLUTION, "${width}x${height}")
    }
}