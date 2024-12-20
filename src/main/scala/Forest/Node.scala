package Forest

class Node(private var leaf: Boolean, private var children: Array[Node] = Array.empty, private var interval: Interval) {
  // Constructor principal
  def this(interval: Interval) ={
    this(false, Array.empty, interval)
  }

  
  def this() ={
    this(true, Array.empty, new Interval)
  }
}
   
   

