package spinster

object Spin {
  val Boxes0 = "⠋⠙⠹⠸⠼⠴⠦⠧⠇⠏"
  val Boxes1 = "⠋⠙⠚⠞⠖⠦⠴⠲⠳⠓"
  val Boxes2 = "⠄⠆⠇⠋⠙⠸⠰⠠⠰⠸⠙⠋⠇⠆"
  val Boxes3 = "⠋⠙⠚⠒⠂⠂⠒⠲⠴⠦⠖⠒⠐⠐⠒⠓⠋"
  val Boxes4 = "⠁⠉⠙⠚⠒⠂⠂⠒⠲⠴⠤⠄⠄⠤⠴⠲⠒⠂⠂⠒⠚⠙⠉⠁"
  val Boxes5 = "⠈⠉⠋⠓⠒⠐⠐⠒⠖⠦⠤⠠⠠⠤⠦⠖⠒⠐⠐⠒⠓⠋⠉⠈"
  val Boxes6 = "⠁⠁⠉⠙⠚⠒⠂⠂⠒⠲⠴⠤⠄⠄⠤⠠⠠⠤⠦⠖⠒⠐⠐⠒⠓⠋⠉⠈⠈"
  val Clock = "◴◷◶◵"
  val Rotate = "╫╪"
}

// for (_ <- 0 to 30) { Thread.sleep(100); print(s"\r\033[36m${s.next}\033[0m") }
case class Spin(it: Iterable[Char] = Spin.Boxes0) {
  @volatile private[this] var iter = it.iterator
  def next(): Char = {
    if (iter.isEmpty) {
      iter = it.iterator
    }
    iter.next
  }
}
