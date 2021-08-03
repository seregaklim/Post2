open class Attachments(
    var typePhoto:  TypePhoto,
    var typePostedPhoto: PostedPhoto,
    var typeVideo: TypeVideo,
    var typeAudio: TypeAudio,
    var typeApp: App,
) {
    var attachments = emptyArray<Attachments>()

    fun add(type: Attachments): Attachments {
        attachments += type
        return attachments.last()
    }
}






