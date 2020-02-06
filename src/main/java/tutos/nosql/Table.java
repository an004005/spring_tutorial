package tutos.nosql;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

@NoArgsConstructor
@Document(collection = "test")
public class Table extends TableBase {
    @Builder
    public Table(String id, String name, String species, String breed){
        super(id, name, species, breed);
    }
}
