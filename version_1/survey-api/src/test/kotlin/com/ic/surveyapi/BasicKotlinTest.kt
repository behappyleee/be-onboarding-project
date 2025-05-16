package com.ic.surveyapi

import io.kotest.core.spec.style.StringSpec
import org.slf4j.LoggerFactory

class BasicKotlinTest: StringSpec({

    val loggerTest = LoggerFactory.getLogger(this.javaClass)

    "Emoji Print Test" {
        loggerTest.debug("\uD83D\uDE04")


        val smileEmoji = "\uD83D\uDE04" // 😄 (Smile Emoji)
        println("Hello, Kotlin! $smileEmoji")
    }


})
