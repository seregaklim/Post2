class Reposts(
    count: Long = 0,
    var userReposted: Boolean = userReposted(),
) {
    var count = count
        set(value) {
            if (value < 0) {
                return
            }
            field = value
        }
}

fun userReposted(): Boolean {
    return true
}