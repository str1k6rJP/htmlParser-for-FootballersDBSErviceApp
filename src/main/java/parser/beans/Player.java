package parser.beans;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({"surname", "role", "teamId"})
public class Player {

    private int id;

    private String surname;

    private String role;

    private int teamId;

   /* public Player(String surname, String role, int id) {
        setSurname(surname);
        setRole(role);
        setId(id);
    }*/

    @JsonCreator
    public Player(@JsonProperty("surname") String surname
            , @JsonProperty("role") String role
            , @JsonProperty("teamId") int teamId) {
        setSurname(surname);
        setRole(role);
        setTeamId(teamId);
    }
}