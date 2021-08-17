data class Comments(
    var postId: Int =0,
    var fromId: Long,
    var date: Long,
    var text: String,
    var donut: Donut,
    var replyToUser: Long,
    var replyToComment: Long,
    var attachments: Array<Attachments> = emptyArray(),
    var parentsStack: Array<ParentsStack> = emptyArray(),
    var thread: Thread,
)

    object ParentsStack {

        private var parentsStack = emptyArray<ParentsStack>()

        fun addParentsStack(parentsStack2: ParentsStack): ParentsStack {
            parentsStack += parentsStack2
            return parentsStack.last()
        }
    }
class Thread(
    var count: Long,
    var items: Array<Items> = emptyArray(),
    var canPost: Boolean,
    var showReplyButton: Boolean,
    var groupsCanPost: Boolean,
)

object Items {
    private var items = emptyArray<Items>()

    fun addItems(items2: Items): Items {
        items += items2
        return items.last()
    }
}












//
//class Comments {
//    var canPost: Boolean
//    var groupsCanPost: Boolean
//    var canClose: Boolean
//    var canOpen: Boolean
//
//    constructor(
//        count: Long = 0,
//        canPost: Boolean = canPost(),
//        groupsCanPost: Boolean = groupsCanPost(),
//        canClose: Boolean = canClose(),
//        canOpen: Boolean = canOpen()
//    ) {
//        this.canPost = canPost
//        this.groupsCanPost = groupsCanPost
//        this.canClose = canClose
//        this.canOpen = canOpen
//        this.count = count
//    }
//
//    var count: Long
//        set(value) {
//            if (value < 0) {
//                return
//            }
//            field = value
//        }
//}
//
//fun canPost(): Boolean {
//    return true
//}
//
//fun groupsCanPost(): Boolean {
//    return true
//}
//
//fun canClose(): Boolean {
//    return true
//}
//
//fun canOpen(): Boolean {
//    return true
//}
