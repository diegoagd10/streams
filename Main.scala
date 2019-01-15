package org.dgomezdiaz.streams

import scala.io.StdIn._

object Main extends App {
  def multiple(numero: Int, contador: Int = 0): Unit = {
      if(contador > 1000) ()
      else {
         if(contador % numero == 0) println(s"El $contador es mültiplo de $numero, todo cool")
         else                       System.err.println(s"NO!!! ALARMA: el $contador no es mültiplo de $numero!!!")
         Thread.sleep(1000)
         multiple(numero, contador + 1)
      }
  }

  println("nümero: ")
  multiple(readInt())
}

