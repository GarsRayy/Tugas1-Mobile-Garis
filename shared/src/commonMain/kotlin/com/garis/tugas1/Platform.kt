package com.garis.tugas1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform