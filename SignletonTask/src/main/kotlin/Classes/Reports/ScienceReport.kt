package org.example.Classes.Reports

import kotlinx.serialization.Serializable

@Serializable
class ScienceReport(var fieldOfStudy: String = "", var typeOfResearch: String = ""): Report() {
}