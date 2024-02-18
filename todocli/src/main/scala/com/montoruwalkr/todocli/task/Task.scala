package com.montoruwalkr.todocli.task

import java.util.UUID

case class Task(
                 id: UUID = UUID.randomUUID(),
                 title: String = "",
                 description: String = "",
                 priority: String = "",
                 reminders: String = "",
                 dueDate: String = "",
                 tags: String = "",
                 status: String = "",
                 attachments: String = ""
               )