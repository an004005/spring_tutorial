package tutos.rsql;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tutos.nosql.TableDTO;

import java.util.List;

@Data
public class ApiTableDTO {
    protected Integer userNo;
    protected String userId;
    protected String userTel;

    @Builder
    public ApiTableDTO(Integer userNo, String userTel, String userId) {
        this.userNo = userNo;
        this.userId = userId;
        this.userTel = userTel;
    }

    @Data
    @NoArgsConstructor
    public static class All{
        List<ApiTableDTO> all;

        @Builder
        public All(List<ApiTableDTO> all){
            this.all = all;
        }
    }

}
