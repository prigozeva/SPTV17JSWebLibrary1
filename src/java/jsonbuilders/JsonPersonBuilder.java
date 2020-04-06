/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonbuilders;

import entity.Person;
import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;

/**
 *
 * @author artjo
 */
public class JsonPersonBuilder {

    JsonValue createJsonPersonObject(Person person) {
        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("id", person.getId())
                .add("firstname", person.getFirstname())
                .add("lastname", person.getLastname())
                .add("email", person.getEmail())
                .add("city", person.getCity())
                .add("street", person.getStreet())
                .add("house", person.getHouse())
                .add("room", person.getRoom());
        return job.build();

    }

}