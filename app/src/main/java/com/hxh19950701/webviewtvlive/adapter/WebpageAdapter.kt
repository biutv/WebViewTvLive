package com.hxh19950701.webviewtvlive.adapter

import android.graphics.Point
import android.view.KeyEvent
import android.view.MotionEvent

abstract class WebpageAdapter {

    companion object {
        internal const val TAG = "WebpageAdapter"
    }

    abstract fun userAgent(): String?

    abstract fun isAdaptedUrl(url: String): Boolean

    abstract fun javascript(): String

    abstract suspend fun enterFullscreen(player: IPlayer)

    interface IPlayer {

        fun isInFullscreen(): Boolean

        fun getScreenSize(): Point

        fun sendKeyEvent(event: KeyEvent)

        fun sendTouchEvent(event: MotionEvent)
    }

}
