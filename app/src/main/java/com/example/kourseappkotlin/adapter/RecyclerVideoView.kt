package com.example.kourseappkotlin.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import com.example.kourseappkotlin.R
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class RecyclerVideoView(
    private val activityVideo: Activity,
    private val lifeCycle: Lifecycle,
    private val videoId: List<String>
) :
    RecyclerView.Adapter<RecyclerVideoView.VideoViewHolder>() {
    class VideoViewHolder(v: View, lifeCycle: Lifecycle) : RecyclerView.ViewHolder(v) {
        private var youTubePlayer: YouTubePlayer? = null
        private var currentVideoId: String? = null

        init {
            val youTubePlayerView = v.findViewById<YouTubePlayerView>(R.id.youtube_player_view)
            lifeCycle.addObserver(youTubePlayerView)
            val overlayView = v.findViewById<View>(R.id.overlay_view)
            overlayView.setOnClickListener { youTubePlayer?.play() }
            youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
                override fun onReady(youTubePlayer: YouTubePlayer) {
                    this@VideoViewHolder.youTubePlayer = youTubePlayer
                    currentVideoId?.let { youTubePlayer.cueVideo(it, 0f) }
                }

                override fun onStateChange(
                    youTubePlayer: YouTubePlayer,
                    state: PlayerConstants.PlayerState
                ) {
                    when (state) {
                        PlayerConstants.PlayerState.VIDEO_CUED -> overlayView.visibility =
                            View.VISIBLE

                        else -> overlayView.visibility = View.GONE
                    }
                }
            })
        }

        fun cueVideo(videoId: String) {
            currentVideoId = videoId
            // cue the video if the youtube player is available
            youTubePlayer?.cueVideo(videoId, 0f)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val itemView = activityVideo.layoutInflater.inflate(R.layout.video_list_item, parent, false)
        return VideoViewHolder(itemView, lifeCycle)
    }

    override fun getItemCount() = videoId.size

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        holder.cueVideo(videoId[position])
    }
}