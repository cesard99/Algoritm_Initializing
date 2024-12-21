package Repository

import scala.collection.mutable.ArrayBuffer

class MyAttribute private (
                            val nombre: String,
                            val `type`: Int,
                            private var values: Option[ArrayBuffer[String]] = None,
                            var lowerBound: Double = 0.0,
                            var upperBound: Double = 0.0,
                            var amplitude: Double = 0.0,
                            private var _index: Int = 0
                          ) {
  
  def index: Int = _index

  
  def setIndex(newIndex: Int): Unit = {
    _index = newIndex
  }

  // Constructor auxiliar para atributos nominales
  def this(name: String, values: ArrayBuffer[String], index: Int) = {
    this(name, MyAttribute.NOMINAL, Some(values), _index = index)
  }

  // Métodos de verificación del tipo de atributo
  def isNominal: Boolean = `type` == MyAttribute.NOMINAL
  def isReal: Boolean = `type` == MyAttribute.REAL
  def isInteger: Boolean = `type` == MyAttribute.INTEGER

  // Métodos para trabajar con los valores
  def indexOf(value: String): Int = values.map(_.indexOf(value)).getOrElse(-1)
  def numValues: Int = values.map(_.size).getOrElse(0)
  def value(index: Int): String = values.map(_(index)).getOrElse(throw new IndexOutOfBoundsException)

  // Nombre del atributo
  def name(): String = nombre
}

// Objeto compañero para constantes y métodos estáticos
private object MyAttribute {
  private val NOMINAL = 0
  private val INTEGER = 1
  private val REAL = 2

  // Métodos estáticos para verificación de tipo
  def isNominal(`type`: Int): Boolean = `type` == NOMINAL
  def isReal(`type`: Int): Boolean = `type` == REAL
  def isInteger(`type`: Int): Boolean = `type` == INTEGER
}

