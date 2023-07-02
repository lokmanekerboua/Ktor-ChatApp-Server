package com.example.plugins

import com.example.room.RoomController
import com.example.routes.chatSocket
import com.example.routes.getAllMessages
import io.ktor.server.routing.*
import io.ktor.server.application.*
import org.koin.java.KoinJavaComponent.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>(clazz = RoomController::class.java)
    install(Routing) {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
