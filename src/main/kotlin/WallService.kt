class WallService {

    var posts = emptyArray<Post>()
    private var id = 0

    fun add(post: Post): Post {
        posts += post.copy(id = ++id)
        return posts.last()
    }

    fun update(updatedPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == updatedPost.id) {
                posts[index] = updatedPost.copy(
                    fromId = 142,
                    ownerId = 143,
                    createdBy = 435,
                    text = "Тест",
                    replyOwnerId = 2423421,
                    replyPostId = 234234,
                    friendsOnly = true,
                    comments = Comments(0),
                    copyright = Copyright(1, "", "коля", ""),
                    likes = Likes(0),
                    reposts = Reposts(112),
                    views = Views(0),
                    postType = ("post"),
                    postSource = PostSource("vk", "android", "profileActivity", ""),
                    geo = Geo(
                        " тип места ", "Координаты места", Place(
                            1221, "ВДНХ", 42355,
                            2021, "", 0, 2020, 23, 7, 12, "Проспект Мира",
                        )
                    ),
                    signerId = 11,
                    canPin = true,
                    copyHistory = CopyHistory,
                    canDelete = true,
                    canEdit = true,
                    isPinned = true,
                    markedAsAds = true,
                    isFavorite = true,
                    donut = Donut(false, "Нет подписки", false, "all", Placeholder),
                    postponedId = 4234,
                    attachments = Attachments(
                        TypePhoto(2442, 24, 24, 24, "", 35, 65, 56, 54),
                        PostedPhoto(235, 345, 35, 435),
                        TypeVideo(
                            65, 6, "", "", 43, Image(
                                34, "", 34,
                                true
                            ),
                            FirstFrame(43, "", 435), 56, 65, 65,
                            5, "", ""
                        ), TypeAudio(33, 3, "", 33, "", 3,
                            43, 34, 354, true, false), App(44, "", "",
                            "")
                    )
                )
                return true
            }
        }
        return false
    }

    fun copyHistory(post: Post): Post {
        val copyHistory = post.copyHistory ?: post
        TODO()
    }
}