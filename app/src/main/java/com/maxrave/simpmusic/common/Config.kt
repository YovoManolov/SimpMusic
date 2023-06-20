package com.maxrave.simpmusic.common

object Config {
    var BASE_URL = "https://ytmusicapi.herokuapp.com/"

    var NETWORK_ERROR = "NETWORK_ERROR"

    enum class SyncState {
        LINE_SYNCED,
        UNSYNCED,
        NOT_FOUND
    }
    const val SONG_CLICK = "SONG_CLICK"
    const val VIDEO_CLICK = "VIDEO_CLICK"
    const val PLAYLIST_CLICK = "PLAYLIST_CLICK"
    const val ALBUM_CLICK = "ALBUM_CLICK"
    const val RADIO_CLICK = "RADIO_CLICK"
    const val MINIPLAYER_CLICK = "MINIPLAYER_CLICK"
}