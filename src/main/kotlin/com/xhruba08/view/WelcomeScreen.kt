package com.xhruba08.view

import com.xhruba08.model.UserModel
import javafx.scene.Parent
import tornadofx.*

class WelcomeScreen : View("Welcome") {
    val user: UserModel by inject()

    override val root = vbox(10) {
        label(user.name)
    }
}