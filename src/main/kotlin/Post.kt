import java.util.*

data class Post(
    val id: Int = 0,
    val fromId: Long = 12,
    val ownerId: Long = 13,
    val createdBy: Long = 33,
    val date: Int = 2021,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
   val comments:  Comments,
  //  val comments:  Comments,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: String = postType(),
    val postSource: PostSource,
    val geo: Geo,
    val signerId: Long = 11,
    val copyHistory: Array< CopyHistory>? = emptyArray(),
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut,
    val postponedId: Long = 2,
    val attachments :Array< Attachments> = emptyArray(),
    )

fun postType() = when ("post") {
    "post" -> TODO()
    "copy" -> TODO()
    "reply" -> TODO()
    "postpone" -> TODO()
    "suggest" -> TODO()
    else -> "Неверная команда!"
}

class Views(
    views: Long = 0,
) {
    var views = views
        set(value) {
            if (value < 0) {
                return
            }
            field = value
        }
}

object CopyHistory {

    var copyHistory = emptyArray<CopyHistory>()

    fun add(history: CopyHistory): CopyHistory {
        copyHistory += history
        return copyHistory.last()

    }
}

