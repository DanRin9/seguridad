package co.edu.uniandes.labociencia.seguridad;

import java.io.InputStream;
import java.util.List;

import org.springframework.stereotype.Repository;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

@Repository
public class InMemoryProtocoloRepository implements ProtocoloRepository {

    private final List<ProtocoloSeguridadDTO> protocolos;
    
    public InMemoryProtocoloRepository(){
        this.protocolos = cargarDatos();
    }

    @Override
    public List<ProtocoloSeguridadDTO> findAll(){
        return protocolos;
    }

    private List<ProtocoloSeguridadDTO> cargarDatos() {
        ObjectMapper objectMapper = new ObjectMapper();
        try (InputStream inputStream = getClass().getResourceAsStream("/datos.json")) {
            if (inputStream == null) {
                throw new IllegalStateException("No se encontró el archivo /datos.json en el classpath.");
            }
            return objectMapper.readValue(inputStream, new TypeReference<List<ProtocoloSeguridadDTO>>() {});
        } catch (Exception e) {
            throw new IllegalStateException("Error al leer o deserializar el archivo /datos.json", e);
        }
    }

}
