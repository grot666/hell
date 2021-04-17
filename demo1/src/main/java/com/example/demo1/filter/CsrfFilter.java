package com.example.demo1.filter;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class CsrfFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
