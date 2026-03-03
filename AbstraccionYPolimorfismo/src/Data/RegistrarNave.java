package Data;

import Naves.VehiculoEspacial;

import java.io.IOException;

public class RegistrarNave {
    private IRegistrarTipoNave registrarNave;

    public RegistrarNave(IRegistrarTipoNave registrarNave){
        this.registrarNave = registrarNave;
    }

    public void GenerarGuardado(VehiculoEspacial vehiculo) throws IOException {
        this.registrarNave.RegistrarNave(vehiculo);
    }
}
