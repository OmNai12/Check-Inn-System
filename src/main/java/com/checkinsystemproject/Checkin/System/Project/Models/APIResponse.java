package com.checkinsystemproject.Checkin.System.Project.Models;

public class APIResponse<T> {
    private int status;
    private String message;
    private T data;

    private APIResponse(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() { return status; }
    public String getMessage() { return message; }
    public T getData() { return data; }

    public static <T> APIResponse<T> of(int status, String message, T data) {
        return new APIResponse<>(status, message, data);
    }
}
