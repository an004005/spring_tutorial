package tutos.rsql;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "test")
@Getter
@Setter
@NoArgsConstructor()
public class ApiTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT", nullable = false)
    private Integer userNo;

    @Column(name = "USER_ID", columnDefinition = "VARCHAR(30)")
    private String userId;

    @Column(name = "USER_TEL", columnDefinition = "VARCHAR(15)")
    private String userTel;

    @Builder
    public ApiTable(Integer userNo, String userId, String userTel){
        this.userNo = userNo;
        this.userId = userId;
        this.userTel = userTel;
    }

}
