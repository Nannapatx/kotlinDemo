package odds.rulebreaker.kotlinpractice.entites

import jakarta.persistence.Entity
import jakarta.persistence.*
import jakarta.persistence.Table
import lombok.Getter
import lombok.Setter
import java.time.ZonedDateTime

@Getter
@Setter
@Entity
@Table(name = "announcement")
class Announcement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "announcementId")
    var announcementId: Int? = null
    var announcementTitle: String? = null
    var announcementDescription: String? = null
    var announcementCategory: String? = null
    var publishDate: ZonedDateTime? = null
    var closeDate: ZonedDateTime? = null
    var announcementDisplay: String = "N"
    var announcementOwner: String? = null




}

