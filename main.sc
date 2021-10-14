sealed class Vehicule{
  
}
case class Voiture(val matricule : String, val marque : String)extends Vehicule{}
case class Moto(val matricule : String, val pilote : String) extends Vehicule{}
case class Bateau(val matricule : String,val Marin: String)extends Vehicule{}
