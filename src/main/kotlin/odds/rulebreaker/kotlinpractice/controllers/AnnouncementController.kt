package odds.rulebreaker.kotlinpractice.controllers

import odds.rulebreaker.kotlinpractice.entites.Announcement
import odds.rulebreaker.kotlinpractice.repositories.AnnouncementRepository
import odds.rulebreaker.kotlinpractice.services.AnnouncementService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["http://localhost:3000"])
@RequestMapping("/api/announcement")
class AnnouncementController {

    @Autowired
    lateinit var announcementService: AnnouncementService

    @GetMapping("")
    fun getAllCustomers(): List<Any> {
        return announcementService.getAllAnnouncement()
    }
    @GetMapping("/{id}")
    fun getCustomerById(@PathVariable id: String): List<Any> {
        return announcementService.getAnnouncementById(id)
    }

    @DeleteMapping("/{id}")
    fun deleteCustomerById(@PathVariable id: String){
        return announcementService.deleteAnnouncement(id)
    }

    @PostMapping("")
    fun addCustomer(@RequestBody announcement: Announcement) : Announcement {
        return announcementService.addAnnouncement(announcement)
    }

//    @GetMapping("/category/{category}")
//    fun getAnnouncementByCategory(@PathVariable category: String): List<Any> {
//        return announcementService.getAnnouncementByCategory(category)
//    }

}