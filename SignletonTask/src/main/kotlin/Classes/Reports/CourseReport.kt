package org.example.Classes.Reports

import kotlinx.serialization.Serializable

@Serializable
class CourseReport(var executor: String = "", var scientificAdviser: String = "") : Report()