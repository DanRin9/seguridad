package co.edu.uniandes.labociencia.seguridad;

import java.util.List;

public interface ProtocoloRepository {

    List<ProtocoloSeguridadDTO> findAll();
    
}
