
object Test extends dotty.runtime.LegacyApp {
  import scala.tools.nsc.io._

  val dir: VirtualDirectory = new VirtualDirectory("foo", None)
  dir.subdirectoryNamed("foo")
  assert(dir.lookupName("foo", true) != null)

}


