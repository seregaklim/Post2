class TypeVideo(
    var id: Long,
    var owner_id: Long,
    var title: String,
    var description: String,
    var duration: Long,
    var image: Image,
    var firstFrame: FirstFrame,
    var date: Int,
    var addingDate: Int,
    var localViews: Long,
    var comments: Long,
    var player: String,
    var platform: String,
)