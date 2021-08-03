 class  AttachmentsTypePhoto(
    var id: Int,
    var albumId: Int,
    var ownerId: Int,
    var userId: Int,
    var text: String,
    var date: Int,
    var height: Int,
    var weight: Int,
    var sizes: PhotoSizes,
    ):Attachments("photo")



