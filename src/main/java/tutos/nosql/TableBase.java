package tutos.nosql;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
public abstract class TableBase {
    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("species")
    private String species;

    @Field("breed")
    private String breed;

    public TableBase(String id, String name, String species, String breed){
        this.id = id;
        this.name = name;
        this.species = species;
        this.breed = breed;
    }
}
