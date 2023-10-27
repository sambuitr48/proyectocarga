import java.io.IOException;
import java.util.List;
public interface PhInterface {
DTO dto = new DTO();
List<DTO> findAll() throws IOException, ClassNotFoundException;
void save (DTO figura) throws IOException;
}
