package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

public class DemoApplication {
    public static void main(String[] args) {
        System.out.println("Hello");

        Gson gson = new Gson();
        String json = "{ \"Id\":1, \"Name\":itay }"; // { "Id": 1, "Name": "itay" }
        // PersonDTO p1 = new PersonDTO(1, "itay");

        JsonObject jo = JsonParser.parseString(json).getAsJsonObject();
        System.out.println(jo.get("Name"));

        PersonDTO p = gson.fromJson(jo, PersonDTO.class);
        System.out.println(p);
        System.out.println(p.Id);
        System.out.println(p.Name);

        PersonDTO p2 = new PersonDTO(2, "suzi");

        System.out.println(gson.toJson(p2));

        System.out.println("======================================================");

        String user_json = "{ \"id\": 1,\n" +
                "  \"name\": \"Leanne Graham\",\n" +
                "  \"username\": \"Bret\",\n" +
                "  \"email\": \"Sincere@april.biz\" }";
        JsonObject json_easy_access = JsonParser.parseString(user_json).getAsJsonObject();
        System.out.println(json_easy_access.get("email"));
        UserDTO user1 = gson.fromJson(json_easy_access, UserDTO.class);
        System.out.println(user1);

        ClientConfig clientConfig = new DefaultClientConfig();

        Client client = Client.create(clientConfig);
        WebResource webResource = client.resource(UriBuilder.fromUri("http://jsonplaceholder.typicode.com/users/2").build());
        String result =  webResource.path("").path("").accept(String.valueOf(MediaType.APPLICATION_JSON)).get(String.class);
        System.out.println(result);

        UserDTO real_user_from_internet = gson.fromJson(JsonParser.parseString(result).getAsJsonObject(), UserDTO.class);
        System.out.println(real_user_from_internet);
        System.out.println(real_user_from_internet.address.geo.lat);

        // 1. create an ArrayList<UserDTO>
        // 2. read users 1-5 from http://jsonplaceholder.typicode.com/users/
        // 3. add each user to the array_list
        // 4. print the array list
        // 5. create a test which validates that user/1 name is "Leanne Graham"
    }
}
