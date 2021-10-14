package ai.ecma.apppayme.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaycomRequestForm {

    private String method;

    private Params params;
}
