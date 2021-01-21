

case class Yes[A](val value: A) extends Maybe[A]
{
  override def applyFunction[R](function: A => R): Maybe[R] = Yes(function(value))
  override def getOrElse[R >: A](value2: R): R = value
  override def map[R](function: A => R): Maybe[R] = Yes(function(value))
  override def flatMap[R](function: A => Maybe[R]): Maybe[R] = function(value)
}