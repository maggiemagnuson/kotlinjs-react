package app

import components.videoList
import domains.unwatchedVideos
import domains.watchVideos
import kotlinx.css.Position
import kotlinx.css.fontFamily
import kotlinx.css.position
import kotlinx.css.px
import kotlinx.css.right
import kotlinx.css.top
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.h3
import react.dom.img
import styled.css
import styled.styledDiv
import styled.styledH1

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        styledH1 {
            css {
                fontFamily = "sans-serif"
            }
            + "KotlinConf Explorer"
        }

        div {
            h3 {
                + "Videos to Watch"
            }
            videoList {
                videos = unwatchedVideos
            }
            h3 {
                + "Videos to Watched"
            }
            videoList {
                videos = watchVideos
            }
        }

        styledDiv {
            css {
                position = Position.absolute
                top = 10.px
                right = 10.px
            }
            h3 {
                + "John Doe: Building and Breaking Things"
            }
            img {
                attrs {
                    src =  "https://via.placeholder.com/640x360.png?text=Video+Player+Placeholder"
                }
            }
        }
    }

}
