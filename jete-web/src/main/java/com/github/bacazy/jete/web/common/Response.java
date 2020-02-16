package com.github.bacazy.jete.web.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    String message;
    int status = 200;
    Object value;
}
