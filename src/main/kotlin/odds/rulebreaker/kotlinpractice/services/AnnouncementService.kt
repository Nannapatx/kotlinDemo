package odds.rulebreaker.kotlinpractice.services

import odds.rulebreaker.kotlinpractice.entites.Announcement
import odds.rulebreaker.kotlinpractice.repositories.AnnouncementRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*
import kotlin.jvm.optionals.toList

@Service
class AnnouncementService (val db: AnnouncementRepository) {

    @Autowired
    lateinit var announcementRepository: AnnouncementRepository

    fun getAnnouncementById(id: String): List<Announcement> = db.findById(id).toList()
    fun getAllAnnouncement(): List<Announcement> = db.findAll().toList()
    fun addAnnouncement(announcement: Announcement): Announcement = db.save(announcement)
    fun deleteAnnouncement(id: String) {
        if(db.findById(id).toString() != ""  ){
            announcementRepository.deleteById(id)
        }
    }
    fun getAnnouncementByCategory(category: String): List<Announcement> = db.getAnnouncementsByAnnouncementCategory(category)
    fun updateAnnouncement(announcement: Announcement): Announcement = db.save(announcement)
}