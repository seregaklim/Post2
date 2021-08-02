class Likes {
    var userLikes: Boolean
    var canLike: Boolean
    var canPublish: Boolean

    constructor(count: Int = 0, userLikes: Boolean = true, canLike: Boolean = true, canPublish: Boolean = true) {
        this.userLikes = userLikes
        this.canLike = canLike
        this.canPublish = canPublish
        this.count = count
    }

    var count: Int
        set(value) {
            if (value < 0) {
                return
            }
            field = value
        }
}

fun userLikes(): Boolean {
    TODO()
}

fun canLike(): Boolean {
    TODO()
}

fun canPublish(): Boolean {
    TODO()
}