package com.tonicartos.superslim.internal

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import java.util.*

internal val View.rvLayoutParams: RecyclerView.LayoutParams
    get() = layoutParams as RecyclerView.LayoutParams

inline fun <T : Stack<I>, I, R> T.babushka(block: T.(I) -> R): R {
    val item = pop()
    val r = block(item)
    push(item)
    return r
}
