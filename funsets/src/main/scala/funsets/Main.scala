package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  printSet(x=>x>0)
  printSet(y=>y<0)

  printSet(map(x => x>0,y=> 2*y))
}
