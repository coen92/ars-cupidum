package com.coen92.projects.web.arscupidum.reviewservice.exception;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RequiredArgsConstructor
@Slf4j
@ControllerAdvice
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class CustomExceptionHandlers extends ResponseEntityExceptionHandler {

}
