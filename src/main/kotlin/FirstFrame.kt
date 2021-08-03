
class FirstFrame
    : Attachments {
    constructor(height: Int, url: String, width: Int) : super(
        TypePhoto(2442, 24, 24, 24, "", 35, 88, 88, 54,),
        PostedPhoto(235, 345, 35, 435,), TypeVideo(
            65, 6, "", "", 43, Image(height, url, width, true),
            FirstFrame(654, "76", 76), 56, 65, 65, 5, "", ""
        ),
        TypeAudio(33, 3, "", 33, "", 3, 43, 34, 354, true, false,), App(44, "", "", "")
    )
}

var firstFrame = emptyArray<FirstFrame> ()

    fun firstFrame(firstFrame2: FirstFrame): FirstFrame {
        firstFrame += firstFrame2
        return firstFrame.last()
    }
