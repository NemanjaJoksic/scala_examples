package example.json

import com.fasterxml.jackson.annotation.JsonInclude.Include
import com.fasterxml.jackson.annotation.{JsonIgnoreProperties, JsonInclude, JsonProperty}

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
case class Package(
    @JsonProperty("id") id: Int,
    @JsonProperty("sender") sender: String,
    @JsonProperty("created-at") createdAt: String
)
