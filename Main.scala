import org.json4s.native.JsonParser
import org.json4s.jvalue2extractable

case class Record(id: String, value: Option[Int] = None)

object Main {
  def main(args: Array[String]): Unit = {
    implicit val formats: org.json4s.Formats = org.json4s.DefaultFormats

    val json = JsonParser.parse("""{"id":"abc"}""")
    println(json.extract[Record])
  }
}
