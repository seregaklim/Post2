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

