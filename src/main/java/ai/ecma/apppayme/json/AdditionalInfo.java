package ai.ecma.apppayme.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class AdditionalInfo {

    private Long orderId;

    private Integer orderSum;

    private String site = "pdp.uz";

    public AdditionalInfo(Long orderId, Integer orderSum) {
        this.orderId = orderId;
        this.orderSum = orderSum;
    }
}
