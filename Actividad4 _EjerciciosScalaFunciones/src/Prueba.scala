import scala.io.StdIn._

object Prueba {
  def main(args: Array[String]): Unit = {
    
    println("Ingresa el numero del tamaño de los datos: ")
    val numDatos = readByte()
    var datos = new Array[Double](numDatos)
    
    for(i <- 0 until datos.length){
      println("Ingresa un dato: "+(i+1)+":")
      datos(i) = readDouble()
    }
    
   def sacarMedia(datos: Array[Double]): Double ={
      var media = 0.0
    for(i <- datos){
      media += i
    }
     media/datos.length
   }//sacar media

   println("La Media Aritmetica es: " + (sacarMedia(datos)))
   
   //se hace la suma de las diferencias respecto a la media
  
  

  }
}