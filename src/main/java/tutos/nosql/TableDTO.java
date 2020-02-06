package tutos.nosql;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class TableDTO{

    public static class One extends TableBase {
        @Builder
        public One(String id, String name, String species, String breed) {
            super(id, name, species, breed);
        }
    }

    @Data
    @NoArgsConstructor
    public static class All {
        private List<One> all;

        public All(List<One> all) { this.all = all; }
    }
}
