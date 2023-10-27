import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Servicio implements PhInterface{
private List<DTO> objt;
public Servicio() throws IOException, ClassNotFoundException {
    objt = new ArrayList<>();
}
    @Override
        public List<DTO> findAll() throws IOException, ClassNotFoundException {
        objt = (List<DTO>) ObjetoSerializable.readObjectFromFile("Figurita.ax");
        return null;
    }


    @Override
    public void save(DTO figura) throws IOException {
        objt.add(figura);
        ObjetoSerializable.writeObjectToFile(objt, "Figurita.ax");
    }
}
