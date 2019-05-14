package task3;

import java.util.HashMap;

public class ResponseCASoap {


    HashMap propertyMap;
    String log = "";
    String result = "ERROR";

    public HashMap getPropertyMap() {
        return propertyMap;
    }

    public void setPropertyMap(
            HashMap parametrMap) {
        this.propertyMap = parametrMap;
    }

}
