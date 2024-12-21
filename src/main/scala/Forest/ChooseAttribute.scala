package Forest

class ChooseAttribute {
  val c: Int = 0
 
  private var instanceIndexes: Array[Int]=Array.empty
  private var attributeUsed: Array[Boolean]=Array.empty
  var interval: Interval= _
  
  def chooseAttribute( instanceIndexes : Array[Int], attributeUsed : Array[Boolean]): Unit = {
   // this.dataset=dataset
    this.instanceIndexes=instanceIndexes
    this.attributeUsed=attributeUsed
    
  }

 /* def run(): Unit = {
    var i = Randomize.randInt(0, dataset.getNumInputs())
    val j = i
    
    //Se usa un While-do Porque ya a partir de scala 3.0 se descontinuo el do-While
    while ( {
      if (!attributeUsed(i)) {
        //val chooseInterval = new ChooseInterval(dataset, instanceIndexes, i)
       // chooseInterval.run()

        if (chooseInterval.getInterval().getSubsets() != null) {
          interval = chooseInterval.getInterval()
        }
      }

      i = if (i == dataset.getNumInputs() - 1) 0 else i + 1

      i != j && interval == null
    }) {
      ()
    }
  */
}
