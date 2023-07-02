package com.example.room

import io.ktor.websocket.*
import java.net.http.WebSocket

data class Member(
    val username: String,
    val sessionId: String,
    val socket: WebSocketSession
)