/**
 * Original : http://pavelfatin.com/scala-for-project-euler/
 * 
 * Find the sum of all the even-valued terms in the Fibonacci sequence which do not exceed four million.*
 */

lazy val fs: Stream[Int] = 
  0 #:: 1 #:: fs.zip(fs.tail).map(p => p._1 + p._2)

val r = fs.view.takeWhile(_ <= 4000000).filter(_ % 2 == 0).sum

assert(r == 4613732) // 1 ms
