
case class No() extends Maybe[Nothing] {
  override def applyFunction[R](function: Nothing => R): Maybe[R] = No()
  override def getOrElse[R >: Nothing](value: R): R = value
  override def map[R](function: Nothing => R): Maybe[R] = No()
  override def flatMap[R](function: Nothing => Maybe[R]): Maybe[R] = No()

}