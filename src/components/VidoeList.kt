package components

import domains.Video
import kotlinx.html.js.onClickFunction
import kotlinx.html.video
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement
import react.dom.p
import react.dom.video
import react.setState
import kotlin.browser.window

interface VideoListProps: RProps {
    var videos: List<Video>
}

interface VidoeListState: RState {
    var selectedVideo: Video?
}

class VideoList(props: VideoListProps) : RComponent<VideoListProps, VidoeListState>(props) {
    override fun RBuilder.render() {
        props.videos.forEach { video ->
            p {
                key = video.id.toString()
                attrs {
                    onClickFunction = {
                        setState {
                            select
                        }
                    }
                }
                + "${video.speaker}: ${video.title}"
            }
        }
    }

}

fun RBuilder.videoList(handler: VideoListProps.() -> Unit): ReactElement {
    return child(VideoList::class) {
        this.attrs(handler)
    }
}