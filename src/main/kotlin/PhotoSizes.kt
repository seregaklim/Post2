class PhotoSizes(
    var type: String,
    var url: String,
 height:  Int,
    weight:  Int)
    :Attachments(TypePhoto(2442,24,24,24,"",35,height,weight,54,),
    PostedPhoto(235,345,35,435,)
    ,TypeVideo(65,6,"","",43,Image(34,"",34,true),
        FirstFrame(43,"",435),56,65,65,5,"",""),
    TypeAudio(33,3,"",33,"",3,43,34,354,true,false,)
    ,App(44,"","",""))

{
        var photoSizes = emptyArray<PhotoSizes>()

        fun photoSizes(photo: PhotoSizes): PhotoSizes {
            photoSizes += photo
            return photoSizes.last()
        }
}

