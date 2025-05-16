package com.ic.surveyapi

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController {

    val logger = LoggerFactory.getLogger(HealthCheckController::class.java)

    @GetMapping("/ping")
    fun healthCheck(): String {
        logger.info("\uD83D\uDE04 Logger Test")
        logger.info("\uD83C\uDF4F \uD83C\uDF4E Logger Test")
        logger.info("\uD83D\uDEFA \uD83D\uDEA8 ERROR !!!")


        return "pong !"
    }
}
