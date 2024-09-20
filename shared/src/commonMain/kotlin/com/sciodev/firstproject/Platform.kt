package com.sciodev.firstproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform