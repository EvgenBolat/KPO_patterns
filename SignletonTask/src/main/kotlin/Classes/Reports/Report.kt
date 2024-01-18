package org.example.Classes.Reports

import kotlinx.serialization.Serializable

@Serializable
open class Report (var name: String = "", var header: String = "", var reportString: String = "",
                   var listOfSesources: String = "", var annotation: String = "",
                   var task: String = ""
) {
}