# CONFIG

* Java 8
* Gradle 8
* Intellij Idea Community

## INFO

* Folder 'examples' for temporary files
* Folder 'libs' for the jars to use offline

### DOX

```
* @JacksonInject - Used to indicate that a property of a class should be injected during deserialization from an external source rather than being obtained from the JSON data. T
* @JsonAlias -  @JsonAlias({"name", "full_name"})
* @JsonAnyGetter - Marks a method as a getter for "extra" properties not bound to regular fields. Useful for dynamic properties.
* @JsonAnySetter - Marks a method as a setter for "extra" properties not bound to regular fields. Useful for dynamic properties.
* @JsonAutoDetect - Specifies the visibility rules for fields and methods to be automatically detected by Jackson during serialization and deserialization.
* @JsonBackReference - Marks a property that should be ignored during serialization and is used to prevent cyclic dependencies.
* @JsonClassDescription
* @JsonCreator - Used on constructor or factory methods to indicate which method should be used for instantiating objects during deserialization.
* @JsonDeserialize - Specifies a custom deserializer for a property.
* @JsonEnumDefaultValue
* @JsonFilter() - First, we need to define the filter on our entity. Then, we need to define our custom PropertyFilter:
* @JsonFormat - This annotation specifies the format to use during serialization and deserialization. 
It can be applied to date, time, and number fields. @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
* @JsonGetter - These annotations allow you to specify custom methods for setting and getting property values during serialization and deserialization.
* @JsonIdentityInfo()
* @JsonIdentityReference
* @JsonIgnore - This annotation is used to exclude a property from serialization and deserialization.
* @JsonIgnoreProperties -  Defines a list of property names to be ignored during serialization and deserialization.
* @JsonIgnoreType - Excludes a type from being considered during serialization and deserialization.
* @JsonInclude - This annotation controls which fields should be included during serialization based on their values.
@JsonInclude(JsonInclude.Include.NON_NULL)
* @JsonIncludeProperties
* @JsonKey
* @JsonManagedReference - Used to indicate that a property is part of a bi-directional relationship and should be serialized.
* @JsonMerge
* @JsonProperty("full_name") - This annotation is used to specify the name of the property in JSON. It can be applied to 
fields or getter methods.
* @JsonPropertyDescription
* @JsonPropertyOrder({"first", "second"}) - Specifies the order in which properties should be serialized.
* @JsonRawValue - Indicates that the property value should be serialized as a raw JSON value, without escaping.
* @JsonRootName() - Specifies the root name to use during serialization and deserialization.
* @JsonSetter ...same
* @JsonSubTypes() - Provides information about subtypes of a polymorphic type for serialization and deserialization.
* @JsonTypeId
* @JsonTypeInfo() - Specifies information about how to handle polymorphic types during serialization and deserialization.
* @JsonTypeName - Used to indicate the type name that should be included in the JSON representation of a polymorphic type.
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Dog.class, name = "dog"),
    @JsonSubTypes.Type(value = Cat.class, name = "cat")
})
* @JsonUnwrapped - Used to indicate that properties of another object should be "unwrapped" and included directly as 
properties of the containing object during serialization and deserialization. 
* @JsonValue - Indicates that a method should be used to serialize a value of an enumeration.
* @JsonView -  Used to define different views of a class's properties for serialization. @JsonView(Views.Public.class)
```