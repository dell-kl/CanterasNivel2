package Data;

import Naves.VehiculoEspacial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RegistrarTipoTripulada implements IRegistrarTipoNave {
    @Override
    public void RegistrarNave(VehiculoEspacial vehiculo) throws IOException {

        Path ruta = Path.of("DatosNaveTripulada.txt");

        StringBuilder textoFormateado = new StringBuilder();
        textoFormateado.append(" --- Nombre Nave: ");
        textoFormateado.append(vehiculo.getNombre());
        textoFormateado.append(" --- Velocidad: ");
        textoFormateado.append(vehiculo.getVelocidad());
        textoFormateado.append(" --- Peso : ");
        textoFormateado.append(vehiculo.getPeso());

        Files.writeString(ruta, textoFormateado);
    }
}
