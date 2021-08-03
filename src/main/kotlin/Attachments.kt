open class Attachments (
    var type: String
){


    var attachments = emptyArray<Attachments>()

    fun addPhoto(AttachmentsTypePhoto: Attachments): Attachments {
        attachments += AttachmentsTypePhoto
        return attachments.last()
    }

    fun addVideo(AttachmentsTypeVideo: Attachments): Attachments {
        attachments += AttachmentsTypeVideo
        return attachments.last()
    }

    fun addApp(AttachmentsTypeApp: Attachments): Attachments {
        attachments += AttachmentsTypeApp
        return attachments.last()
    }

    fun addAudio(AttachmentsTypeAudio: Attachments): Attachments {
        attachments += AttachmentsTypeAudio
        return attachments.last()
    }

    fun addPostedPhoto(AttachmentsPostedPhoto: Attachments): Attachments {
        attachments += AttachmentsPostedPhoto
        return attachments.last()
    }
}


//    var photo = AttachmentsTypePhoto()
//    var video = AttachmentsTypeVideo()
//    var app = AttachmentsTypeApp()
//    var audio = AttachmentsTypeAudio ()
//    var attachmentsPostedPhoto = AttachmentsPostedPhoto()
//}




//
//open class Attachments(
//    var typePhoto:  TypePhoto,
//    var typePostedPhoto: PostedPhoto,
//    var typeVideo: TypeVideo,
//    var typeAudio: TypeAudio,
//    var typeApp: App,
//) {
//    var attachments = emptyArray<Attachments>()
//
//    fun add(type: Attachments): Attachments {
//        attachments += type
//        return attachments.last()
//    }
//}
