package com.santander.bootcamp.exception;

import com.santander.bootcamp.util.MessageUtils;

public class NotFoundException extends RuntimeException {

    public NotFoundException () {
        super(MessageUtils.NO_RECORDS_FOUND);
    }

}
