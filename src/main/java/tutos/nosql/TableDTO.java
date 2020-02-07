package tutos.nosql;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class TableDTO extends TableBase{

    @Builder
    public TableDTO(String id, String name, String species, String breed) {
        super(id, name, species, breed);
    }

    @Data
    @NoArgsConstructor
    public static class All {
        private List<TableDTO> all;

        @Builder
        public All(List<TableDTO> all) {
            this.all = all;
        }

    }
}
