package Forest

class Node(val leaf: Boolean, val interval: Option[Interval]) {
  private val children: Array[Option[Node]] = Array.fill(2)(None)

  // Constructor principal
  def this(interval: Interval) = {
    this(leaf = false, Some(interval))
  }

  // Constructor para nodos hoja
  def this() = {
    this(leaf = true, None)
  }

  def getChildredn:Array[Option[Node]]=children
  def addChild(index: Int , child: Node):Unit={
    children(index)=Some(child)
  }
  def isLeaf:Boolean= leaf

  def getInterval: Option[Interval] = interval

}
