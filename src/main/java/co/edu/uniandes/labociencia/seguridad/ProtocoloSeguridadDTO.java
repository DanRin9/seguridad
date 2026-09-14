package co.edu.uniandes.labociencia.seguridad;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProtocoloSeguridadDTO extends ProtocoloBasicModel {

  private List<IncidentesDTO> incidentes;

    
}

