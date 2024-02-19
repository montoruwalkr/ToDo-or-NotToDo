import com.montoruwalkr.todocli.task.Task
import org.scalatest.flatspec.AnyFlatSpec

class TaskTest extends AnyFlatSpec {

  "A Task" should "be created without an explicit id" in {
    val task: Option[Task] = Some(Task(
      title = Some("Buy groceries"),
      description = Some(""),
      priority = Some("high"),
      reminders = Some("17/02/2024"),
      dueDate = Some("20/02/2024"),
      tags = Some("home, groceries"),
      status = Some("In progress"),
      attachments = Some("grocery_list.txt")
    ))
    assert(task.isDefined)
  }

  "A Task" should "not require any mandatory field to be created" in {
    val task: Option[Task] = Some(Task(
      title = None,
      description = None,
      priority = None,
      reminders = None,
      dueDate = None,
      tags = None,
      status = None,
      attachments = None
    ))
    assert(task.isDefined)
  }
}