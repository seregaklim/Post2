class PostSource {
   var type: String
   var platform: String
   var data: String
   var url: String

   constructor(
      type: String = type(),
      platform: String = platform( ),
      data: String =  data (),
      url: String = " ") {
      this.type = type
      this.platform = platform
      this.data = data
      this.url = url
   }
}

fun  type() = when ("vk") {
   "vk" -> TODO()
   "widget" -> TODO()
   "api" -> TODO()
   "rss"-> TODO()
   "sms" -> TODO()
   else -> "Неизвестное значение"
}

fun platform( ) = when ("android") {
   "android" -> TODO()
   "phone" -> TODO()
   "wphone" -> TODO()
   else -> "Неизвестная платформа"
}

fun data () = when ("profileActivity") {
   "profileActivity " -> TODO()
   "profilePhoto" -> TODO()
   "comments" -> TODO()
   "like" -> TODO()
   "poll " -> TODO()
   else -> "Неизвестный источник записи"
}