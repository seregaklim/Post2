class WallService {

    private var posts = emptyArray<Post>()
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
                    comments = Comments(
                        3, 1, 1, "Тест2",
                        Donut(false, "Есть подписка", false, "all", Placeholder), 324,
                        43, emptyArray<Attachments>(), emptyArray<ParentsStack>(), Thread(
                            111, emptyArray<Items>(),
                            true, true, true
                        )
                    ),
                    //  comments = emptyArray<Comments>(),
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
                    copyHistory = emptyArray<CopyHistory>(),
                    canDelete = true,
                    canEdit = true,
                    isPinned = true,
                    markedAsAds = true,
                    isFavorite = true,
                    donut = Donut(false, "Нет подписки", false, "all", Placeholder),
                    postponedId = 4234,
                    attachments = emptyArray<Attachments>()
                )

                return true
            }
        }

        return false
    }

    fun copyHistory(post: Post): Post {
        val copyHistory = post.copyHistory ?: post
        return post

    }

    private var comments = emptyArray<Comments>()


    fun createComment(comment: Comments): Boolean {

        for ((index, post) in posts.withIndex()) {
            if (post.id == comment.postId) {
                comments += comment.copy(postId = id++)

                return true
            }
        }
        throw PostNotFoundException("Комментарий не добавлен!")
        return false
    }

}




