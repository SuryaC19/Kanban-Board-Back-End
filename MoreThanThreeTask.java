package com.niit.KanbanBoardService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT,reason = "More than three task assigned to user")
public class MoreThanThreeTask extends Exception{
}
