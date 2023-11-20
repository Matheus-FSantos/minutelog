package io.github.MatheusFSantos.MinuteLog.model.exception.specializations;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;

import io.github.MatheusFSantos.MinuteLog.model.exception.MinuteLogExceptions;

public class UserNotFound extends MinuteLogExceptions {
	
	private static final long serialVersionUID = 1L;
	
	public UserNotFound(String message, String shortDescription) {
		super(UUID.randomUUID(), message, HttpStatus.NOT_FOUND, shortDescription, LocalDateTime.now());
	}
	
	public UserNotFound(List<String> messages, String shortDescription) {
		super(UUID.randomUUID(), messages, HttpStatus.NOT_FOUND, shortDescription, LocalDateTime.now());
	}

}
