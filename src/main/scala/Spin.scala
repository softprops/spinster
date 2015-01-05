package spinster

object Spin {
  val Boxes0 = "⠋⠙⠹⠸⠼⠴⠦⠧⠇⠏".split("")
  val Boxes1 = "⠋⠙⠚⠞⠖⠦⠴⠲⠳⠓".split("")
  val Boxes2 = "⠄⠆⠇⠋⠙⠸⠰⠠⠰⠸⠙⠋⠇⠆".split("")
  val Boxes3 = "⠋⠙⠚⠒⠂⠂⠒⠲⠴⠦⠖⠒⠐⠐⠒⠓⠋".split("")
  val Boxes4 = "⠁⠉⠙⠚⠒⠂⠂⠒⠲⠴⠤⠄⠄⠤⠴⠲⠒⠂⠂⠒⠚⠙⠉⠁".split("")
  val Boxes5 = "⠈⠉⠋⠓⠒⠐⠐⠒⠖⠦⠤⠠⠠⠤⠦⠖⠒⠐⠐⠒⠓⠋⠉⠈".split("")
  val Boxes6 = "⠁⠁⠉⠙⠚⠒⠂⠂⠒⠲⠴⠤⠄⠄⠤⠠⠠⠤⠦⠖⠒⠐⠐⠒⠓⠋⠉⠈⠈".split("")
  val Clock = "◴◷◶◵".split("")
  val Rotate = "╫╪".split("")
  val Progress = Array("o..", ".o.", "..o")
}

// for (_ <- 0 to 30) { Thread.sleep(100); print(s"\r\033[36m${s.next}\033[0m") }
case class Spin(it: Iterable[String] = Spin.Boxes0) extends Iterator[String] {
  @volatile private[this] var iter = it.iterator
  def hasNext = it.nonEmpty
  def next(): String = {
    if (iter.isEmpty) {
      iter = it.iterator
    }
    iter.next
  }
}
