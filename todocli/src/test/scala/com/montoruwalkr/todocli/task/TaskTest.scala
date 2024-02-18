import org.scalatest.flatspec.AnyFlatSpec

class TaskTest extends AnyFlatSpec {

  "A Task" should "be created without an explicit id" in {
    val task: Option[Task] = Some(Task(
      title = "Buy groceries",
      description = "",
      priority = "high",
      reminders = "17/02/2024",
      dueDate = "20/02/2024",
      tags = "home, groceries",
      status = "In progress",
      attachments = "grocery_list.txt"
    ))
    assert(task.isDefined)
  }
}