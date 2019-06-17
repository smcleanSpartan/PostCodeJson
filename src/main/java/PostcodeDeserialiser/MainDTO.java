package PostcodeDeserialiser;

import org.json.simple.JSONObject;

public class MainDTO {

    private int status;
    private JSONObject result;

    public int getStatus() {
        return status;
    }

    public JSONObject getResult() {
        return result;
    }
}