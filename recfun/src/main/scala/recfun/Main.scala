package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if((c==0)||(r==c)) 1
    else pascal(c-1,r-1)+pascal(c,r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balance_count(c: List[Char],cnt: Int): Int={
      if (c.isEmpty||cnt<0){
        cnt
      }
      else if(c.head=='('){
        balance_count(c.tail,cnt+1)
      }
      else if(c.head==')'){
        balance_count(c.tail,cnt-1)
      }
      else{
        balance_count(c.tail,cnt)
      }
    }

    if(balance_count(chars,0)==0) true
    else false
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
