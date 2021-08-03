
class FirstFrame (
  var   height: Int = 1,
  var  url: String = "",
  var  width: Int = 34) {


    var firstFrame = emptyArray<FirstFrame>()

    fun firstFrame(firstFrame2: FirstFrame): FirstFrame {
        firstFrame += firstFrame2
        return firstFrame.last()
    }

}
//
//Attachments (
//TypePhoto(2442, 24, 24, 24, "", 35, 88, 88, 54,),
//PostedPhoto(235, 345, 35, 435,), typeVideo = TypeVideo(
//65, 6, "", "", 43, Image(height, url, width, true),
//FirstFrame(654, "76", 76),
//56, 65, 65, 5,  "", ""),
//typeAudio = TypeAudio(33, 3, "", 33, "", 3, 43, 34, 354, true, false,), typeApp = App(44, "", "", "")
//)