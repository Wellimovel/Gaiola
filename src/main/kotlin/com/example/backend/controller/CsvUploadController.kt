import jakarta.transaction.Transactional
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import org.springframework.http.ResponseEntity
import java.io.BufferedReader
import java.io.InputStreamReader

@RestController
@RequestMapping("/upload")
class CsvUploadController {

    @PostMapping
    @Transactional
    fun uploadCsv(@RequestParam("file") file: MultipartFile): ResponseEntity<List<Map<String, String>>> {
        val transportadorasList = mutableListOf<Map<String, String>>() // Lista para armazenar dados processados
        try {
            val reader = BufferedReader(InputStreamReader(file.inputStream))
            reader.lineSequence().drop(1).forEach { line -> // Ignorar cabeçalho
                val values = line.split(",") // Ajuste conforme a estrutura do seu CSV
                if (values.size >= 5) { // Verifique se há dados suficientes
                    val transportadora = mapOf(
                        "facility" to values[1].trim(), // Ajuste os índices conforme necessário
                        "tipoVeiculo" to values[4].trim()
                    )
                    transportadorasList.add(transportadora)
                }
            }
            return ResponseEntity(transportadorasList, HttpStatus.OK) // Retorna a lista para o frontend
        } catch (e: Exception) {
            return ResponseEntity(emptyList(), HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }
}