package org.azerciard.paymentservice.domain.model.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Data
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)

public class ErrorResult<T>  extends BaseResult<T> {

    public ErrorResult(String messages, int statusCode, T data) {
        super(messages, statusCode, false, data);
    }
    public ErrorResult(String messages, T data) {
        super(messages, 400, false, data);
    }
    public ErrorResult(String messages ) {
        super(messages, 400, false, null);
    }

}
