class Copyright(
    id: Long = 1,
    var link: String,
    var name: String = "Frog",
    var type: String,
) {
    var id = id
        set(value) {
            if (value < 0) {
                return
            }
            field = value
        }
}