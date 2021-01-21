
trait Maybe[+A] {
def applyFunction[R](function: A => R): Maybe[R] 
def getOrElse[R >: A](funValue: R): R
def map[R](function: A=>R): Maybe[R]
def flatMap[R](function: A=>Maybe[R]): Maybe[R]
}


