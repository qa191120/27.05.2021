package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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

		//SpringApplication.run(DemoApplication.class, args);

		// targil
		// 1
		// http://jsonplaceholder.typicode.com/users/1
		String user_json = "{ \"id\": 1,\n" +
				"  \"name\": \"Leanne Graham\",\n" +
				"  \"username\": \"Bret\",\n" +
				"  \"email\": \"Sincere@april.biz\" }";
		// create UserTDO id, name, uername, email
		// *etgar: company
		// convert the user_json into UserTDO using Gson
		// print the object you created
		// 2
		// create UserTDO by using the ctor
		// convert thje object into json string using Gson
		// print the string
	}

}
