class RecordPlayer() {
    fun play(music : Music) {
        println("Playing Time: " + music.getPlayingTime().toString() + "\nSongs: " + music.getAllSongs().toString())
    }
}