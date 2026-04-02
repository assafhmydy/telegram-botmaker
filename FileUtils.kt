// FileUtils.kt
import java.io.File

object FileUtils {
    fun readFile(filePath: String): String { 
        return File(filePath).readText()
    }
}