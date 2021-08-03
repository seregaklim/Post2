class Image(
    var height: Int,
    var url: String,
    var width: Int,
    var withPadding: Boolean,
    )
{
    var image = emptyArray<Image>()

    fun image(image2: Image): Image {
        image += image2
        return image.last()
    }
}


