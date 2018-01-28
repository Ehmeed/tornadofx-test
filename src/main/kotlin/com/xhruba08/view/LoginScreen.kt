package com.xhruba08.view

import com.xhruba08.app.Styles
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Orientation
import javafx.scene.Parent
import tornadofx.*

class LoginScreen : View("Login") {
    val model = ViewModel()
    val username = model.bind { SimpleStringProperty() }
    val password = model.bind { SimpleStringProperty() }

    override val root = form {
        fieldset(labelPosition = Orientation.VERTICAL) {
            fieldset("Username") {
                textfield()
            }
            fieldset("Password") {
                passwordfield()
            }
            button(" Log in") {

            }
        }
    }

}