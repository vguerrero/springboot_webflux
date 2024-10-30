package com.vmgs.reactor.webflux_demo.mapper;

import com.vmgs.reactor.webflux_demo.model.User;
import com.vmgs.reactor.webflux_demo.response.UserRequest;
import com.vmgs.reactor.webflux_demo.response.UserResponse;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface UserMapper {
    UserResponse toUserResponse(User destination);
    User toUser(UserRequest request);
}
