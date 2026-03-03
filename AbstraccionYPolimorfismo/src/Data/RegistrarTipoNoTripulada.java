package Data;

import Naves.VehiculoEspacial;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class RegistrarTipoNoTripulada implements IRegistrarTipoNave {
    @Override
    public void RegistrarNave(VehiculoEspacial vehiculo) throws IOException {
        Path ruta = Path.of("DatosNaveNoTripulada.txt");

        StringBuilder textoFormateado = new StringBuilder();
        textoFormateado.append(" --- Nombre Nave: ");
        textoFormateado.append(vehiculo.getNombre());
        textoFormateado.append(" --- Velocidad: ");
        textoFormateado.append(vehiculo.getVelocidad());
        textoFormateado.append(" --- Peso : ");
        textoFormateado.append(vehiculo.getPeso());
        textoFormateado.append(" --- Informacion: ");
        textoFormateado.append(vehiculo.Despegue());

        Files.writeString(ruta, textoFormateado);
    }
}
