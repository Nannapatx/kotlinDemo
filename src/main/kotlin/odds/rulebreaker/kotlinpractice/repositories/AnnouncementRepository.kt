package odds.rulebreaker.kotlinpractice.repositories

import odds.rulebreaker.kotlinpractice.entites.Announcement
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.Locale.Category

@Repository
interface AnnouncementRepository : CrudRepository<Announcement, String> {
    fun getAnnouncementsByAnnouncementCategory(category: String): List<Announcement>

}