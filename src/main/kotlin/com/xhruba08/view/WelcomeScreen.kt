package com.xhruba08.view

import com.xhruba08.controllers.LoginController
import com.xhruba08.model.UserModel
import javafx.geometry.Pos
import javafx.scene.Parent
import javafx.scene.text.FontWeight
import tornadofx.*

class WelcomeScreen : View("Welcome") {
    val user: UserModel by inject()
    val loginController: LoginController by inject()

    override val root = vbox(10) {
        setPrefSize(800.0, 600.0)
        alignment = Pos.CENTER

        label(user.name) {
            style {
                fontWeight = FontWeight.BOLD
                fontSize = 24.px

            }
        }

        button("logout").action(loginController::logout)
    }
}