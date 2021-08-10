
class PostNotFoundException (message: String = "Комментарий не добавился!"): RuntimeException(message)

fun main() {
    var original =
        Post(
            id = 0,
            fromId = 12,
            ownerId = 13,
            createdBy = 435,
            date = 2021,
            text = "Новая Нетология",
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
//            comments = emptyArray<Comments>(),
            copyright = Copyright(1, "", "Frog", ""),
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
            attachments = emptyArray<Attachments>(),
        )
    var originalComments = Comments(1,1,1,"",
    Donut(false, "Нет подписки", false, "all", Placeholder),324,
    43,emptyArray <Attachments>(),emptyArray<ParentsStack> (), Thread(
        111, emptyArray<Items>(),
        true, true, true
    )
)
    //  WallService.update(original)
    // WallService.copyHistory(original)

}





//   val t =  (WallService.createComment(id)?.Comments ?: throw PostNotFoundException("no comments")


//  WallService.addComments (originalComments)
//  WallService.createComment(originalComments)



//
//var originalComments = Comments (1,1,1,"",
//    Donut(false, "Нет подписки", false, "all", Placeholder),324,
//    43,emptyArray <Attachments>(),emptyArray<ParentsStack> (), java.lang.Thread(
//        111, emptyArray<Items>(),
//        true, true, true
//    )
//)

//