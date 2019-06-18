package PostcodeDeserialiser;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class LocationDeserialiser {
    public MainDTO mainMapped;
    public ResultDTO resultMapped;
    public CodeDTO codeMapped;

    public LocationDeserialiser(String filename){
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            mainMapped = objectMapper.readValue(new File(filename), MainDTO.class);
            resultMapped = objectMapper.readValue( mainMapped.getResult().toJSONString(), ResultDTO.class);
            codeMapped = objectMapper.readValue( resultMapped.getCodes().toJSONString(), CodeDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
