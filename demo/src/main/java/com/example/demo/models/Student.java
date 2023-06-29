package com.example.demo.models;

import org.bson.types.ObjectId;
import org.springframework.boot.context.properties.bind.Name;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @Indexed(unique = true)
    @NotNull
    private ObjectId id;
    @NotNull(message = "This Field Can't be Empty")
    private String name;
    @Min(18)
    @Max(50)
    @NotNull
    private Number age;
    @Indexed(unique = true)
    @NotNull
    private String studentID;

}
