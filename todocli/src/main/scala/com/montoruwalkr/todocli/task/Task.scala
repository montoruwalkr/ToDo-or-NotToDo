package com.montoruwalkr.todocli.task

import java.util.UUID

case class Task(
                 id: UUID = UUID.randomUUID(),
                 title: Option[String],
                 description: Option[String],
                 priority: Option[String],
                 reminders: Option[String],
                 dueDate: Option[String],
                 tags: Option[String],
                 status: Option[String],
                 attachments: Option[String]
               )