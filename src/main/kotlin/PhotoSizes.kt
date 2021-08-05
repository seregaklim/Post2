class PhotoSizes(
    var type: String,
    var url: String,
    height: Int,
    weight: Int
) {
    var photoSizes = emptyArray<PhotoSizes>()

    fun photoSizes(photo: PhotoSizes): PhotoSizes {
        photoSizes += photo
        return photoSizes.last()
    }
}

