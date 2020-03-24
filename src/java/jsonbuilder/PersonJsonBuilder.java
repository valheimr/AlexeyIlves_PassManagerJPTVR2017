package jsonbuilder;

import entity.Person;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

public class PersonJsonBuilder {
    public JsonObject createJsonPerson(Person person){
        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("id", person.getId());
        job.add("firstname", person.getFirstname());
        job.add("lastname", person.getLastname());
        job.add("email",person.getEmail());
        return job.build();
    }
}
