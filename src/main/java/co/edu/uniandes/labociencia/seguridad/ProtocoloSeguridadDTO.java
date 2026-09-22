package co.edu.uniandes.labociencia.seguridad;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class ProtocoloSeguridadDTO extends ProtocoloBasicModel {

  private List<IncidentesDTO> incidentes;

    
}

