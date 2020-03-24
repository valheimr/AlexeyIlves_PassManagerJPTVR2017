package jsonbuilder;

import entity.User;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

public class UserJsonBuilder {
    public JsonObject cerateJsonUser(User user){
        PersonJsonBuilder personJsonBuilder = new PersonJsonBuilder();
        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("id", user.getId());
        job.add("login", user.getLogin());
        job.add("active", user.isActive());
        job.add("person", personJsonBuilder.createJsonPerson(user.getPerson()));
        return job.build();
    }
}
