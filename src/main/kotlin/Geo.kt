import java.util.*

class Geo (
    var type: String = " тип места ",
    var coordinates: String = "Координаты места",
    var place: Place
)
class Place {
    var id : Long
    var title: String
    var latitude: Long
    var created: Long
    var icon: String
    var checkins: Long
    var updated: Long
    var type: Long
    var country: Long
    var city: Long
    var address: String

    constructor(
        id: Long = 1221,
        title: String = "ВДНХ",
        latitude: Long = 42355,
        created: Long = 2021,
        icon: String = "",
        checkins: Long = 0,
        updated: Long = 2020,
        type: Long = 23,
        country: Long = 7,
        city: Long = 12,
        address: String = "Проспект Мира",
    ) {
        this.title = title
        this.latitude = latitude
        this.created = created
        this.icon = icon
        this.checkins = checkins
        this.updated = updated
        this.type = type
        this.country = country
        this.city = city
        this.address = address
        this.id =id
    }
}