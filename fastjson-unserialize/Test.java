import com.alibaba.fastjson.JSON;

public class Test {

    public static void main(String[] argv) {
        String payload = "{\"name\":{\"@type\":\"Target\",\"value\":1}}";
        JSON.parse(payload);
    }
}



