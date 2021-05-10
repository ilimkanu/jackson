import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "[{\"type\":\"cat\",\"deleted\":false,\"_id\":\"5887e1d85c873e0011036889\",\"user\":\"5a9ac18c7478810ea6c06381\",\"text\":\"Cats make about 100 different sounds. Dogs make only about 10.\",\"__v\":0,\"source\":\"user\",\"updatedAt\":\"2020-09-03T16:39:39.578Z\",\"createdAt\":\"2018-01-15T21:20:00.003Z\",\"used\":true}]";

        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(json, User.class);
        System.out.println(user);
    }
}
