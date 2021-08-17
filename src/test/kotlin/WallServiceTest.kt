import org.junit.Assert.*

import org.junit.Test

class PostNotFoundException(message: String = "Комментарий не добавился!") : RuntimeException(message)
class WallServiceTest() {
    @Test
    fun updateExisting() {
        val service = WallService()
//    заполняем несколькими постами
        service.update(
            Post(
                id = 1,
                fromId = 0,
                ownerId = 0,
                createdBy = 0,
                date = 2021,
                text = "Новая Нетология",
                replyOwnerId = 0,
                replyPostId = 0,
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
                copyright = Copyright(0, "", "Frog", ""),
                likes = Likes(0),
                reposts = Reposts(0),
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
        )
        //создаём информацию об обновлении

        //создаём информацию об обновлении
        val update = Post(
            id = 1,
            fromId = 1422,
            ownerId = 142,
            date = 2021,
            createdBy = 4322,
            text = "Тест2",
            replyOwnerId = 24234221,
            replyPostId = 2342324,
            friendsOnly = true,
            comments = Comments(
                3, 1, 1, "Тест2",
                Donut(false, "Есть подписка", false, "all", Placeholder), 324,
                43, emptyArray<Attachments>(), emptyArray<ParentsStack>(), Thread(
                    111, emptyArray<Items>(),
                    true, true, true
                )
            ),
            //    comments = emptyArray<Comments>(),
            copyright = Copyright(1, "", "юля", ""),
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

        // выполняем целевое действие

        service.add(update)
        val result = service.update(update)
        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun notUpdateExisting() {
        val service = WallService()

        //    заполняем несколькими постами
        service.update(
            Post(
                id = 1,
                fromId = 0,
                ownerId = 0,
                createdBy = 0,
                date = 2021,
                text = "Новая Нетология",
                replyOwnerId = 0,
                replyPostId = 0,
                friendsOnly = true,
                comments = Comments(
                    3, 1, 1, "Тест2",
                    Donut(false, "Есть подписка", false, "all", Placeholder), 324,
                    43, emptyArray<Attachments>(), emptyArray<ParentsStack>(), Thread(
                        111, emptyArray<Items>(),
                        true, true, true
                    )
                ),
                //   comments = emptyArray<Comments>(),
                copyright = Copyright(0, "", "Frog", ""),
                likes = Likes(0),
                reposts = Reposts(0),
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
        )
        //создаём информацию об обновлении
        val update = Post(
            id = 14,
            date = 2021,
            text = ("Тест"),
            replyOwnerId = 3163,
            replyPostId = 23132,
            friendsOnly = true,
            comments = Comments(
                3, 1, 1, "Тест2",
                Donut(false, "Есть подписка", false, "all", Placeholder), 324,
                43, emptyArray<Attachments>(), emptyArray<ParentsStack>(), Thread(
                    111, emptyArray<Items>(),
                    true, true, true
                )
            ),
            // comments = emptyArray<Comments>(),
            copyright = Copyright(0, "", "", ""),
            likes = Likes(0),
            reposts = Reposts(112),
            views = Views(0),
            postType = ("post"),
            signerId = 11,
            canPin = true,
            postSource = PostSource("vk", "android", "profileActivity", ""),
            geo = Geo(
                " тип места ", "Координаты места", Place(
                    1221, "ВДНХ", 42355,
                    2021, "", 0, 2020, 23, 7, 12, "Проспект Мира",
                )
            ),
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
        // выполняем целевое действие
        service.add(update)
        val result = service.update(update)
        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }

    @Test
    fun addExisting() {
        val service = WallService()
        //    заполняем несколькими постами
        service.add(
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
                // comments = emptyArray<Comments>(),
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
                attachments = emptyArray<Attachments>()
            )

        )
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
                // comments = emptyArray<Comments>(),
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
                copyHistory = emptyArray<CopyHistory>(),
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                donut = Donut(false, "Нет подписки", false, "all", Placeholder),
                postponedId = 4234,
                attachments = emptyArray<Attachments>()
            )

        service.copyHistory(original)

        assertEquals(0, original.id)
    }


    @Test
    fun createComment() {

        val service = WallService()
        service.add(
            Post(
                id = 1,
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
                // comments = emptyArray<Comments>(),
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
                attachments = emptyArray<Attachments>()
            )

        )
        var original =
            Post(
                id = 1,
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
                // comments = emptyArray<Comments>(),
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
                copyHistory = emptyArray<CopyHistory>(),
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = true,
                markedAsAds = true,
                isFavorite = true,
                donut = Donut(false, "Нет подписки", false, "all", Placeholder),
                postponedId = 4234,
                attachments = emptyArray<Attachments>()
            )


        var originalComments = Comments(
            1, 0, 1, "",
            Donut(false, "Нет подписки", false, "all", Placeholder), 324,
            43, emptyArray<Attachments>(), emptyArray<ParentsStack>(), Thread(
                111, emptyArray<Items>(),
                true, true, true
            )
        )

        val result = service.createComment(originalComments)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun createCommentexpected() {
        val service = WallService()
        val comment = Comments(
            0, 1, 1, "",
            Donut(false, "Нет подписки", false, "all", Placeholder), 324,
            43, emptyArray<Attachments>(), emptyArray<ParentsStack>(), Thread(
                111, emptyArray<Items>(),
                canPost = true, showReplyButton = true, groupsCanPost = true
            )
        )
        service.createComment(comment)
    }
}




