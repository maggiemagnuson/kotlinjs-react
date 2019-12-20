package domains

data class Video(val id: Int, val title: String, val speaker: String, val videoUrl: String)

val unwatchedVideos = listOf(
        Video(1, "Building and Breaking Things", "John Doe", "https://youtu.be/PsaFVLr8t4E"),
        Video(2, "The Development Process", "Jane Smith", "https://youtu.be/PsaFVLr8t4E"),
        Video(3, "The Web 7.0", "Matt Miller", "https://youtu.be/PsaFVLr8t4E")
)

val watchVideos = listOf(
        Video(4, "Mouseless Development", "Tom Jerry", "https://youtu.be/PsaFVLr8t4E")
)