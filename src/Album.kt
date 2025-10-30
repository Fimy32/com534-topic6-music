class Album(val songs: List<Song>): Music {

    fun filter(filterartist: String): List<Song> {
        return songs.filter { it.artist == filterartist }
    }

    override fun getPlayingTime(): Double {
        var totalPlayTime = 0.0
        songs.forEach {totalPlayTime = totalPlayTime + it.playingTime}
        return totalPlayTime
    }

    override fun getAllSongs(): List<Song> {
        return songs
    }


}